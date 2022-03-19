package com.yltrcc.frs.mapper;

import com.yltrcc.frs.module.CategoryRequest;
import com.yltrcc.frs.module.CommentRequest;
import com.yltrcc.frs.module.entity.TbCategory;
import com.yltrcc.frs.module.entity.TbComment;
import com.yltrcc.frs.module.entity.TbUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Package: com.yltrcc.frs.mapper
 * Date：2022-03-04
 * Time：20:55
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@Mapper
public interface TbCommentMapper {

    List<TbComment> getComment(CommentRequest commentRequest);

    Integer saveComment(TbComment tbComment);

}
