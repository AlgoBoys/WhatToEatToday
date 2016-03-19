package com.whattoeattoday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.whattoeattoday.service.VendorService;

@Controller
public class VendorController {

	private VendorService vendorService;

	@Autowired
	public void setVendorService(VendorService vendorService) {
		this.vendorService = vendorService;
	}

	@RequestMapping(value = "/foodies/vendorlist/{id}", method = RequestMethod.GET)
	public String getVendorList(@PathVariable int id,ModelMap model) {
		model.addAttribute("vendorlist", this.vendorService.getVendorList(id));
		return "foodies/vendorlist";
	}
	
	
	
	@RequestMapping(value = "/admin/vendorlist", method = RequestMethod.GET)
	public String getVendorListForAdmin(ModelMap model) {
		model.addAttribute("vendorlist", this.vendorService.getDcListForAdmin());
		return "admin/vendorlist";
	}

}
