package com.cy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cy.entity.Goods;
import com.cy.service.GoodsService;
import com.github.pagehelper.PageInfo;

@RestController
public class GoodsController {

	@Autowired
	private GoodsService goodsService;
	
	@RequestMapping("/queryAllCommodity")
	public PageInfo<Goods> queryAllCommodity(Integer currentPage){
	
		PageInfo<Goods> pageInfo = goodsService.findPageGoods(currentPage, 4);
		
		return pageInfo;
	}
}
