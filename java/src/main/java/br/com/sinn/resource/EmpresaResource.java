package br.com.sinn.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sinn.model.Empresa;
import br.com.sinn.service.EmpresaService;

@RestController
@RequestMapping(value = "/empresa")
public class EmpresaResource {

	@Autowired
	private EmpresaService service;
	
	@RequestMapping(value="/listar",method = RequestMethod.GET)
	public List<Empresa> findAll() {
		try {
			return this.service.findAll();
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
	
	@RequestMapping(value="/salvar", method=RequestMethod.POST)
	public Empresa salvar (@RequestBody Empresa e) {
		try {
			return this.service.inserir(e);			
		} catch (Exception e2) {
			e2.getMessage();
			return null;
		}
	}
	
	@RequestMapping(value="/deletar", method=RequestMethod.DELETE)
	public void deletar (@RequestBody Empresa e) {
		try {
			this.service.deletar(e);			
		} catch (Exception e2) {
			e2.getMessage();
		}
	}
		
}
