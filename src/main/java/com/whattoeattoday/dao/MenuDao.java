package com.whattoeattoday.dao;

import java.util.List;

import com.whattoeattoday.model.MenuModel;

/**
 * 
 * @author ravikson
 * 
 */
public interface MenuDao {
	
	public List<MenuModel> getMenuList(int id);

	public MenuModel getMenu(int id);

}
