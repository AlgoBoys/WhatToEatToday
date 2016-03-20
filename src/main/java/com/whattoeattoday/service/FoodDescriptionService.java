package com.whattoeattoday.service;

import java.util.List;

import com.whattoeattoday.model.IngrediantsModel;
import com.whattoeattoday.model.MenuIngrediantsQuantityTable;

public interface FoodDescriptionService {
	
	public List<IngrediantsModel> getIngrediantsList();
	
	public List<MenuIngrediantsQuantityTable> getListOfMenuIngrediantsQuatity(
			int menuId);

}
