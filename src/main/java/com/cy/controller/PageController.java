package com.cy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 页面跳转类 
 */
@Controller
public class PageController {

	@RequestMapping("/{pages}")
	public String doShowPage(@PathVariable String pages) {
		
		return pages;
	}
}