package com.cy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cy.entity.Member;
import com.cy.service.MemberService;
import com.cy.vo.JsonResult;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	/**
	 * 修改会员的状态
	 * @param id 会员id
	 * @param state 会员状态
	 * @return 成功信息
	 */
	@PostMapping("modifyMemberState")
	public JsonResult doModifyMemberState(String id, String state) {
		memberService.updateStateById(id, state);
		return new JsonResult("更新成功");
	}
	
    /**
     * 显示会员账号,会员名,当前状态
     * @param currentPage 当前页码
     * @return 页面数据
     */
    @PostMapping("queryMember")
    public JsonResult doQueryMember(Integer currentPage, String memberName) {
    	PageInfo<Member> info = memberService.findMemberStateObjects(currentPage, memberName);
		return new JsonResult(info);
    }
	
    /**
     * 删除会员信息
     * @param id 会员id
     * @return 成功信息
     */
    @PostMapping("deleteMember")
    public JsonResult doDeleteMember(String id) {
    	memberService.deleteObjectById(id);
    	return new JsonResult("删除成功");
    }
	
}
