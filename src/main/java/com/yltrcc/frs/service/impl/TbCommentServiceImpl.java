package com.yltrcc.frs.service.impl;

import com.yltrcc.frs.mapper.TbCategoryMapper;
import com.yltrcc.frs.mapper.TbCommentMapper;
import com.yltrcc.frs.module.CategoryRequest;
import com.yltrcc.frs.module.CommentRequest;
import com.yltrcc.frs.module.entity.TbCategory;
import com.yltrcc.frs.module.entity.TbComment;
import com.yltrcc.frs.module.entity.TbUser;
import com.yltrcc.frs.service.ITbCategoryService;
import com.yltrcc.frs.service.ITbCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
public class TbCommentServiceImpl implements ITbCommentService {

    @Autowired
    private TbCommentMapper commentMapper;

    @Override
    public List<TbComment> getComment(CommentRequest commentRequest) {
        return commentMapper.getComment(commentRequest);
    }

    @Override
    public Integer saveComment(TbComment tbComment) {
        return commentMapper.saveComment(tbComment);
    }

    @Override
    public void deleteFoodById(TbComment tbComment) {
        commentMapper.deleteFoodById(tbComment);
    }
}
