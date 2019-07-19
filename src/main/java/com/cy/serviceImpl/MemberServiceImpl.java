package com.cy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.dao.MemberDao;
import com.cy.entity.Member;
import com.cy.exception.ServiceException;
import com.cy.service.MemberService;
import com.cy.vo.MemberStateObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class MemberServiceImpl implements MemberService {
	// 记录条数
	public static final int PAGE_SIZE = 3;
	
	@Autowired
	private MemberDao memberDao;
	
	/**
	 * 验证传入数据,修改会员状态
	 */
	@Override
	public int updateStateById(String id, String state) {
		int rows;
		Member member = new Member();
		member.setId(id);
		member.setState(state);
		// 更新会员状态
		try {
			rows = memberDao.updateByPrimaryKeySelective(member);
		} catch (Exception e) {
			throw new ServiceException("更新失败");
		}
		if (rows==0) {
			throw new ServiceException("会员记录可能已经不存在了");
		}
		return rows;
	}

	/**
	 * 返回会员状态修改分页信息
	 */
	@Override
	public PageInfo<Member> findMemberStateObjects(Integer currentPage, String memberName) {
		PageHelper.startPage(currentPage, PAGE_SIZE);
		List<Member> list = memberDao.findMemberStateObjects(currentPage, memberName);
		PageInfo<Member> info = new PageInfo<>(list);
		return info;
	}
	
	/**
	 * 根据会员id删除会员信息
	 */
	@Override
	public int deleteObjectById(String id) {
		// 删除会员信息
		int rows = 0;
		try {
			rows = memberDao.deleteByPrimaryKey(id);
		} catch (Exception e) {
			throw new ServiceException("删除失败");
		}
		
		if (rows==0) {
			throw new ServiceException("会员记录可能已经不存在了");
		}
		return rows;
	}


}
