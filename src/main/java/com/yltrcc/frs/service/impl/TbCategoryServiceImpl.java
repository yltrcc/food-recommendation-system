package com.yltrcc.frs.service.impl;

import com.yltrcc.frs.mapper.TbCategoryMapper;
import com.yltrcc.frs.mapper.TbUserMapper;
import com.yltrcc.frs.module.CategoryRequest;
import com.yltrcc.frs.module.UserRequest;
import com.yltrcc.frs.module.entity.TbCategory;
import com.yltrcc.frs.module.entity.TbUser;
import com.yltrcc.frs.service.ITbCategoryService;
import com.yltrcc.frs.service.ITbUserService;
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
public class TbCategoryServiceImpl implements ITbCategoryService {

    @Autowired
    private TbCategoryMapper categoryMapper;


    @Override
    public List<TbUser> query(CategoryRequest categoryRequest) {
        return null;
    }

    @Override
    public List<TbUser> getShopByUserId(CategoryRequest categoryRequest) {
        return null;
    }

    @Override
    public int queryShopCountByUserId(CategoryRequest categoryRequest) {
        return 0;
    }

    @Override
    public List<TbCategory> getCategoryByShopId(CategoryRequest categoryRequest) {
        return categoryMapper.getCategoryByShopId(categoryRequest);
    }

    @Override
    @Transactional
    public void updateCategoryById(CategoryRequest categoryRequest) {
        categoryMapper.updateCategoryById(categoryRequest);
    }

    @Override
    public void saveCategory(TbCategory tbCategory) {
        categoryMapper.saveCategory(tbCategory);
    }

    @Override
    public void deleteCategoryById(TbCategory tbCategory) {
        categoryMapper.deleteCategoryById(tbCategory);

    }
}
