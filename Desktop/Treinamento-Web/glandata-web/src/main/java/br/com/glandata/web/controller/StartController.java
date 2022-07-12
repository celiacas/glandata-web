package br.com.glandata.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("start/")
public class StartController {
	
	@GetMapping("")	
	public ModelAndView start() {
		return new ModelAndView("pages-starter");
	}
	

}
