package br.com.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.livraria.repository.LivrariaTudaoRepository;

@Controller
@RequestMapping("/livros")
public class TudaoController {
	
	@Autowired //injecao de dependencia = add TODO Crude
	private LivrariaTudaoRepository tudao;
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("cadastroLivros");
		return mv;
	}
	
	
	
}
