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
@Table(name = "DC_Table")
public class DCModel {

	@Id
	@Column(name = "dc_Id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int dcId;

	@Column(name = "dc_Name")
	private String dcName;

	@Column(name = "dc_Location")
	private String dcLocation;

	@Column(name = "dc_image_url")
	private String dcImageUrl;

	// mappedBy refers to the property name of the association on the owner side
	@OneToMany(mappedBy = "dcModel")
	private Set<VendorModel> vendors;

	public int getDcId() {
		return dcId;
	}

	public void setDcId(int dcId) {
		this.dcId = dcId;
	}

	public String getDcName() {
		return dcName;
	}

	public void setDcName(String dcName) {
		this.dcName = dcName;
	}

	public String getDcLocation() {
		return dcLocation;
	}

	public void setDcLocation(String dcLocation) {
		this.dcLocation = dcLocation;
	}

	public String getDcImageUrl() {
		return dcImageUrl;
	}

	public void setDcImageUrl(String dcImageUrl) {
		this.dcImageUrl = dcImageUrl;
	}

	public Set<VendorModel> getVendors() {
		return vendors;
	}

	public void setVendors(Set<VendorModel> vendors) {
		this.vendors = vendors;
	}

}
