package br.com.sinn.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sinn.model.Funcionario;
import br.com.sinn.service.FuncionarioService;

@RestController
@RequestMapping(value = "/funcionario")
public class FuncionarioResource {

	@Autowired
	private FuncionarioService service;
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public List<Funcionario> findAll (){
		try {
			return this.service.findAll();
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public Funcionario inserir (@RequestBody Funcionario f){
		try {
			return this.service.inserir(f);			
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
	
	@RequestMapping(value="/deletar", method=RequestMethod.DELETE)
	public void findAll (@RequestBody Funcionario f){
		try {
			this.service.deletar(f);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
	@RequestMapping(value="/updateSalario", method=RequestMethod.PUT)
	public Funcionario updateSalario (@RequestBody Funcionario func) {
		try {
			return this.service.updateSalario(func);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
	
}
