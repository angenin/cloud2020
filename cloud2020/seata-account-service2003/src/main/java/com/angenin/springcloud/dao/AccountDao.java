package com.angenin.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @package_name: com.angenin.springcloud.dao
 * @name: AccountDao
 * @author: angenin
 * @dateTime: 2020/6/30 10:44 上午
 **/
@Mapper
public interface AccountDao {

    void decrease(@Param("userId") Long userId, @Param("money") BigDecimal money);

}
