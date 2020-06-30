package com.angenin.springcloud.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @package_name: com.angenin.springcloud.domain
 * @name: Storage
 * @author: angenin
 * @dateTime: 2020/6/30 9:42 上午
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage {

    private Long id;

    private Long productId;

    private Integer total;

    private Integer used;

    private Integer residue;
}
