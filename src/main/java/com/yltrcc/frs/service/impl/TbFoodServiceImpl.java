package com.yltrcc.frs.service.impl;

import com.yltrcc.frs.module.FoodRequest;
import com.yltrcc.frs.module.entity.TbFood;
import com.yltrcc.frs.mapper.TbFoodMapper;
import com.yltrcc.frs.service.ITbFoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Package: com.yltrcc.frs.service.impl
 * Date：2022-03-03
 * Time：20:38
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@Service
public class TbFoodServiceImpl  implements ITbFoodService {

    @Autowired
    private TbFoodMapper foodMapper;

    @Override
    public List<TbFood> query(FoodRequest foodRequest) {
        int page_num = (foodRequest.getPage_num() - 1) * foodRequest.getPage_size();
        foodRequest.setPage_num(page_num);
        return foodMapper.query(foodRequest);
    }

    @Override
    public int queryCount(FoodRequest foodRequest) {
        return foodMapper.queryCount(foodRequest);
    }
}
