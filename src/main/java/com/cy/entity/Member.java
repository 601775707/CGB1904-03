package com.cy.entity;

import java.util.Date;

import com.cy.vo.MemberState;

import lombok.Data;
import lombok.ToString;

/**
 * member实体类
 */
@Data
@ToString
public class Member {
	// 主键id
	private Integer id;
	// 余额
	private double balance;
	// 生日
	private Date birthday;
	// 积分
	private double memberIntegral;
	// 会员名
	private String memberName;
	// 密码
	private String password;
	// 盐值
	private String salt;
	// 手机
	private String phone;
	// 性别
	private String sex;
	// 会员状态,枚举
	private MemberState state;
	// 会员等级
	private Integer memberGradeId;
	// 邮箱
	private String email;
	// 头像图片url
	private String iconPath;
}
