package com.angenin.springcloud.serivce;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import org.springframework.stereotype.Service;

/**
 * @package_name: com.angenin.springcloud.serivce
 * @name: TestService
 * @author: angenin
 * @dateTime: 2020/6/27 9:36 下午
 **/
//@Service
public class TestService {

    @SentinelResource("getTest")
    public void getTest(){
    System.out.println("getTest...");
    }

}
