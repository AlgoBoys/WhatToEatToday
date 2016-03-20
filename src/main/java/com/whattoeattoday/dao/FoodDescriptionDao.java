package com.whattoeattoday.dao;

import java.util.List;

import com.whattoeattoday.model.IngrediantsModel;
import com.whattoeattoday.model.MenuIngrediantsQuantityTable;

public interface FoodDescriptionDao {

	public List<MenuIngrediantsQuantityTable> getListOfMenuIngrediantsQuatity(
			int menuId);
	
	public List<IngrediantsModel> getIngrediantsList();

}
