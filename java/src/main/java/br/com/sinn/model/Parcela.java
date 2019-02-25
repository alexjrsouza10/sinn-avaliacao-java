package br.com.sinn.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Parcela implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="codigo_adiantamento")
	private Adiantamento adiantamento;
	
	@Column(name="valor_parcela")
	private Double valorParcela;
	
	@Column(name="num_parcela")
	private Integer numParcela;
	
	@Column(name="data_pagamento")
	private Date dataPagamento;
	
	@Column(name="pago")
	private Boolean pago;
	
	public Parcela() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Adiantamento getAdiantamento() {
		return adiantamento;
	}

	public void setAdiantamento(Adiantamento adiantamento) {
		this.adiantamento = adiantamento;
	}

	public Integer getNumParcela() {
		return numParcela;
	}

	public void setNumParcela(Integer numParcela) {
		this.numParcela = numParcela;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	public Boolean getPago() {
		return pago;
	}

	public void setPago(Boolean pago) {
		this.pago = pago;
	}
	
}
