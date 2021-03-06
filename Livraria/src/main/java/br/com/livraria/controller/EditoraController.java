package br.com.livraria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.livraria.modelo.Editora;
import br.com.livraria.repository.EditoraRepository;

@Controller
@RequestMapping("/editoras")
public class EditoraController {

	@Autowired
	private EditoraRepository editoras;
	
	@RequestMapping("/novo")
	public ModelAndView novo() {
		ModelAndView mv = new ModelAndView("cadastroEditoras");
		return mv;
	}
	
	@RequestMapping ( method  =  RequestMethod . POST )
	public  ModelAndView  salvar ( Editora  editora ) {
		editoras.save (editora);
		ModelAndView mv =  new  ModelAndView ( " cadastroEditoras " );
		mv . addObject ( " mensagem " , " Editora cadastrada com sucesso! " );
		return mv;
}
}