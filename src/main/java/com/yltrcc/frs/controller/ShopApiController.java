package com.yltrcc.frs.controller;

import com.yltrcc.frs.module.ApiResponse;
import com.yltrcc.frs.module.ShopRequest;
import com.yltrcc.frs.module.UserRequest;
import com.yltrcc.frs.module.entity.TbFood;
import com.yltrcc.frs.module.entity.TbShop;
import com.yltrcc.frs.module.entity.TbUser;
import com.yltrcc.frs.module.entity.content;
import com.yltrcc.frs.service.ITbShopService;
import com.yltrcc.frs.service.ITbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Package: com.yltrcc.frs.controller
 * Date：2022-03-03
 * Time：19:18
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@RestController
@RequestMapping("/api/shop")
public class ShopApiController {

    @Autowired
    private ITbShopService tbShopService;

    @RequestMapping("/getShop")
    public ApiResponse<TbShop> getShop(ShopRequest shopRequest) {

        int page_size = shopRequest.getPage_size();
        int page_num = shopRequest.getPage_num();

        List<TbShop> list = tbShopService.query(shopRequest);

        //查询总记录数
        int total_count = tbShopService.queryCount(shopRequest);
        int total_page = total_count / page_size;
        total_page = (int) Math.floor(total_page);
        if (total_count % page_size != 0) {
            total_page += 1;
            total_page = (int) Math.ceil(total_page);
        }
        content<TbShop> content = new content<>(list);
        content.setCurrent_page(page_num);
        content.setPage_size(page_size);
        content.setTotal_count(total_count);
        content.setTotal_page(total_page);
        ApiResponse<TbShop> response = new ApiResponse<TbShop>(content);
        response.setSuccess(true);

        return response;
    }

    @RequestMapping("/getShopById")
    public ApiResponse<TbShop> getShopById(ShopRequest shopRequest) {


        TbShop tbShop = tbShopService.getShopById(shopRequest);


        ArrayList<TbShop> list = new ArrayList<TbShop>();
        list.add(tbShop);
        content<TbShop> content = new content<>(list);
        ApiResponse<TbShop> response = new ApiResponse<TbShop>(content);
        response.setSuccess(true);

        return response;
    }

    @RequestMapping("/updateShopById")
    public ApiResponse<TbShop> updateShopById(ShopRequest shopRequest) {


        tbShopService.updateShopById(shopRequest);


        ArrayList<TbShop> list = new ArrayList<TbShop>();
        content<TbShop> content = new content<>(list);
        ApiResponse<TbShop> response = new ApiResponse<TbShop>(content);
        response.setSuccess(true);

        return response;
    }
}
