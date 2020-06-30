package com.angenin.springcloud.controller;

import com.angenin.springcloud.domain.CommonResult;
import com.angenin.springcloud.domain.Order;
import com.angenin.springcloud.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @package_name: com.angenin.springcloud.controller
 * @name: OrderController
 * @author: angenin
 * @dateTime: 2020/6/29 9:53 下午
 **/
@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order/create")
    public CommonResult create(Order order){
        orderService.create(order);
        return new CommonResult(200, "订单创建成功!");
    }
}
