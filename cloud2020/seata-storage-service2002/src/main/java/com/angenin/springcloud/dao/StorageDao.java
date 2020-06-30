package com.angenin.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @package_name: com.angenin.springcloud.dao
 * @name: StorageDao
 * @author: angenin
 * @dateTime: 2020/6/30 9:48 上午
 **/
@Mapper
public interface StorageDao {

    void decrease(@Param("productId") Long productId, @Param("count") Integer count);

}
