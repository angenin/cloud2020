package com.angenin.springcloud.controller;

import com.angenin.springcloud.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @package_name: com.angenin.springcloud.controller
 * @name: OrderController
 * @author: angenin
 * @dateTime: 2020/6/30 5:02 下午
 **/
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/snowflake")
    public String index(){
        return orderService.getIDBySnowFlake();
    }

}
