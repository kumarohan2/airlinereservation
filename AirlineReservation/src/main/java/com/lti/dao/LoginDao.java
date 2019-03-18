package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.security.auth.login.LoginException;

import org.springframework.stereotype.Repository;

import com.lti.dto.LoginDTO;
import com.lti.entity.RegistrationAirline;


@Repository
public class LoginDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	public RegistrationAirline login(LoginDTO loginDTO) throws LoginException {

		Query query = entityManager.createQuery("select user from RegistrationAirline as user where user.emailId = :emailId and user.password = :password");
		query.setParameter("emailId", loginDTO.getEmailId());
		query.setParameter("password", loginDTO.getPassword());
		try {
			return (RegistrationAirline) query.getSingleResult();
		} 
		catch (NoResultException nre) {
			throw new LoginException("Problem in user credentials");
		}

	}
}
