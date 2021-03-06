package com.cy.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

/**
 * member实体类
 */
@Data
@ToString
@Table(name = "member")
public class Member implements Serializable {
	private static final long serialVersionUID = 6934858098744925993L;
	// 主键id
	@Id
	private String id;
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
	// 会员状态
	private String state;
	// 会员等级
	private Integer memberGradeId;
	// 邮箱
	private String email;
	// 头像图片url
	private String iconPath;
}
