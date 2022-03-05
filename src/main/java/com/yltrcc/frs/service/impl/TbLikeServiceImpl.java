package com.yltrcc.frs.service.impl;

import com.yltrcc.frs.module.LikeRequest;
import com.yltrcc.frs.mapper.TbLikeMapper;
import com.yltrcc.frs.module.entity.TbFood;
import com.yltrcc.frs.service.ITbLikeService;
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
public class TbLikeServiceImpl implements ITbLikeService {

    @Autowired
    private TbLikeMapper likeMapper;

    @Override
    public List<TbFood> query(LikeRequest likeRequest) {
        int page_num = (likeRequest.getPage_num() - 1) * likeRequest.getPage_size();
        likeRequest.setPage_num(page_num);
        return likeMapper.query(likeRequest);
    }

    @Override
    public int queryCount(LikeRequest likeRequest) {
        return likeMapper.queryCount(likeRequest);
    }
}
