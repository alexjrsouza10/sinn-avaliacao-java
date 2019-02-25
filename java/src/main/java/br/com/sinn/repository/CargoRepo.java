package br.com.sinn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sinn.model.Cargo;

public interface CargoRepo extends JpaRepository<Cargo, Integer>{

}
