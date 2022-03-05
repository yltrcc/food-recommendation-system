package com.yltrcc.frs.service;

import com.yltrcc.frs.module.entity.TbUser;
import com.yltrcc.frs.module.UserRequest;

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
public interface ITbUserService {


    List<TbUser> query(UserRequest userRequest);

}
