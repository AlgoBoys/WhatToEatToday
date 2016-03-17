package com.whattoeattoday.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.whattoeattoday.service.DCService;

@Controller
public class DCController {

	private DCService dcService;

	@Autowired
	public void setDcService(DCService dcService) {
		this.dcService = dcService;
	}

	@RequestMapping(value = "/foodies/dclist", method = RequestMethod.GET)
	public String getDcList(ModelMap model) {
		model.addAttribute("dclist", this.dcService.getDcList());
		return "foodies/dclist";
	}

}
