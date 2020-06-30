package com.angenin.springcloud.serivce;

/**
 * @package_name: com.angenin.springcloud.serivce
 * @name: StorageService
 * @author: angenin
 * @dateTime: 2020/6/30 9:58 上午
 **/
public interface StorageService {

    void decrease(Long productId, Integer count);

}
