package com.whattoeattoday.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.whattoeattoday.dao.FoodiesDao;
import com.whattoeattoday.model.UserHistory;
import com.whattoeattoday.service.FoodiesService;

@Service
public class FoodiesServiceImpl implements FoodiesService{
	
	@Autowired
	private FoodiesDao foodiesDao;

	public List<UserHistory> getUserHistoryList(int userId) {
		return this.foodiesDao.getUserHistoryList(userId);
	}

	public void saveUserHistory(UserHistory userHistory) {
		this.foodiesDao.saveUserHistory(userHistory);
		
	}

}
