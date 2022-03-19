package com.yltrcc.frs.controller;

import com.yltrcc.frs.module.FoodRequest;
import com.yltrcc.frs.module.entity.TbComment;
import com.yltrcc.frs.module.entity.TbFood;
import com.yltrcc.frs.module.ApiResponse;
import com.yltrcc.frs.module.entity.content;
import com.yltrcc.frs.service.ITbFoodService;
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
@RequestMapping("/api/food")
public class FoodApiController {

    @Autowired
    private ITbFoodService tbFoodService;

    @RequestMapping("/getFood")
    public ApiResponse<TbFood> getFood( FoodRequest foodRequest) {

        int page_size = foodRequest.getPage_size();
        int page_num = foodRequest.getPage_num();

        List<TbFood> list = tbFoodService.query(foodRequest);

        //查询总记录数
        int total_count = tbFoodService.queryCount(foodRequest);
        int total_page = total_count / page_size;
        total_page = (int) Math.floor(total_page);
        if (total_count % page_size != 0) {
            total_page += 1;
            total_page = (int) Math.ceil(total_page);
        }
        content<TbFood> content = new content<>(list);
        content.setCurrent_page(page_num);
        content.setPage_size(page_size);
        content.setTotal_count(total_count);
        content.setTotal_page(total_page);
        ApiResponse<TbFood> response = new ApiResponse<TbFood>(content);
        response.setSuccess(true);

        return response;
    }

    @RequestMapping("/saveFood")
    public ApiResponse<TbFood> saveFood(TbFood tbFood) {


        tbFood.setAdd_time(new Date());
        tbFood.setLikeCount(0);
        tbFood.setCommentCount(0);
        tbFood.setCollectCount(0);
        tbFood.setImg("https://inews.gtimg.com/newsapp_bt/0/14017146688/1000");
        tbFoodService.saveFood(tbFood);

        List<TbFood> list = new ArrayList<>();
        content<TbFood> content = new content<>(list);
        ApiResponse<TbFood> response = new ApiResponse<TbFood>(content);
        response.setSuccess(true);
        return response;

    }

    @RequestMapping("/updateFoodById")
    public ApiResponse<TbFood> updateFoodById(TbFood tbFood) {

        tbFood.setImg("https://inews.gtimg.com/newsapp_bt/0/14017146688/1000");
        tbFoodService.updateFoodById(tbFood);

        List<TbFood> list = new ArrayList<>();
        content<TbFood> content = new content<>(list);
        ApiResponse<TbFood> response = new ApiResponse<TbFood>(content);
        response.setSuccess(true);
        return response;

    }

    @RequestMapping("/deleteFoodById")
    public ApiResponse<TbFood> deleteFoodById(TbFood tbFood) {

        tbFoodService.deleteFoodById(tbFood);

        List<TbFood> list = new ArrayList<>();
        content<TbFood> content = new content<>(list);
        ApiResponse<TbFood> response = new ApiResponse<TbFood>(content);
        response.setSuccess(true);
        return response;

    }

}
