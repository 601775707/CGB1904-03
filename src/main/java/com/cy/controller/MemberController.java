package com.cy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cy.service.MemberService;

@RestController
@RequestMapping("/")
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	/**
	 * 施工中
	 * @param id
	 * @param state
	 * @return
	 */
	@PostMapping("modifyMemberState")
	public String modifyMemberState(String id, String state) {
		int rows = memberService.updateStateById(id, state);
		System.out.println(rows);
		return "ok!!";
	}
	
}
