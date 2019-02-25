package br.com.sinn.resource;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sinn.model.Parcela;
import br.com.sinn.service.ParcelaService;

@RestController
@RequestMapping(value="/parcela")
public class ParcelaResource {

	private ParcelaService service;
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public List<Parcela> findAll (){
		try {
			return this.service.findAll();
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public Parcela inserir (@RequestBody Parcela p){
		try {
			return this.service.inserir(p);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
	
	@RequestMapping(value="/deletar", method=RequestMethod.DELETE)
	public void deletar (@RequestBody Parcela p){
		try {
			this.service.deletar(p);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	
}
