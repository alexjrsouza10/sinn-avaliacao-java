package br.com.sinn.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sinn.model.Adiantamento;
import br.com.sinn.repository.AdiantamentoRepo;

@Service
public class AdiantamentoService {

	@Autowired
	private AdiantamentoRepo repo;
	
	public List<Adiantamento> findAll (){
		return this.repo.findAll();
	}
	
	public void delete (Adiantamento a) {
		this.repo.delete(a);
	}
	
	public Adiantamento solicitacao (Adiantamento a) {
		
		if (a.getValor() < 500) {
			
			if (a.getParcelado() == false && a.getParcela().getNumParcela() <= 1) {
				
				a.setValorDevolvido(a.getValor() + a.getValor()*15/100);
				
			} else if (a.getParcelado() == true) {
				
				Double parcelas = a.getValor()/a.getParcela().getNumParcela();
				a.getParcela().setValorParcela(parcelas + parcelas*20/100);
				a.setValorDevolvido(a.getParcela().getValorParcela()*a.getParcela().getNumParcela());
			}
			
		} else if (a.getValor() > 500) {
			
			if (a.getParcelado() == false && a.getParcela().getNumParcela() <= 1) {
				
				a.setValorDevolvido(a.getValor() + a.getValor()*13/100);
				
			} else if (a.getParcelado() == true && a.getParcela().getNumParcela() > 1) {
				
				Double parcelas = a.getValor()/a.getParcela().getNumParcela();
				a.getParcela().setValorParcela(parcelas + parcelas*18/100);
				a.setValorDevolvido(a.getParcela().getValorParcela()*a.getParcela().getNumParcela());
			}
		} 
		
		return this.repo.save(a);
	}
}
