package com.yltrcc.frs.controller;

import com.yltrcc.frs.module.ApiResponse;
import com.yltrcc.frs.module.ShopRequest;
import com.yltrcc.frs.module.entity.TbComment;
import com.yltrcc.frs.module.entity.TbOrder;
import com.yltrcc.frs.module.entity.TbShop;
import com.yltrcc.frs.module.entity.content;
import com.yltrcc.frs.service.ITbOrderService;
import com.yltrcc.frs.service.ITbShopService;
import com.yltrcc.frs.utils.ViolationDetectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
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
@RequestMapping("/api/order")
public class OrderApiController {

    @Autowired
    private ITbShopService tbShopService;

    @Autowired
    private ITbOrderService tbOrderService;

    @RequestMapping("/saveOrder")
    public ApiResponse<TbOrder> saveOrder(TbOrder tbOrder) {

        tbOrder.setTimestamp(new Date().getDate());
        tbOrderService.saveOrder(tbOrder);

        List<TbOrder> list = new ArrayList<>();
        content<TbOrder> content = new content<>(list);
        ApiResponse<TbOrder> response = new ApiResponse<TbOrder>(content);
        response.setSuccess(true);
        return response;

    }


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

    @RequestMapping("/statisticsOrder")
    public ApiResponse<TbOrder> statisticsOrder(TbOrder tbOrder) {

        int totalPrice = tbOrderService.statisticsOrder(tbOrder);
        TbOrder order = new TbOrder();
        order.setTotalPrice(totalPrice);
        List<TbOrder> list = new ArrayList<>();
        list.add(order);
        content<TbOrder> content = new content<>(list);
        ApiResponse<TbOrder> response = new ApiResponse<TbOrder>(content);
        response.setSuccess(true);
        return response;

    }


}
