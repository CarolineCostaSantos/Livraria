package br.com.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.livraria.modelo.Autor;
import br.com.livraria.repository.AutorRepository;

@Controller
@RequestMapping("/Autor")
public class AutorController {
	
	@Autowired
	private AutorRepository autores;
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("cadastroAutores");
		return mv;
	}
	
	@RequestMapping ( method  =  RequestMethod . POST )
	public  ModelAndView  salvar ( Autor  autor ) {
		autores.save (autor);
		ModelAndView mv =  new  ModelAndView ( " cadastroAutor " );
		mv . addObject ( " mensagem " , " Livro cadastrado com sucesso " );
		return mv;

	}

}
