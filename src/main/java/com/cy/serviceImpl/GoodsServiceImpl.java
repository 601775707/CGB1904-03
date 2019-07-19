package com.cy.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.dao.GoodsDao;
import com.cy.entity.Goods;
import com.cy.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	private GoodsDao goodsDao;
	
	@Override
	public PageInfo<Goods> findPageGoods(Integer pageNum, Integer pageSize) {

		PageHelper.startPage(pageNum, pageSize);
		
		List<Goods> goodsInfo = goodsDao.selectAll();
		
		PageInfo<Goods> info = new PageInfo<>(goodsInfo);
		
		return info;
	}

	
}
