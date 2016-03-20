package com.whattoeattoday.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.whattoeattoday.model.UserHistory;
import com.whattoeattoday.service.FoodiesService;

@Controller
public class FoodiesController {

	static final int userId = 5;

	@Autowired
	private FoodiesService foodiesService;

	@RequestMapping(value = "/foodies/goingtoeat", method = RequestMethod.POST)
	public String goingToEat(@RequestParam("menuId") Integer menuId,
			@RequestParam("calories") Integer calories,
			@RequestParam("Fat") Integer Fat,
			@RequestParam("carohydrate") Integer carohydrate,
			@RequestParam("protein") Integer protein, Model model) {

		Date date = new Date();
		UserHistory userHistory = new UserHistory();
		this.foodiesService.saveUserHistory(userHistory);
		return getHomePage(userId, model);
	}

	@RequestMapping(value = "/foodies/gethomepage", method = RequestMethod.GET)
	private String getHomePage(int userId, Model model) {
		List<UserHistory> userHistoriesList = foodiesService
				.getUserHistoryList(userId);
		model.addAttribute("userHistory", userHistoriesList);
		return "foodies/gethomepage";
	}

}
