package br.com.cassi.funcionarios.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
	
	
@GetMapping("/home")	
 public String Hello(Model model) {
	
	
		
	
	 return "home";
 }
	
}
