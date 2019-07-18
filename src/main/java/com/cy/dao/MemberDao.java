package com.cy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Member类Dao 
 *
 */
@Mapper
public interface MemberDao {
	
	/**
	 * 更新会员状态
	 * @param id 会员id
	 * @param state 会员状态
	 * @return 更新行数
	 */
	int updateStateById(
			@Param("id")String id, 
			@Param("state")String state);
	
}
