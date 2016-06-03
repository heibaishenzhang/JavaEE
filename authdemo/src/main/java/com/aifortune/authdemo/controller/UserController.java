package com.aifortune.authdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.aifortune.authdemo.model.User;
import com.aifortune.authdemo.service.impl.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userService;
	
	private Logger LOG = Logger.getLogger(getClass());

	@RequestMapping(method = RequestMethod.GET)
	public String welcome() {
		LOG.info("welcome method");
		return "index";
	}
//
//	@RequestMapping(value="/login", method = RequestMethod.POST)
//	public String login(@RequestParam("name") String name, @RequestParam("passwd") String passwd,
//			HttpServletRequest request) {
//		String message = "Hello";
//		request.getSession().setAttribute("LOGIN_NAME", name);
//		LOG.info("name: " + name + ",password " + passwd);
//		User user = userService.getUserByNameAndPw(name, passwd);
//		ModelAndView mav = new ModelAndView();
//		mav.addObject("message", message);
//		mav.setViewName("index");
//		if (user != null)
//			return "redirect:index";
//		else
//			return "login";
//	}
}
