package com.whattoeattoday.service;

import java.util.List;

import com.whattoeattoday.model.UserHistory;

public interface FoodiesService {

	List<UserHistory> getUserHistoryList(int userId);


	public void saveUserHistory(UserHistory userHistory);
}
