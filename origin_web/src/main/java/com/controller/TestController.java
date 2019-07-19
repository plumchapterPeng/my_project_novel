package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
	 @RequestMapping(value = "getcode", method = RequestMethod.GET)
	 @ResponseBody
	public String getString() {
		System.out.println("进来了");
		return "你妈死了";
	}
}
