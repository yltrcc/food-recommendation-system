package com.yltrcc.frs.controller;

import com.yltrcc.frs.module.ShopRequest;
import com.yltrcc.frs.module.entity.*;
import com.yltrcc.frs.service.ITbUserService;
import com.yltrcc.frs.module.UserRequest;
import com.yltrcc.frs.module.ApiResponse;
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
public class UserApiController {

    @Autowired
    private ITbUserService tbUserService;

    @RequestMapping("/api/getUser")
    public ApiResponse<TbUser> getUser(UserRequest userRequest) {


        List<TbUser> list = tbUserService.query(userRequest);


        content<TbUser> content = new content<>(list);
        ApiResponse<TbUser> response = new ApiResponse<TbUser>(content);
        response.setSuccess(true);

        return response;
    }
    @RequestMapping("/api/getUserByShopId")
    public ApiResponse<TbUser> getUserByShopId(UserRequest userRequest) {

        int page_size = userRequest.getPage_size();
        int page_num = userRequest.getPage_num();

        List<TbUser> list = tbUserService.getShopByUserId(userRequest);

        //查询总记录数
        int total_count = tbUserService.queryShopCountByUserId(userRequest);
        int total_page = total_count / page_size;
        total_page = (int) Math.floor(total_page);
        if (total_count % page_size != 0) {
            total_page += 1;
            total_page = (int) Math.ceil(total_page);
        }
        content<TbUser> content = new content<>(list);
        content.setCurrent_page(page_num);
        content.setPage_size(page_size);
        content.setTotal_count(total_count);
        content.setTotal_page(total_page);
        ApiResponse<TbUser> response = new ApiResponse<TbUser>(content);
        response.setSuccess(true);

        return response;
    }


    @RequestMapping("/api/login")
    public ApiResponse<TbUser> login(UserRequest userRequest) {


        List<TbUser> list = tbUserService.login(userRequest);

        content<TbUser> content = new content<>(list);
        ApiResponse<TbUser> response = new ApiResponse<TbUser>(content);
        response.setSuccess(true);
        return response;
    }

    @RequestMapping("/api/statisticsUser")
    public ApiResponse<TbUser> statisticsUser(UserRequest userRequest) {

        userRequest.setType("0");
        int userCount = tbUserService.statisticsUser(userRequest);
        TbUser user = new TbUser();
        user.setCount(userCount);
        List<TbUser> list = new ArrayList<>();
        list.add(user);
        content<TbUser> content = new content<>(list);
        ApiResponse<TbUser> response = new ApiResponse<TbUser>(content);
        response.setSuccess(true);
        return response;

    }

    @RequestMapping("/api/statisticsShop")
    public ApiResponse<TbUser> statisticsShop(UserRequest userRequest) {
        userRequest.setType("1");
        int shopCount = tbUserService.statisticsShop(userRequest);
        TbUser user = new TbUser();
        user.setCount(shopCount);
        List<TbUser> list = new ArrayList<>();
        list.add(user);
        content<TbUser> content = new content<>(list);
        ApiResponse<TbUser> response = new ApiResponse<TbUser>(content);
        response.setSuccess(true);
        return response;

    }


    @RequestMapping("/api/saveUser")
    public ApiResponse<TbUser> saveUser(TbUser tbUser) {

        tbUser.setAddTime(new Date());
        tbUser.setUserPortrait("https://thirdwx.qlogo.cn/mmopen/vi_32/gFyat8RanSGowFN0twibBfCUI42uqelMs5kyoMd0rib6JMM7pC7pibSAUV8AR3KfyTic4FQiaObyuGvw8NchPJz2HmA/132");
        tbUserService.saveUser(tbUser);

        List<TbUser> list = new ArrayList<>();
        content<TbUser> content = new content<TbUser>(list);
        ApiResponse<TbUser> response = new ApiResponse<TbUser>(content);
        response.setSuccess(true);
        return response;

    }

    @RequestMapping("/api/updateUser")
    public ApiResponse<TbUser> updateUser(TbUser tbUser) {

        tbUserService.updateUser(tbUser);

        List<TbUser> list = new ArrayList<>();
        content<TbUser> content = new content<TbUser>(list);
        ApiResponse<TbUser> response = new ApiResponse<TbUser>(content);
        response.setSuccess(true);
        return response;

    }

    @RequestMapping("/api/deleteFoodById")
    public ApiResponse<TbUser> deleteFoodById(TbUser tbUser) {

        tbUserService.deleteFoodById(tbUser);

        List<TbUser> list = new ArrayList<>();
        content<TbUser> content = new content<>(list);
        ApiResponse<TbUser> response = new ApiResponse<TbUser>(content);
        response.setSuccess(true);
        return response;

    }
}
