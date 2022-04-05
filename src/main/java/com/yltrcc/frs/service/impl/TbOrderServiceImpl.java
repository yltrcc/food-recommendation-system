package com.yltrcc.frs.service.impl;

import com.yltrcc.frs.mapper.TbCommentMapper;
import com.yltrcc.frs.mapper.TbOrderMapper;
import com.yltrcc.frs.module.CommentRequest;
import com.yltrcc.frs.module.entity.TbComment;
import com.yltrcc.frs.module.entity.TbOrder;
import com.yltrcc.frs.service.ITbCommentService;
import com.yltrcc.frs.service.ITbOrderService;
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
public class TbOrderServiceImpl implements ITbOrderService {

    @Autowired
    private TbOrderMapper orderMapper;


    @Override
    public void saveOrder(TbOrder tbOrder) {
        orderMapper.saveOrder(tbOrder);
    }

    @Override
    public int statisticsOrder(TbOrder tbOrder) {
        return orderMapper.statisticsOrder(tbOrder);
    }
}
