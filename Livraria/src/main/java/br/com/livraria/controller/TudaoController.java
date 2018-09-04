package br.com.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.livraria.modelo.LivrariaTudao;
import br.com.livraria.repository.LivrariaTudaoRepository;

@Controller
@RequestMapping("/livros")
public class TudaoController {
	
	@Autowired //injecao de dependencia = add TODO Crude
	private LivrariaTudaoRepository tudao;
	
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("cadastroLivros");
		return mv;
	}
	
	@RequestMapping ( method  =  RequestMethod . POST )
	public  ModelAndView  salvar ( LivrariaTudao  livraria ) {
		tudao.save (livraria);
		ModelAndView mv =  new  ModelAndView ( " cadastroLivros " );
		mv . addObject ( " mensagem " , " Livro cadastrado com sucesso " );
		return mv;

	}
	
	
}
