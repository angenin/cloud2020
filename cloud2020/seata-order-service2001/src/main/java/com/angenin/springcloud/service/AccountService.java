package com.angenin.springcloud.service;

import com.angenin.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @package_name: com.angenin.springcloud.service
 * @name: AccountService
 * @author: angenin
 * @dateTime: 2020/6/29 9:29 下午
 **/
@FeignClient(value = "seata-account-service")
public interface AccountService {

    @PostMapping(value = "/account/decrease")
    CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money);

}
