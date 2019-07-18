package com.cy.entity;

import java.io.Serializable;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;
import tk.mybatis.mapper.annotation.KeySql;

@Data
@ToString
@Table(name = "commodity")
public class Goods implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8509121998246850037L;
	
	@Id
	@KeySql(useGeneratedKeys = true)
	private String id;
	private String commodityIntegral; //商品积分
	private String commodityName; //商品名称
	private String commodityNumber;//商品数量
	private String commodityPrice;//商品价格
	
}
