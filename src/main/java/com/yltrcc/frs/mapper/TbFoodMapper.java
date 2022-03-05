package com.yltrcc.frs.mapper;

import com.yltrcc.frs.module.FoodRequest;
import com.yltrcc.frs.module.entity.TbFood;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface TbFoodMapper {

	List<TbFood> query(FoodRequest foodRequest);

	int queryCount(FoodRequest foodRequest);
}
