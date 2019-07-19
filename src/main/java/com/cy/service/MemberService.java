package com.cy.service;

import com.cy.entity.Member;
import com.github.pagehelper.PageInfo;

/**
 * Member接口
 */
public interface MemberService {

	int updateStateById(String id, String state);
	
	PageInfo<Member> findMemberStateObjects(Integer currentPage, String memberName);
	
	int deleteObjectById(String id);
}
