package com.angenin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @package_name: com.angenin.springcloud
 * @name: OrderMain84
 * @author: angenin
 * @dateTime: 2020/6/28 6:02 下午
 **/
@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class OrderMain84 {

    public static void main(String[] args) {
        SpringApplication.run(OrderMain84.class,args);
    }
}
