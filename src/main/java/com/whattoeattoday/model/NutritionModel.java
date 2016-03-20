package com.whattoeattoday.model;

public class NutritionModel {

	private int calories;
	private int Fat;
	private int carohydrate;
	private int protein;

	public NutritionModel() {
	}

	public NutritionModel(int cal, int fat, int carbo, int prot) {
		this.calories = cal;
		this.Fat = fat;
		this.carohydrate = carbo;
		this.protein = prot;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getFat() {
		return Fat;
	}

	public void setFat(int fat) {
		Fat = fat;
	}

	public int getCarohydrate() {
		return carohydrate;
	}

	public void setCarohydrate(int carohydrate) {
		this.carohydrate = carohydrate;
	}

	public int getProtein() {
		return protein;
	}

	public void setProtein(int protein) {
		this.protein = protein;
	}

}
