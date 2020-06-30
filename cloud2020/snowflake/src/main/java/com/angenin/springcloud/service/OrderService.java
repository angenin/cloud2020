package com.angenin.springcloud.service;

import com.angenin.springcloud.util.IdGeneratorSnowflake;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @package_name: com.angenin.springcloud.service
 * @name: OrderService
 * @author: angenin
 * @dateTime: 2020/6/30 5:02 下午
 **/
@Service
public class OrderService {

    @Autowired
    private IdGeneratorSnowflake idGenerator;

    public String getIDBySnowFlake() {
        //新建线程池（5个线程）
        ExecutorService threadPool = Executors.newFixedThreadPool(5);

        for (int i = 1; i <= 20; i++) {
            threadPool.submit(() -> {
                System.out.println(idGenerator.snowflakeId());
            });
        }

        threadPool.shutdown();

        return "hello snowflake";
    }
}
