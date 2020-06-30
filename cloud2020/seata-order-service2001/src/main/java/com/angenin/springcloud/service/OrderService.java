package com.angenin.springcloud.service;

import com.angenin.springcloud.domain.Order;

/**
 * @package_name: com.angenin.springcloud.service
 * @name: OrderService
 * @author: angenin
 * @dateTime: 2020/6/29 9:25 下午
 **/
public interface OrderService {

    void create(Order order);

}
