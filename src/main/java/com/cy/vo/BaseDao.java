package com.cy.vo;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 通用mapper 的 公用 mapper 接口
 * @author 15713
 *
 */
public interface BaseDao<T> extends Mapper<T>,MySqlMapper<T> {

}
