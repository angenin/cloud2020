package com.angenin.springcloud.controller;

import com.angenin.springcloud.domain.CommonResult;
import com.angenin.springcloud.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @package_name: com.angenin.springcloud.controller
 * @name: AccountController
 * @author: angenin
 * @dateTime: 2020/6/30 10:59 上午
 **/
@RestController
public class AccountController {

    @Resource
    private AccountService accountService;

    @RequestMapping("/account/decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money){
        accountService.decrease(userId, money);
        return new CommonResult(200, "扣减库存成功!");
    }

}
