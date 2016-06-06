package com.aifortune.authdemo.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.aifortune.authdemo.model.User;
import com.aifortune.authdemo.service.impl.UserServiceImpl;

@Controller
public class UserController {

	@Autowired
	private UserServiceImpl userService;

	private Logger LOG = Logger.getLogger(getClass());

//	@RequestMapping(value = "/", method = RequestMethod.GET)
//	public ModelAndView printWelcome1() {
//		return new ModelAndView(new RedirectView("login.jsp"));
//	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String login() {
		return "login";
	}

	// @RequestMapping(value="/", method = RequestMethod.GET)
	// public String welcome() {
	// LOG.info("welcome method");
	// return "login";
	// }

	@RequestMapping(value = "/login")
	public String login(@RequestParam(value="name", required = false) String name, 
			@RequestParam(value="passwd", required = false) String passwd,
			HttpServletRequest request) {
		User user = null;
		String rName=request.getParameter("name");
		LOG.info("rName: " + rName );
		String message = "Hello";
		//request.getSession().setAttribute("LOGIN_NAME", name);
		LOG.info("name: " + name + ",password " + passwd);
		if(name != null && passwd != null)
			 user= userService.getUserByNameAndPw(name, passwd);
		else
			return "login";
		ModelAndView mav = new ModelAndView();
		mav.addObject("message", message);
		mav.setViewName("index");
		if (user != null)
			return "redirect:index";
		else
			return "login";
	}

//	@RequestMapping(value = "login", method = RequestMethod.GET)
//	public String login(Model model, String error, String logout) {
//		if (error != null)
//			model.addAttribute("error", "Your username and password is invalid.");
//
//		if (logout != null)
//			model.addAttribute("message", "You have been logged out successfully.");
//
//		return "login";
//	}
}
