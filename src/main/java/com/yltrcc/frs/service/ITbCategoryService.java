package com.yltrcc.frs.service;

import com.yltrcc.frs.module.CategoryRequest;
import com.yltrcc.frs.module.UserRequest;
import com.yltrcc.frs.module.entity.TbCategory;
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
public interface ITbCategoryService {


    List<TbUser> query(CategoryRequest categoryRequest);

    List<TbUser> getShopByUserId(CategoryRequest categoryRequest);

    int queryShopCountByUserId(CategoryRequest categoryRequest);

    List<TbCategory> getCategoryByShopId(CategoryRequest categoryRequest);

    void updateCategoryById(CategoryRequest categoryRequest);

    void saveCategory(TbCategory tbCategory);

    void deleteCategoryById(TbCategory tbCategory);
}
