package com.whattoeattoday.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * @author raviksoni
 * 
 */
@Entity
@Table(name = "menu_ingredients_quantity_table")
public class MenuIngrediantsQuantityTable {

	@Id
	@Column(name = "q_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int qId;

	@ManyToOne
	@JoinColumn(name = "menu_Id")
	private MenuModel menuModel;

	@ManyToOne
	@JoinColumn(name = "i_id")
	private IngrediantsModel ingrediantsModel;

	@Column(name = "i_amount_ingram")
	private Integer ingrediantAmouunt;

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public MenuModel getMenuModel() {
		return menuModel;
	}

	public void setMenuModel(MenuModel menuModel) {
		this.menuModel = menuModel;
	}

	public IngrediantsModel getIngrediantsModel() {
		return ingrediantsModel;
	}

	public void setIngrediantsModel(IngrediantsModel ingrediantsModel) {
		this.ingrediantsModel = ingrediantsModel;
	}

	public Integer getIngrediantAmouunt() {
		return ingrediantAmouunt;
	}

	public void setIngrediantAmouunt(Integer ingrediantAmouunt) {
		this.ingrediantAmouunt = ingrediantAmouunt;
	}

}
