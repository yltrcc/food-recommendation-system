package com.yltrcc.frs.controller;

import com.yltrcc.frs.module.ShopRequest;
import com.yltrcc.frs.module.entity.TbShop;
import com.yltrcc.frs.module.entity.TbUser;
import com.yltrcc.frs.service.ITbUserService;
import com.yltrcc.frs.module.UserRequest;
import com.yltrcc.frs.module.ApiResponse;
import com.yltrcc.frs.module.entity.content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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


        //TbUser tbUser = tbUserService.getUserByShopId(userRequest);


        ArrayList<TbUser> list = new ArrayList<TbUser>();
        //list.add(tbUser);
        content<TbUser> content = new content<>(list);
        ApiResponse<TbUser> response = new ApiResponse<TbUser>(content);
        response.setSuccess(true);

        return response;
    }

}
