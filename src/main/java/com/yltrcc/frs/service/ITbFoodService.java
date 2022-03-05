package com.yltrcc.frs.service;

import com.yltrcc.frs.module.FoodRequest;
import com.yltrcc.frs.module.entity.TbFood;

import java.util.List;

/**
 * Package: com.yltrcc.frs.service
 * Date：2022-03-03
 * Time：20:36
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public interface ITbFoodService {
    List<TbFood> query(FoodRequest foodRequest);

    int queryCount(FoodRequest foodRequest);
}
