package com.yltrcc.frs.mapper;

import com.yltrcc.frs.module.entity.TbFood;
import com.yltrcc.frs.module.entity.TbUser;
import com.yltrcc.frs.module.UserRequest;
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
public interface TbUserMapper {

    List<TbUser> query(UserRequest userRequest);

    int queryCount(UserRequest userRequest);

    List<TbUser> getShopByUserId(UserRequest userRequest);

    int queryShopCountByUserId(UserRequest userRequest);

    List<TbUser> login(UserRequest userRequest);

    int statisticsUser(UserRequest userRequest);

    int statisticsShop(UserRequest userRequest);

    void saveUser(TbUser tbUser);

    void deleteFoodById(TbUser tbUser);

    void updateUser(TbUser tbUser);
}
