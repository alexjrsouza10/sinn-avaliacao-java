package br.com.sinn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sinn.model.Funcionario;
import br.com.sinn.repository.FuncionarioRepo;

@Service
public class FuncionarioService {

	@Autowired
	private FuncionarioRepo repo;
	
	
	public List<Funcionario> findAll(){
		return this.repo.findAll();
	}
	
	public Funcionario inserir (Funcionario f) {
		return this.repo.save(f);
	}
	
	public void deletar (Funcionario f) {
		this.repo.delete(f);
	}
	
	public Funcionario updateSalario (Funcionario f) {
		switch (f.getCargo().getNomeCargo()) {
		case "estagiario":
			f.setSalario(f.getSalario() + f.getSalario()*10/100);
			break;
		case "gerente":
			f.setSalario(f.getSalario() + f.getSalario()*20/100);
			break;
		case "diretor":
			f.setSalario(f.getSalario() + f.getSalario()*35/100);
			break;
		default:
			break;
		}
		return this.repo.save(f);
	}
	
	
	
}
