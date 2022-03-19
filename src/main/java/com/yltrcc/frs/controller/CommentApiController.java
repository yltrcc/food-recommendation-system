package com.yltrcc.frs.controller;

import com.yltrcc.frs.module.ApiResponse;
import com.yltrcc.frs.module.CategoryRequest;
import com.yltrcc.frs.module.CommentRequest;
import com.yltrcc.frs.module.entity.TbCategory;
import com.yltrcc.frs.module.entity.TbComment;
import com.yltrcc.frs.module.entity.content;
import com.yltrcc.frs.service.ITbCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Package: com.yltrcc.frs.controller
 * Date：2022-03-03
 * Time：19:18
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@RestController
@RequestMapping("/api/comment")
public class CommentApiController {

    @Autowired
    private ITbCommentService commentService;

    @RequestMapping("/getComment")
    public ApiResponse<TbComment> getComment(CommentRequest commentRequest) {


        List<TbComment> list = commentService.getComment(commentRequest);


        content<TbComment> content = new content<>(list);
        ApiResponse<TbComment> response = new ApiResponse<TbComment>(content);
        response.setSuccess(true);

        return response;
    }


    @RequestMapping("/saveComment")
    public ApiResponse<TbComment> saveComment(TbComment tbComment) {


        Integer index = commentService.saveComment(tbComment);

        if (index == 1) {
            List<TbComment> list = new ArrayList<>();
            content<TbComment> content = new content<>(list);
            ApiResponse<TbComment> response = new ApiResponse<TbComment>(content);
            response.setSuccess(true);
            return response;
        }else {
            List<TbComment> list = new ArrayList<>();
            content<TbComment> content = new content<>(list);
            ApiResponse<TbComment> response = new ApiResponse<TbComment>(content);
            response.setSuccess(false);
            return response;
        }



    }


}
