package com.cy.entity;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Gift {
	private Integer id;	//礼品id
	private Integer giftIntegral;	//礼品积分
	private String giftName;	//礼品名称
	private Integer giftNumber;	//礼品数量
	private Integer giftPrice;	//礼品价格
}
