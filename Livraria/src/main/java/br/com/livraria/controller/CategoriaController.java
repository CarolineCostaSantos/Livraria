package br.com.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.livraria.modelo.Categoria;
import br.com.livraria.repository.CategoriaRepository;

@Controller
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository categorias;
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("cadastroCategorias");
		return mv;
	}
	
	@RequestMapping ( method  =  RequestMethod . POST )
	public  ModelAndView  salvar ( Categoria  categoria ) {
		categorias.save (categoria);
		ModelAndView mv =  new  ModelAndView ( " cadastroCategoria " );
		mv . addObject ( " mensagem " , " Categoria cadastrada com sucesso! " );
		return mv;

	}

}
