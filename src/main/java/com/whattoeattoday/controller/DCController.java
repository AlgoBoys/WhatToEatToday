package com.whattoeattoday.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DCController {

	@RequestMapping("/dclist")
	public void moo() {
		System.out.println("---------------");
	}

}
