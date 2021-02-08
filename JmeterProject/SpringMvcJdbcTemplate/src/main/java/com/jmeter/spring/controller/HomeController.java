package com.jmeter.spring.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jmeter.spring.dao.NumDAO;
import com.jmeter.spring.model.NumClass;

/**
 * This controller routes accesses to the application to the appropriate
 * Handler methods. 
*/
@Controller
public class HomeController {

	@Autowired
	private NumDAO numDAO;
	
	/* It provides current pointer field in model object 
	 * which gets incremented by 1 with every request
	*/  
	@RequestMapping(value="/")
	public ModelAndView listContact(ModelAndView model) throws IOException{
		List<NumClass> numList = numDAO.list();
		model.addObject("numList", numList);
		model.setViewName("home");		
		return model;
	}
	
}
