package com.yltrcc.frs.service;

import com.yltrcc.frs.module.LikeRequest;
import com.yltrcc.frs.module.entity.TbFood;

import java.util.List;

/**
 * Package: com.yltrcc.frs.service
 * Date：2022-03-04
 * Time：20:37
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public interface ITbLikeService {

    List<TbFood> query(LikeRequest likeRequest);

    int queryCount(LikeRequest likeRequest);
}
