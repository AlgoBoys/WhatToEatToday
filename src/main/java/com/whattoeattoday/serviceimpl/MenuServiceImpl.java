package com.whattoeattoday.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whattoeattoday.dao.MenuDao;
import com.whattoeattoday.model.MenuModel;
import com.whattoeattoday.service.MenuService;

@Service
public class MenuServiceImpl implements MenuService {

	private MenuDao menuDao;

	@Autowired
	public void setMenuDao(MenuDao menuDao) {
		this.menuDao = menuDao;
	}

	@Transactional
	public List<MenuModel> getMenuList(int id) {
		return this.menuDao.getMenuList(id);
	}

}
