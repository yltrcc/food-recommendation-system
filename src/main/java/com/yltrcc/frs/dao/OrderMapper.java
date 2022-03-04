package com.yltrcc.frs.dao;

import com.yltrcc.frs.entity.Order;
import com.yltrcc.frs.entity.Page;
import com.yltrcc.frs.entity.UserOrder;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
	/**
	 *   添加房屋订单
	 * @param order
	 * @return
	 */
	 public int addOrder(Order order);
	 /**
	  * 查询所有订单信息
	  * @return
	  */
	 public List<UserOrder> findAllOrder(Page page);
	 /**
	  * 查询所有订单数
	  * @return
	  */
	 public int getOrderCount(int uID);
	 /**
	  * 删除用户订单
	  * @param oID
	  * @return
	  */
	 public int deleteOrder(int oID);
	 
}
