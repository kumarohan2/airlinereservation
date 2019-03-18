package com.lti.airline.admin.controller;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RequestMethod;
	import org.springframework.web.bind.annotation.RequestParam;

import com.lti.airline.admin.service.AirlineRemoveService;


	@Controller
	public class AirlineRemoveController {

		@Autowired
		private AirlineRemoveService airlineRemoveService;

		@RequestMapping(path = "/delete", method = RequestMethod.GET)
		public String register(@RequestParam("flightNo") String flightNo) {
			airlineRemoveService.remove(flightNo);

			return "/deletesuccessfull.jsp";
		}

	}


