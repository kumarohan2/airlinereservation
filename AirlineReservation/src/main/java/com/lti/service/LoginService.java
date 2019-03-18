package com.lti.service;

import javax.security.auth.login.LoginException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lti.dao.LoginDao;
import com.lti.dto.LoginDTO;
import com.lti.entity.RegistrationAirline;


@Component
public class LoginService {
	
	@Autowired
	private LoginDao loginDAO;
	
	public RegistrationAirline login(LoginDTO loginDTO) {
		try {
			RegistrationAirline loginDetails=loginDAO.login(loginDTO);
			return loginDetails;
		}catch (LoginException nre) {
			return null;
		}
	}
}
		
