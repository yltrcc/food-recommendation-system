package com.yltrcc.frs.service.impl;

import com.yltrcc.frs.mapper.TbShopMapper;
import com.yltrcc.frs.mapper.TbUserMapper;
import com.yltrcc.frs.module.FoodRequest;
import com.yltrcc.frs.module.ShopRequest;
import com.yltrcc.frs.module.UserRequest;
import com.yltrcc.frs.module.entity.TbFood;
import com.yltrcc.frs.module.entity.TbShop;
import com.yltrcc.frs.module.entity.TbUser;
import com.yltrcc.frs.service.ITbShopService;
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
public class TbShopServiceImpl implements ITbShopService {

    @Autowired
    private TbShopMapper shopMapper;

    @Override
    public List<TbShop> query(ShopRequest shopRequest) {
        int page_num = (shopRequest.getPage_num() - 1) * shopRequest.getPage_size();
        shopRequest.setPage_num(page_num);
        return shopMapper.query(shopRequest);
    }

    @Override
    public int queryCount(ShopRequest shopRequest) {
        return shopMapper.queryCount(shopRequest);
    }

    @Override
    public TbShop getShopById(ShopRequest shopRequest) {
        return shopMapper.getShopById(shopRequest);
    }


}
