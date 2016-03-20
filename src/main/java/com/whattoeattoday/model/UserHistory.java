package com.whattoeattoday.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "user_history_table")
public class UserHistory {

	@Id
	@Column(name = "h_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "userId")
	private User user;

	@ManyToOne
	@JoinColumn(name = "menuId")
	private MenuModel menu;

	@Column(name = "i_Kcal")
	private Integer i_Kcal;

	@Column(name = "i_fat_g")
	private Integer i_fat_g;

	@Column(name = "i_carbo_g")
	private Integer i_carbo_g;

	@Column(name = "i_protein_g")
	private Integer i_protein_g;

	@Column(name = "dateOfEat")
	private Date dateOfEat;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public MenuModel getMenu() {
		return menu;
	}

	public void setMenu(MenuModel menu) {
		this.menu = menu;
	}

	public Integer getI_Kcal() {
		return i_Kcal;
	}

	public void setI_Kcal(Integer i_Kcal) {
		this.i_Kcal = i_Kcal;
	}

	public Integer getI_fat_g() {
		return i_fat_g;
	}

	public void setI_fat_g(Integer i_fat_g) {
		this.i_fat_g = i_fat_g;
	}

	public Integer getI_carbo_g() {
		return i_carbo_g;
	}

	public void setI_carbo_g(Integer i_carbo_g) {
		this.i_carbo_g = i_carbo_g;
	}

	public Integer getI_protein_g() {
		return i_protein_g;
	}

	public void setI_protein_g(Integer i_protein_g) {
		this.i_protein_g = i_protein_g;
	}

	public Date getDateOfEat() {
		return dateOfEat;
	}

	public void setDateOfEat(Date dateOfEat) {
		this.dateOfEat = dateOfEat;
	}
}
