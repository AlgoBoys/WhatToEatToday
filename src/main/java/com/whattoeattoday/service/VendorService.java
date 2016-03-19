package com.whattoeattoday.service;

import java.util.List;

import com.whattoeattoday.model.VendorModel;

/**
 * 
 * @author ravikson
 * 
 */
public interface VendorService {
	
	public List<VendorModel> getVendorList(int id);

	public List<VendorModel> getDcListForAdmin();

	public void saveVendor(String vendorName, String vendorDiscription,
			Boolean isActive, Integer vendorLocation);
}
