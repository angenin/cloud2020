package com.angenin.springcloud.service;

import com.angenin.springcloud.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @package_name: com.angenin.springcloud.service
 * @name: StorageService
 * @author: angenin
 * @dateTime: 2020/6/29 9:28 下午
 **/
@FeignClient(value = "seata-storage-service")
public interface StorageService {

    @PostMapping(value = "/storage/decrease")
    CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
