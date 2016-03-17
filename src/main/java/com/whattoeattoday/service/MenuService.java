package com.whattoeattoday.service;

import java.util.List;

import com.whattoeattoday.model.MenuModel;

/**
 * 
 * @author ravikson
 * 
 */
public interface MenuService {

	public List<MenuModel> getMenuList(int id);

}
