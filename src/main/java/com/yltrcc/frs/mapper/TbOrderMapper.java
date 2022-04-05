package com.yltrcc.frs.mapper;

import com.yltrcc.frs.module.CommentRequest;
import com.yltrcc.frs.module.entity.TbComment;
import com.yltrcc.frs.module.entity.TbOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Package: com.yltrcc.frs.mapper
 * Date：2022-04-05
 * Time：15:14
 * Description：TODO
 *
 * @author yltrcc
 * @version 1.0
 */
@Mapper
public interface TbOrderMapper {


    void saveOrder(TbOrder tbOrder);

    int statisticsOrder(TbOrder tbOrder);
}
