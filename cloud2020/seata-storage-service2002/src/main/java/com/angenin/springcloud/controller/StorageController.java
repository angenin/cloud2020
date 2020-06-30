package com.angenin.springcloud.controller;

import com.angenin.springcloud.domain.CommonResult;
import com.angenin.springcloud.serivce.StorageService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @package_name: com.angenin.springcloud.controller
 * @name: StorageController
 * @author: angenin
 * @dateTime: 2020/6/30 10:22 上午
 **/
@RestController
public class StorageController {

    @Resource
    private StorageService storageService;

    @RequestMapping("/storage/decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count){
        storageService.decrease(productId, count);
        return new CommonResult(200, "扣减库存成功!");
    }

}
