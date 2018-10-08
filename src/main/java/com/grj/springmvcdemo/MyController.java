package com.grj.springmvcdemo;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	private static final Logger logger = LoggerFactory.getLogger(MyController.class);

	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String test(HttpServletRequest req, HttpServletResponse res) {

		System.out.println("Welcome to MyController");
		return "redirect:/index.jsp";
	}


	@RequestMapping(value = "/getParameter.do", method = RequestMethod.GET)
	public String getParameter(@RequestParam(value = "param") String param) {
		logger.info("getParameter-----------------------");
		System.out.printf("getParameter : %s\n", param);
		return "redirect:/index.jsp";
	}
}
