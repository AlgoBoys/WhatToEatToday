package com.whattoeattoday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.whattoeattoday.service.MenuService;

@Controller
public class MenuController {

	private MenuService menuService;

	@Autowired
	public void setVendorService(MenuService menuService) {
		this.menuService = menuService;
	}

	@RequestMapping(value = "/foodies/menulist/{id}", method = RequestMethod.GET)
	public String getMenuList(@PathVariable int id, ModelMap model) {
		model.addAttribute("menulist", this.menuService.getMenuList(id));
		return "foodies/menulist";
	}

}
