package br.com.sinn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sinn.model.Parcela;

public interface ParcelaRepo extends JpaRepository<Parcela, Integer>{

}
