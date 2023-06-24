package com.ms.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ms.model.TaxModel;
import com.ms.service.TaxService;

@Controller
public class TaxController {

	@Autowired
	private TaxService taxService;
	
	@RequestMapping("/compute")
	public ModelAndView computeTax(@ModelAttribute("data") TaxModel taxModel) throws IOException {
		taxService.computeTax(taxModel);
		// response-provide
		ModelAndView mv=new ModelAndView();
		//mv.addObject("taxModel", taxModel);
		mv.setViewName("result.jsp");
		return mv;
	}

	@RequestMapping("/inputpage")
	public String showInputPage() {
		// this method needs to show the inputs.jsp (just return the name of view to
		// DispatcherServlet)
		return "inputs.jsp";
	}
}
