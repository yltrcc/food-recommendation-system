package com.yltrcc.frs.controller;

import com.yltrcc.frs.module.ApiResponse;
import com.yltrcc.frs.module.CategoryRequest;
import com.yltrcc.frs.module.ShopRequest;
import com.yltrcc.frs.module.UserRequest;
import com.yltrcc.frs.module.entity.*;
import com.yltrcc.frs.service.ITbCategoryService;
import com.yltrcc.frs.service.ITbUserService;
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
@RequestMapping("/api/category")
public class CategoryApiController {

    @Autowired
    private ITbCategoryService categoryService;

    @RequestMapping("/getCategoryByShopId")
    public ApiResponse<TbCategory> getCategoryByShopId(CategoryRequest categoryRequest) {


        List<TbCategory> list = categoryService.getCategoryByShopId(categoryRequest);


        content<TbCategory> content = new content<>(list);
        ApiResponse<TbCategory> response = new ApiResponse<TbCategory>(content);
        response.setSuccess(true);

        return response;
    }

    @RequestMapping("/updateCategoryById")
    public ApiResponse<TbCategory> updateCategoryById(CategoryRequest categoryRequest) {


        categoryService.updateCategoryById(categoryRequest);


        ArrayList<TbCategory> list = new ArrayList<TbCategory>();
        content<TbCategory> content = new content<>(list);
        ApiResponse<TbCategory> response = new ApiResponse<TbCategory>(content);
        response.setSuccess(true);

        return response;
    }

    @RequestMapping("/saveCategory")
    public ApiResponse<TbCategory> saveCategory(TbCategory tbCategory) {


        tbCategory.setCategoryDescribe("一个人也要享受生活");
        categoryService.saveCategory(tbCategory);

        List<TbCategory> list = new ArrayList<>();
        content<TbCategory> content = new content<>(list);
        ApiResponse<TbCategory> response = new ApiResponse<TbCategory>(content);
        response.setSuccess(true);
        return response;
    }

    @RequestMapping("/deleteCategoryById")
    public ApiResponse<TbCategory> deleteCategoryById(TbCategory tbCategory) {


        categoryService.deleteCategoryById(tbCategory);

        List<TbCategory> list = new ArrayList<>();
        content<TbCategory> content = new content<>(list);
        ApiResponse<TbCategory> response = new ApiResponse<TbCategory>(content);
        response.setSuccess(true);
        return response;
    }

}
