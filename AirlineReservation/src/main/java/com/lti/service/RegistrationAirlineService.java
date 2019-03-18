package com.lti.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.dao.RegistrationAirlineDao;
import com.lti.dto.RegistrationAirlineDTO;
import com.lti.entity.RegistrationAirline;



@Service
public class RegistrationAirlineService {
	
	@Autowired
	private RegistrationAirlineDao registrationAirlineDao;
	
	@Transactional
	public void register(RegistrationAirlineDTO registrationAirlineDTO) {
	RegistrationAirline registrationAirline = new RegistrationAirline();
	registrationAirline.setPassangerId(registrationAirlineDTO.getPassangerId());
	registrationAirline.setTitle(registrationAirlineDTO.getTitle());
	registrationAirline.setFirstName(registrationAirlineDTO.getFirstName());
	registrationAirline.setLastName(registrationAirlineDTO.getLastName());
	registrationAirline.setEmailId(registrationAirlineDTO.getEmailId());
	registrationAirline.setMobileNo(registrationAirlineDTO.getMobileNo());
	registrationAirline.setPassword(registrationAirlineDTO.getPassword());
    registrationAirline.setDob(registrationAirlineDTO.getDob());
    registrationAirline.setSecurityquestion(registrationAirlineDTO.getSecurityquestion());
    registrationAirline.setSecurityanswer(registrationAirlineDTO.getSecurityanswer());
	registrationAirlineDao.add(registrationAirline);
	
	}
}