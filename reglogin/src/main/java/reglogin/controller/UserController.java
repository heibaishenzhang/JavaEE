package reglogin.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import reglogin.model.User;
import reglogin.service.impl.UserServiceImpl;

@Controller
public class UserController {

	private UserServiceImpl userServer;

	private Logger LOG = Logger.getLogger(getClass());

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String toLogin() {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String uname, String upass, ModelMap model) {
		String v_result = "login";
		try {
			LOG.info("User name is: " + uname + ", passwd is: " + upass);
			//TODO:Here upass should be MD5 or sha1 with SALT
			User user = userServer.getUserByNameAndPw(uname, upass);
			if (user != null)
				return "index";
			else
				return "login";

		} catch (Exception e) {
			e.printStackTrace();
			model.put("errMsg", "服务器有异常!");
		}

		return "login";
	}

}
