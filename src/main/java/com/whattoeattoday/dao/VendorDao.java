package com.whattoeattoday.dao;

import java.util.List;

import com.whattoeattoday.model.VendorModel;

/**
 * 
 * @author ravikson
 * 
 */
public interface VendorDao {
	
	public List<VendorModel> getVendorList(int id);

	public List<VendorModel> getDcListForAdmin();

	public void getDcListForAdmin(String vendorName, String vendorDiscription,
			Boolean isActive, Integer vendorLocation);
}
