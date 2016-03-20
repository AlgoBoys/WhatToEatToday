package com.whattoeattoday.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whattoeattoday.dao.FoodDescriptionDao;
import com.whattoeattoday.model.IngrediantsModel;
import com.whattoeattoday.model.MenuIngrediantsQuantityTable;
import com.whattoeattoday.service.FoodDescriptionService;

@Service
public class FoodDescriptionServiceImpl implements FoodDescriptionService {

	@Autowired
	private FoodDescriptionDao foodDescriptionDao;

	@Transactional
	public List<MenuIngrediantsQuantityTable> getListOfMenuIngrediantsQuatity(
			int menuId) {
		return this.foodDescriptionDao.getListOfMenuIngrediantsQuatity(menuId);
	}

	@Transactional
	public List<IngrediantsModel> getIngrediantsList() {
		return this.foodDescriptionDao.getIngrediantsList();
	}

}
