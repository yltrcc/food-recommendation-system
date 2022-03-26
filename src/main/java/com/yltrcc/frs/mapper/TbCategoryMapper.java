package com.yltrcc.frs.mapper;

import com.yltrcc.frs.module.CategoryRequest;
import com.yltrcc.frs.module.UserRequest;
import com.yltrcc.frs.module.entity.TbCategory;
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
public interface TbCategoryMapper {

    List<TbUser> query(CategoryRequest categoryRequest);

    int queryCount(CategoryRequest categoryRequest);

    List<TbUser> getShopByUserId(CategoryRequest categoryRequest);

    int queryShopCountByUserId(CategoryRequest categoryRequest);

    List<TbCategory> getCategoryByShopId(CategoryRequest categoryRequest);

    void updateCategoryById(CategoryRequest categoryRequest);

    void saveCategory(TbCategory tbCategory);
}
