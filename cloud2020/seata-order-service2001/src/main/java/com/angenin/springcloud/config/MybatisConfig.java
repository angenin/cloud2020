package com.angenin.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @package_name: com.angenin.springcloud.config
 * @name: MybatisConfig
 * @author: angenin
 * @dateTime: 2020/6/29 9:57 下午
 **/
@MapperScan("com.angenin.springcloud.dao")
@Configuration
public class MybatisConfig {
}
