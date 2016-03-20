package com.whattoeattoday.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author raviksoni
 * 
 */
@Entity
@Table(name = "menu_table")
public class MenuModel {

	@Id
	@Column(name = "menu_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int menuId;

	@Column(name = "menu_Name")
	private String menuName;

	@Column(name = "menu_Description")
	private String menuDescription;

	@Column(name = "menu_price")
	private Integer menuprice;

	@Column(name = "Is_Lunch")
	private Boolean isLunch;

	@Column(name = "Is_Veg")
	private Boolean isVeg = false;

	@Column(name = "Is_Active")
	private Boolean isActive;

	@Column(name = "menu_image_url")
	private String menuImageUrl;

	// @ManyToOne annotation defines a single-valued association to another
	// entity class that has many-to-one multiplicity.
	@ManyToOne
	@JoinColumn(name = "vend_Id")
	private VendorModel vendorModel;

	@OneToMany(mappedBy = "menuModel")
	private Set<MenuIngrediantsQuantityTable> menuIngrediantsQuantityTables;

	@OneToMany(mappedBy = "menuId")
	private Set<UserHistory> userHistories;

	public int getMenuId() {
		return menuId;
	}

	public void setMenuId(int menuId) {
		this.menuId = menuId;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public String getMenuDescription() {
		return menuDescription;
	}

	public void setMenuDescription(String menuDescription) {
		this.menuDescription = menuDescription;
	}

	public Integer getMenuprice() {
		return menuprice;
	}

	public void setMenuprice(Integer menuprice) {
		this.menuprice = menuprice;
	}

	public Boolean getIsLunch() {
		return isLunch;
	}

	public void setIsLunch(Boolean isLunch) {
		this.isLunch = isLunch;
	}

	public Boolean getIsVeg() {
		return isVeg;
	}

	public void setIsVeg(Boolean isVeg) {
		this.isVeg = isVeg;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public String getMenuImageUrl() {
		return menuImageUrl;
	}

	public void setMenuImageUrl(String menuImageUrl) {
		this.menuImageUrl = menuImageUrl;
	}

	public VendorModel getVendorModel() {
		return vendorModel;
	}

	public void setVendorModel(VendorModel vendorModel) {
		this.vendorModel = vendorModel;
	}

	public Set<MenuIngrediantsQuantityTable> getMenuIngrediantsQuantityTables() {
		return menuIngrediantsQuantityTables;
	}

	public void setMenuIngrediantsQuantityTables(
			Set<MenuIngrediantsQuantityTable> menuIngrediantsQuantityTables) {
		this.menuIngrediantsQuantityTables = menuIngrediantsQuantityTables;
	}

	public Set<UserHistory> getUserHistories() {
		return userHistories;
	}

	public void setUserHistories(Set<UserHistory> userHistories) {
		this.userHistories = userHistories;
	}

}
