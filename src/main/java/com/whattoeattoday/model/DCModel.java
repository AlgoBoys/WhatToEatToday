package com.whattoeattoday.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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

	private String dc_Name;
	private String dc_Location;
	private String dc_image_url;

	public int getDcId() {
		return dcId;
	}

	public void setDcId(int dcId) {
		this.dcId = dcId;
	}

	public String getDc_Name() {
		return dc_Name;
	}

	public void setDc_Name(String dc_Name) {
		this.dc_Name = dc_Name;
	}

	public String getDc_Location() {
		return dc_Location;
	}

	public void setDc_Location(String dc_Location) {
		this.dc_Location = dc_Location;
	}

	public String getDc_image_url() {
		return dc_image_url;
	}

	public void setDc_image_url(String dc_image_url) {
		this.dc_image_url = dc_image_url;
	}

}
