package br.com.sinn.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.sinn.model.Adiantamento;
import br.com.sinn.service.AdiantamentoService;

@RestController
@RequestMapping(value = "/adiantamento")
public class AdiantamentoResource {

	
	@Autowired
	private AdiantamentoService service;
	
	@RequestMapping(value="/listar",method = RequestMethod.GET)
	public List<Adiantamento> findAll() {
		try {
			return this.service.findAll();
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
	
	@RequestMapping(value="/solicitar", method= RequestMethod.POST)
	public Adiantamento salvar (@RequestBody Adiantamento a){
		try {
			return this.service.solicitacao(a);
		} catch (Exception e) {
			e.getMessage();
			return null;
		}
	}
	
	@RequestMapping(value="/deletar", method= RequestMethod.DELETE)
	public void deletar (@RequestBody Adiantamento a){
		try {
			this.service.delete(a);
		} catch (Exception e) {
			e.getMessage();
		}
	}
	
}
