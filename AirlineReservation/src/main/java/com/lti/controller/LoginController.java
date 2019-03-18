package com.lti.controller;

import java.util.Map;

import javax.servlet.http.HttpSession;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.service.LoginService;
import com.lti.dto.LoginDTO;
import com.lti.entity.RegistrationAirline;

@Controller

@SessionAttributes("user")
public class LoginController {

	@Autowired
	private LoginService loginService;

	
	@RequestMapping(path = "/login", method = RequestMethod.POST)
	public String  login(LoginDTO loginDTO , Map<String , Object> model,HttpSession session) {
		RegistrationAirline e = loginService.login(loginDTO);
		
		if (e!=null) {
			model.put("user", e);
			session.setAttribute("user", e);
			return "/index.jsp";
		}
		else {
			return "/Fail.jsp";
		}
	}
	
	
}
