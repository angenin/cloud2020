package com.angenin.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @package_name: com.angenin.springcloud.config
 * @name: MyBatisConfig
 * @author: angenin
 * @dateTime: 2020/6/30 11:25 上午
 **/
@Configuration
@MapperScan({"com.angenin.springcloud.dao"})
public class MyBatisConfig {
}
