package com.lti.controller; 

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lti.dto.FlightSearchDTO;
import com.lti.entity.Flight;
import com.lti.service.FlightSearchService;

@Controller
@SessionAttributes({"flightSearchDTO","carriers"})
public class FlightSearchController {
	

		@Autowired
		private FlightSearchService flightSearchService;

		@RequestMapping(path="/search", method=RequestMethod.POST)
		public String search(FlightSearchDTO flightSearchDTO, Map<String, Object> model) {
			List<Flight> list = flightSearchService.getFlight(flightSearchDTO);
			List<String> carrierNames = flightSearchService.getAllCarriers();
			
			//System.out.println("no of flights " + list.size());
			model.put("flightSearchDTO",flightSearchDTO);  //for putting it in session
			model.put("listOfFlight", list);
			model.put("carriers", carrierNames);
			
			return "/displaySearch.jsp"; 
		}
		
		@RequestMapping(path="/reset", method=RequestMethod.GET)
		public String reset(Map<String, Object> model) {
			FlightSearchDTO flightSearchDTO = (FlightSearchDTO) model.get("flightSearchDTO");
			List<Flight> list = flightSearchService.getFlight(flightSearchDTO);
		
			model.put("listOfFlight", list);
			return "/displaySearch.jsp";
		}

		
		@RequestMapping(path="/list", method=RequestMethod.GET)
		public String list(Map<String, Object> model) {
			List<Flight> list = flightSearchService.getFlight();
			
			model.put("listOfFlight" , list);
			return "/displaySearch.jsp";
		}
		@RequestMapping(path="/listMorningFlight", method=RequestMethod.GET)
		public String listMorningFlight(Map<String, Object> model) {
			FlightSearchDTO flightSearchDTO = (FlightSearchDTO) model.get("flightSearchDTO");
			List<Flight> list = flightSearchService.getMorningFlight(flightSearchDTO);
			model.put("listOfFlight" , list);
			return "/displaySearch.jsp";
		}
		@RequestMapping(path="/listEveningFlight", method=RequestMethod.GET)
		public String listEveningFlight(Map<String, Object> model) {
			FlightSearchDTO flightSearchDTO = (FlightSearchDTO) model.get("flightSearchDTO");
			List<Flight> list = flightSearchService.getEveningFlight(flightSearchDTO);
			model.put("listOfFlight" , list);
			return "/displaySearch.jsp";
		}
		
		
		@RequestMapping(path="/listFlightByCarrier", method=RequestMethod.GET)
		public String listIndigoFlight(@RequestParam("carrier") String carrier, Map<String, Object> model) {
			FlightSearchDTO flightSearchDTO = (FlightSearchDTO) model.get("flightSearchDTO");
			List<Flight> list = flightSearchService.getFlightByCarrier(flightSearchDTO,carrier);
			model.put("listOfFlight" , list);
			return "/displaySearch.jsp";
		}
	
	}



