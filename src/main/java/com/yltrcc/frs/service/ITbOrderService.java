package com.yltrcc.frs.service;

import com.yltrcc.frs.module.ShopRequest;
import com.yltrcc.frs.module.entity.TbOrder;
import com.yltrcc.frs.module.entity.TbShop;

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
public interface ITbOrderService {

    void saveOrder(TbOrder tbOrder);

    int statisticsOrder(TbOrder tbOrder);
}
