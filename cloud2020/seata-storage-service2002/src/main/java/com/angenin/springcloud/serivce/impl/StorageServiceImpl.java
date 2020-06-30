package com.angenin.springcloud.serivce.impl;

import com.angenin.springcloud.dao.StorageDao;
import com.angenin.springcloud.serivce.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @package_name: com.angenin.springcloud.serivce.impl
 * @name: StorageServiceImpl
 * @author: angenin
 * @dateTime: 2020/6/30 9:58 上午
 **/
@Service
public class StorageServiceImpl implements StorageService {

    private static final Logger LOGGER = LoggerFactory.getLogger(StorageServiceImpl.class);

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count) {
        LOGGER.info("----> StorageService中扣减库存");
        storageDao.decrease(productId, count);
        LOGGER.info("----> StorageService中扣减库存完成");
    }
}
