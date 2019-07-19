package com.cy.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.cy.entity.Member;
import com.cy.vo.BaseDao;
import com.cy.vo.MemberStateObject;

/**
 * Member类Dao 
 *
 */
@Mapper
public interface MemberDao extends BaseDao<Member> {
	
	List<Member> findMemberStateObjects(
			@Param("currentPage")Integer currentPage, 
			@Param("memberName")String memberName);
}
