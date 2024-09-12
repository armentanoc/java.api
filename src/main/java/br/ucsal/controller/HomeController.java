package br.ucsal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ucsal.dto.UsuarioDTO;
import br.ucsal.service.HomeService;

@Controller
@RequestMapping("/")
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@GetMapping("/home")
	public String home() {
		return "index";
	}
	
	@PostMapping("/aut")
	public boolean autenticado(@RequestBody UsuarioDTO dto) {
		return homeService.autenticacao(dto);
	}

}
