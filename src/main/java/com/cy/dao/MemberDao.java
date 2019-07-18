package com.cy.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cy.entity.Member;
import com.cy.vo.BaseDao;

/**
 * Member类Dao 
 *
 */
@Mapper
public interface MemberDao extends BaseDao<Member> {
	
	
}
