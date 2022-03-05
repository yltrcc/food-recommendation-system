package com.yltrcc.frs.mapper;

import com.yltrcc.frs.module.LikeRequest;
import com.yltrcc.frs.module.entity.TbFood;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Package: com.yltrcc.frs.dao
 * Date：2022-03-04
 * Time：20:38
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@Mapper
public interface TbLikeMapper {

    List<TbFood> query(LikeRequest likeRequest);

    int queryCount(LikeRequest likeRequest);
}
