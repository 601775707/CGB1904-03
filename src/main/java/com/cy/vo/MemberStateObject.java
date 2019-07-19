package com.cy.vo;

import java.io.Serializable;

import javax.persistence.Id;

import lombok.Data;
import lombok.ToString;

/**
 * 修改会员状态菜单查询用vo 
 */
@Data
@ToString
public class MemberStateObject implements Serializable {
	private static final long serialVersionUID = 985139982714205781L;
	// 主键id
	@Id
	private String id;
	// 会员名
	private String memberName;
	// 会员状态
	private String state;
}
