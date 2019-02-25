package br.com.sinn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sinn.model.Funcionario;

public interface FuncionarioRepo extends JpaRepository<Funcionario, Integer>{

}
