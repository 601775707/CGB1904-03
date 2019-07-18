package com.cy.service;

import com.cy.entity.Goods;
import com.github.pagehelper.PageInfo;

public interface GoodsService {

	PageInfo<Goods> findPageGoods(Integer pageNum,Integer pageSize);
}
