package com.angenin.springcloud.service;

import java.math.BigDecimal;

/**
 * @package_name: com.angenin.springcloud.service
 * @name: AccountService
 * @author: angenin
 * @dateTime: 2020/6/30 10:52 上午
 **/
public interface AccountService {

    void decrease(Long userId, BigDecimal money);

}
