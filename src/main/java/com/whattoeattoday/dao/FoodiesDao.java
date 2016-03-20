package com.whattoeattoday.dao;

import java.util.List;

import com.whattoeattoday.model.UserHistory;

public interface FoodiesDao {

	List<UserHistory> getUserHistoryList(int userId);
	
	public void saveUserHistory(UserHistory userHistory);

}
