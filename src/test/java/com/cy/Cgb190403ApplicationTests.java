package com.cy;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.controller.MemberController;
import com.cy.dao.GoodsDao;
import com.cy.dao.MemberDao;
import com.cy.entity.Goods;
import com.cy.entity.Member;
import com.cy.service.MemberService;
import com.github.pagehelper.PageInfo;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Cgb190403ApplicationTests {

	@Autowired
	private MemberController memberController;
	@Autowired
	private MemberService memberService;
	@Autowired
	private MemberDao memberDao;
	@Test
	public void contextLoads() {
	}

	@Autowired
	private GoodsDao goodsDao;
	
	@Test
	public void testFindGoodsList() {
		List<Goods> list = goodsDao.selectAll();
		
		for (Goods goods : list) {
			System.out.println(goods);
		}
	}
}
