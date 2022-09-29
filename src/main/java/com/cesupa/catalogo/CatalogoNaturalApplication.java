package com.cesupa.catalogo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;;

@SpringBootApplication
@RestController
public class CatalogoNaturalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoNaturalApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello() {
		return "Hello World";
	}

	@GetMapping("/pagInicial")
	public ModelAndView firstPage(){
		return new ModelAndView("pagInicial");
	}

	@GetMapping("/2ndPag")
	public ModelAndView SegPag(){
		return new ModelAndView("2ndPag");
	}

	@GetMapping("/cadastro")
	public ModelAndView CadsPag(){
		return new ModelAndView("cadastro");
	}



}
