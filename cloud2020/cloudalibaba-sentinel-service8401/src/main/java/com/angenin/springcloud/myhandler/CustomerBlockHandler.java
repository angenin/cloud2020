package com.angenin.springcloud.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.angenin.springcloud.entities.CommonResult;
import com.angenin.springcloud.entities.Payment;

/**
 * @package_name: com.angenin.springcloud.myhandler
 * @name: CustomerBlockHandler
 * @author: angenin
 * @dateTime: 2020/6/28 5:18 下午
 **/
public class CustomerBlockHandler {

    public static CommonResult handlerException(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义限流测试，Glogal handlerException ---- 1");
    }

    public static CommonResult handlerException2(BlockException exception) {
        return  new CommonResult(444,"按照客户自定义限流测试，Glogal handlerException ---- 2");
    }
}
