package br.com.sinn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sinn.model.Parcela;
import br.com.sinn.repository.ParcelaRepo;

@Service
public class ParcelaService {

	@Autowired
	private ParcelaRepo repo;
	
	public List<Parcela> findAll (){
		return this.repo.findAll();
	}
	
	public Parcela inserir (Parcela p) {
		return this.repo.save(p);
	}
	
	public void deletar (Parcela p) {
		this.repo.delete(p);
	}
}
