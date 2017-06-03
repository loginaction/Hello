package com.jbit.service.impl;

import java.util.List;

import com.jbit.dao.GoodsDao;
import com.jbit.enttiy.Goods;
import com.jbit.service.GoodsService;

public class GoodsServiceImpl implements GoodsService {
	
	private GoodsDao dao;

	@Override
	public List<Goods> getAll(int id) {
		return dao.getAll(id);
	}

	public GoodsDao getDao() {
		return dao;
	}
	public void setDao(GoodsDao dao) {
		this.dao = dao;
	}

}
