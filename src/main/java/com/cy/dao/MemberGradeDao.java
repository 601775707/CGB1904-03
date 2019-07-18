package com.cy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberGradeDao {
	
	/**
	 * 查询name集合
	 * @return name字段集合
	 */
	List<String> findNames();
}
