package com.whattoeattoday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/foodies")
public class DCController {

	@RequestMapping("/dclist")
	public String moo() {
		System.out.println("---------------");
		return "dclist";
	}

}
