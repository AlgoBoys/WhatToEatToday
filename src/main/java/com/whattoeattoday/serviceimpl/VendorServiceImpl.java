package com.whattoeattoday.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.whattoeattoday.dao.VendorDao;
import com.whattoeattoday.model.VendorModel;
import com.whattoeattoday.service.VendorService;

/**
 * 
 * @author ravikson
 * 
 */
@Service
public class VendorServiceImpl implements VendorService{
	
	private VendorDao vendorDao;

	@Autowired
	public void setVendorDao(VendorDao vendorDao) {
		this.vendorDao = vendorDao;
	}

	@Transactional
	public List<VendorModel> getVendorList(int id) {
		return this.vendorDao.getVendorList(id);
	}

}
