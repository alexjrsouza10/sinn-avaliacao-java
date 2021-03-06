package br.com.sinn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sinn.model.Empresa;
import br.com.sinn.repository.EmpresaRepo;

@Service
public class EmpresaService {
	
	@Autowired
	private EmpresaRepo repo;

	public List<Empresa> findAll () {
		return this.repo.findAll();
	}
	
	public Empresa inserir (Empresa e) {
		return this.repo.save(e);
	}
	
	public void deletar (Empresa e) {
		this.repo.delete(e);
	}
	
}
