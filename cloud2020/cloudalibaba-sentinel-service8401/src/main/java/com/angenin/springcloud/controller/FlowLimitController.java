package com.angenin.springcloud.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.angenin.springcloud.serivce.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.TimeUnit;

/**
 * @package_name: com.angenin.springcloud.controller
 * @name: FlowLimitController
 * @author: angenin
 * @dateTime: 2020/6/27 8:22 下午
 **/
@RestController
@Slf4j
public class FlowLimitController {

//    @Resource
//    TestService testService;

    @GetMapping("/testA")
    public String testA() {
//        testService.getTest();
        return "----testA";
    }

    @GetMapping("/testB")
    public String testB() {
//        testService.getTest();
        log.info(Thread.currentThread().getName() + "\t ...testB");
        return "----testB";
    }

    @GetMapping("/testD")
    public String testD() {
//        try {
//            TimeUnit.SECONDS.sleep(1);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        log.info("testD 测试RT");


        log.info("testD 异常比例");
        int age = 10 / 0;   //百分百出错

        return "----testD";
    }

    @GetMapping("/testE")
    public String testE() {
        log.info("testE 测试异常数");
        int age = 10 / 0;
        return "----testE 测试异常数";
    }

    @GetMapping("/testHotKey")
    @SentinelResource(value = "testHotKey", blockHandler = "deal_testHotKey")
    public String testHotKey(@RequestParam(value = "p1", required = false)String p1,
                             @RequestParam(value = "p2", required = false)String p2) {
//        int i = 1 / 0;
        return "----testHotKey";
    }

    //兜底方法
    public String deal_testHotKey(String p1, String p2, BlockException exception) {
        // sentinel的默认提示都是： Blocked by Sentinel (flow limiting)
        return "----deal_testHotKey, o(╥﹏╥)o";
    }

}
