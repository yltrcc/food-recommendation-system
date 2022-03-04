package com.yltrcc.frs.controller;

import com.yltrcc.frs.entity.FoodRequest;
import com.yltrcc.frs.entity.TbFood;
import com.yltrcc.frs.entity.base.ApiResponse;
import com.yltrcc.frs.entity.base.content;
import com.yltrcc.frs.service.ITbFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.w3c.dom.stylesheets.LinkStyle;

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
@RequestMapping("/api")
public class OpenApiController {

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
}
