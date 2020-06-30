package com.angenin.springcloud.service;

import com.angenin.springcloud.entities.CommonResult;
import com.angenin.springcloud.entities.Payment;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @package_name: com.angenin.springcloud.service
 * @name: PaymentService
 * @author: angenin
 * @dateTime: 2020/6/28 6:20 下午
 **/
@FeignClient(value = "nacos-payment-provider",fallback = PaymentFallbackService.class)
public interface PaymentService {

    @GetMapping(value = "/paymentSQL/{id}")
    public CommonResult<Payment> paymentSQL(@PathVariable("id") Long id);

}
