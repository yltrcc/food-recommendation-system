package com.yltrcc.frs.service;

import com.yltrcc.frs.module.FoodRequest;
import com.yltrcc.frs.module.ShopRequest;
import com.yltrcc.frs.module.UserRequest;
import com.yltrcc.frs.module.entity.TbFood;
import com.yltrcc.frs.module.entity.TbShop;
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
public interface ITbShopService {


    List<TbShop> query(ShopRequest shopRequest);

    int queryCount(ShopRequest shopRequest);

    TbShop getShopById(ShopRequest shopRequest);
}
