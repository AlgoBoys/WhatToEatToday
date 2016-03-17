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
@Table(name = "Vendor_Table")
public class VendorModel {

	@Id
	@Column(name = "vend_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int vendId;

	@Column(name = "vend_Name")
	private String vendName;

	@Column(name = "vend_Description")
	private String vendDescription;

	@Column(name = "Is_Active")
	private Boolean isActive;

	// @ManyToOne annotation defines a single-valued association to another
	// entity class that has many-to-one multiplicity.
	@ManyToOne
	@JoinColumn(name = "dc_Id")
	private DCModel dcModel;

	// mappedBy refers to the property name of the association on the owner side
	@OneToMany(mappedBy = "vendorModel")
	private Set<MenuModel> menu;

	public int getVendId() {
		return vendId;
	}

	public void setVendId(int vendId) {
		this.vendId = vendId;
	}

	public String getVendName() {
		return vendName;
	}

	public void setVendName(String vendName) {
		this.vendName = vendName;
	}

	public String getVendDescription() {
		return vendDescription;
	}

	public void setVendDescription(String vendDescription) {
		this.vendDescription = vendDescription;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public DCModel getDcModel() {
		return dcModel;
	}

	public void setDcModel(DCModel dcModel) {
		this.dcModel = dcModel;
	}

	public Set<MenuModel> getMenu() {
		return menu;
	}

	public void setMenu(Set<MenuModel> menu) {
		this.menu = menu;
	}

}
