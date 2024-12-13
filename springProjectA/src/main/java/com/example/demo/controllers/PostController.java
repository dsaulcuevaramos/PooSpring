package com.example.demo.controllers;

import java.lang.ProcessBuilder.Redirect;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.persona;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequestMapping("/poste")
public class PostController {
	
	private static final Log LOG = LogFactory.getLog(PostController.class);
	
	/*
	@GetMapping("/")
	public String redirect() {
		return "redirect:/poste/form";
	}
	*/
	@GetMapping("/form")
	public String Form(Model model) {
		model.addAttribute("persona", new persona());
		LOG.info("Ingreso en el formulario");
		return "formulario";
	}

	@PostMapping("/addpersona")
	public ModelAndView Resul(@ModelAttribute("persona") persona persona) {

		ModelAndView mav = new ModelAndView("resultado");
		mav.addObject("persona", persona);
		return mav;
	}
	
	@GetMapping("/")
	public RedirectView redirect2() {
		return new RedirectView("/poste/form");
	}
	

}
