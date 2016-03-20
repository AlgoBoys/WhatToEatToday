package com.whattoeattoday.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.googlecode.charts4j.Color;
import com.googlecode.charts4j.GChart;
import com.googlecode.charts4j.GCharts;
import com.googlecode.charts4j.PieChart;
import com.googlecode.charts4j.Slice;
import com.whattoeattoday.model.IngrediantsModel;
import com.whattoeattoday.model.MenuIngrediantsQuantityTable;
import com.whattoeattoday.model.NutritionModel;
import com.whattoeattoday.service.FoodDescriptionService;
import com.whattoeattoday.service.MenuService;

@Controller
public class FoodDescriptionController {

	@Autowired
	private MenuService menuService;

	@Autowired
	private FoodDescriptionService foodDescriptionService;

	@RequestMapping(value = "/foodies/fooddescription/{id}", method = RequestMethod.GET)
	public String getFoodDescription(@PathVariable int id, ModelMap model) {
		model.addAttribute("menuItem", menuService.getMenu(id));
		List<MenuIngrediantsQuantityTable> mList = this.foodDescriptionService
				.getListOfMenuIngrediantsQuatity(id);
		model.addAttribute("menuIngrediantsQuantityList", mList);

		List<IngrediantsModel> inList = this.foodDescriptionService
				.getIngrediantsList();
		int carboGram = 250;
		int fatGram = 300;
		int kCalGram = 700;
		int protGram = 160;
//		for (MenuIngrediantsQuantityTable mIQ : mList) {
//			IngrediantsModel ingrediantsModel = inList.get(inList.indexOf(mIQ
//					.getqId())-1);
//			carboGram += ingrediantsModel.getiCarboInGram();
//			fatGram += ingrediantsModel.getiFatInGram();
//			kCalGram += ingrediantsModel.getiKcal();
//			protGram += ingrediantsModel.getiProteinInGram();
//		}
		Slice s1 = Slice.newSlice(carboGram, Color.newColor("CACACA"),
				"Carbohydrate", "Carbohydrate");
		Slice s2 = Slice.newSlice(fatGram, Color.newColor("DF7417"), "Fat", "Fat");
		Slice s3 = Slice.newSlice(kCalGram, Color.newColor("951800"), "kCal", "kCal");
		Slice s4 = Slice
				.newSlice(protGram, Color.newColor("01A1DB"), "Protein", "Protein");

		PieChart pieChart = GCharts.newPieChart(s1, s2, s3, s4);
		pieChart.setTitle("Nutritional Values(in gram)");
		pieChart.setSize(520, 210);
		pieChart.setThreeD(false);

		model.addAttribute("pieUrl", pieChart.toURLString());

		return "foodies/fooddescription";
	}
}
