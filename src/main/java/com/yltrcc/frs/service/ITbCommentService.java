package com.yltrcc.frs.service;

import com.yltrcc.frs.module.CategoryRequest;
import com.yltrcc.frs.module.CommentRequest;
import com.yltrcc.frs.module.entity.TbCategory;
import com.yltrcc.frs.module.entity.TbComment;
import com.yltrcc.frs.module.entity.TbUser;

import java.util.List;

/**
 * Package: com.yltrcc.frs.dao
 * Date：2022-03-04
 * Time：20:53
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
public interface ITbCommentService {


    List<TbComment> getComment(CommentRequest commentRequest);

    Integer saveComment(TbComment tbComment);

    void deleteFoodById(TbComment tbComment);
}
