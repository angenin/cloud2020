package com.angenin.springcloud.service;

import com.angenin.springcloud.entities.CommonResult;
import com.angenin.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @package_name: com.angenin.springcloud.service
 * @name: PaymentFallbackService
 * @author: angenin
 * @dateTime: 2020/6/28 6:19 下午
 **/
@Component
public class PaymentFallbackService implements PaymentService{

    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(444,"服务降级返回，---PaymentFallbackService",new Payment(id,"ErrorSerial"));
    }
}
