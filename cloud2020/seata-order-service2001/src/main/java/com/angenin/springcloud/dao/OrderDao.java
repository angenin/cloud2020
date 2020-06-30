package com.angenin.springcloud.dao;

import com.angenin.springcloud.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @package_name: com.angenin.springcloud.dao
 * @name: OrderDao
 * @author: angenin
 * @dateTime: 2020/6/29 8:59 下午
 **/
@Mapper
public interface OrderDao {

    //1 新建订单
    int create(Order order);

    //2 修改订单状态,从0改为1
    int update(@Param("userId") Long userId, @Param("status") Integer status);

}
