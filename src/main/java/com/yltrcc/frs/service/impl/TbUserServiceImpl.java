package com.yltrcc.frs.service.impl;

import com.yltrcc.frs.module.entity.TbUser;
import com.yltrcc.frs.module.UserRequest;
import com.yltrcc.frs.mapper.TbUserMapper;
import com.yltrcc.frs.service.ITbUserService;
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
public class TbUserServiceImpl implements ITbUserService {

    @Autowired
    private TbUserMapper userMapper;

    @Override
    public List<TbUser> query(UserRequest userRequest) {
        return userMapper.query(userRequest);
    }

    @Override
    public List<TbUser> getShopByUserId(UserRequest userRequest) {
        int page_num = (userRequest.getPage_num() - 1) * userRequest.getPage_size();
        userRequest.setPage_num(page_num);
        return userMapper.getShopByUserId(userRequest);
    }

    @Override
    public int queryShopCountByUserId(UserRequest userRequest) {
        return userMapper.queryShopCountByUserId(userRequest);
    }


}
