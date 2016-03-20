package com.whattoeattoday.model;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 * @author raviksoni
 * 
 */
@Entity
@Table(name = "ingredients_table")
public class IngrediantsModel {

	@Id
	@Column(name = "i_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int iId;

	@Column(name = "i_Food")
	private String iFoodName;

	@Column(name = "i_weight")
	private Integer iBaseWeight;

	@Column(name = "i_Kcal")
	private Integer iKcal;

	@Column(name = "i_fat_g")
	private Integer iFatInGram;

	@Column(name = "i_carbo_g")
	private Integer iCarboInGram;

	@Column(name = "i_protein_g")
	private Integer iProteinInGram;

	@OneToMany(mappedBy = "ingrediantsModel")
	private Set<MenuIngrediantsQuantityTable> menuIngrediantsQuantityTables;

	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public String getiFoodName() {
		return iFoodName;
	}

	public void setiFoodName(String iFoodName) {
		this.iFoodName = iFoodName;
	}

	public Integer getiBaseWeight() {
		return iBaseWeight;
	}

	public void setiBaseWeight(Integer iBaseWeight) {
		this.iBaseWeight = iBaseWeight;
	}

	public Integer getiKcal() {
		return iKcal;
	}

	public void setiKcal(Integer iKcal) {
		this.iKcal = iKcal;
	}

	public Integer getiFatInGram() {
		return iFatInGram;
	}

	public void setiFatInGram(Integer iFatInGram) {
		this.iFatInGram = iFatInGram;
	}

	public Integer getiCarboInGram() {
		return iCarboInGram;
	}

	public void setiCarboInGram(Integer iCarboInGram) {
		this.iCarboInGram = iCarboInGram;
	}

	public Integer getiProteinInGram() {
		return iProteinInGram;
	}

	public void setiProteinInGram(Integer iProteinInGram) {
		this.iProteinInGram = iProteinInGram;
	}

	public Set<MenuIngrediantsQuantityTable> getMenuIngrediantsQuantityTables() {
		return menuIngrediantsQuantityTables;
	}

	public void setMenuIngrediantsQuantityTables(
			Set<MenuIngrediantsQuantityTable> menuIngrediantsQuantityTables) {
		this.menuIngrediantsQuantityTables = menuIngrediantsQuantityTables;
	}

}
