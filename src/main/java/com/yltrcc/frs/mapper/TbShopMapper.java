package com.yltrcc.frs.mapper;

import com.yltrcc.frs.module.ShopRequest;
import com.yltrcc.frs.module.UserRequest;
import com.yltrcc.frs.module.entity.TbShop;
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
public interface TbShopMapper {

    List<TbShop> query(ShopRequest shopRequest);

    int queryCount(ShopRequest shopRequest);

    TbShop getShopById(ShopRequest shopRequest);
}
