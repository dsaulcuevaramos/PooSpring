package com.example.demo.controllers;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/")
public class LogController {
	
	
	private PrimerComponente pm;
	private static final Log LOG = LogFactory.getLog(LogController.class);
	
	@GetMapping("/Metodo1")
	public String getMethodName() {
		LOG.info("Ingreso en el view 1");
		return "view1";
	}
	
	@GetMapping("/Metodo2")
	public String getMethodNam() {
		LOG.info("Ingreso en el view 2");
		return "view2";
	}
	
}
