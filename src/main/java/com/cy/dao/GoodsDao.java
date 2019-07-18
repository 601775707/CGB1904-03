package com.cy.dao;

import org.apache.ibatis.annotations.Mapper;
import com.cy.entity.Goods;
import com.cy.vo.BaseDao;

/**
 * 商品 dao
 * @author 15713
 *
 */

@Mapper
public interface GoodsDao extends BaseDao<Goods>{
	
}
