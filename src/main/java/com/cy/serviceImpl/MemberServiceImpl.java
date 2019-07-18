package com.cy.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.dao.MemberDao;
import com.cy.exception.ServiceException;
import com.cy.service.MemberService;
import com.cy.vo.MemberState;
import com.sun.xml.internal.ws.api.model.MEP;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberDao memberDao;
	
	/**
	 * 验证传入数据,修改会员状态
	 */
	@Override
	public int updateStateById(String id, String state) {
		// id非空验证
		if (id==null) {
			throw new ServiceException("必须选择正确的会员id");
		}
		// 会员等级合法性验证
		try {
			Enum.valueOf(MemberState.class, state);
		} catch (Exception e) {
			throw new ServiceException("会员状态不正确");
		}
		
		int rows;
		// 更新会员状态
		try {
			rows = memberDao.updateStateById(id, state);
		} catch (Exception e) {
			throw new ServiceException("更新失败");
		}
		if (rows==0) {
			throw new ServiceException("会员记录可能已经不存在");
		}
		return rows;
	}

}
