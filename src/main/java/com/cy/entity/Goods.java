package com.cy.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Goods {

	Integer id;
	String commodityIntegral; //商品积分
	String commodityName; //商品名称
	String commodityNumber;//商品数量
	String commodityPrice;//商品价格
	
}
