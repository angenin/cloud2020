package com.angenin.springcloud.controller;

import com.angenin.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Slf4j
@RestController
public class OrderNacosController {

//    @Resource
//    private RestTemplate restTemplate;

    @Value("${service-url.nacos-user-service}")
    private String serverURL;

    @Resource
    private PaymentFeignService paymentFeignService;


//    @GetMapping("/consumer/payment/nacos/{id}")
//    public String paymentInfo(@PathVariable("id") Long id){
//        return restTemplate.getForObject(serverURL + "/payment/nacos/" + id, String.class);
//    }

    @GetMapping("/consumer/payment/feign/nacos/{id}")
    public String paymentInfo2(@PathVariable("id") Integer id){
        return paymentFeignService.getPayment(id);
    }

}
