package br.com.sinn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sinn.model.Empresa;

public interface EmpresaRepo extends JpaRepository<Empresa, Integer>{

}
