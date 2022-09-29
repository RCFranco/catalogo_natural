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

	@GetMapping("/escolha")
	public ModelAndView Escolha(){
		return new ModelAndView("escolha");
	}

	@GetMapping("/cadastroAnimais")
	public ModelAndView cadastroAnimais(){
		return new ModelAndView("cadastroAnimais");
	}

	@GetMapping("/cadastroPlantas")
	public ModelAndView ScadastroPlantas(){
		return new ModelAndView("cadastroPlantas");
	}

	@GetMapping("/cadastro")
	public ModelAndView CadsPag(){
		return new ModelAndView("cadastro");
	}



}
