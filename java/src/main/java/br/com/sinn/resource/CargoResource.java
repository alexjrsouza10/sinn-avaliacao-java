package br.com.sinn.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sinn.model.Cargo;
import br.com.sinn.service.CargoService;

@RestController
@RequestMapping(value = "/cargo")
public class CargoResource {

	@Autowired
	private CargoService service;
	
	@RequestMapping(value="/listar", method= RequestMethod.GET)
	public List<Cargo> findAll (){
		try {
			return this.service.findAll();			
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
	
	@RequestMapping(value="/salvar", method= RequestMethod.POST)
	public Cargo salvar (@RequestBody Cargo c){
		try {
			return this.service.inserir(c);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
	
	@RequestMapping(value="/deletar", method= RequestMethod.DELETE)
	public void deletar (@RequestBody Cargo c){
		try {
			this.service.deletar(c);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
}
