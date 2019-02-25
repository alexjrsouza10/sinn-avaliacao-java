package br.com.sinn.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Empresa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="cnpj")
	private Integer cnpj;
	
	@Column(name="donoEmpresa")
	private String donoEmpresa;
	
	public Empresa() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getCnpj() {
		return cnpj;
	}
	public void setCnpj(Integer cnpj) {
		this.cnpj = cnpj;
	}
	public String getDonoEmpresa() {
		return donoEmpresa;
	}
	public void setDonoEmpresa(String donoEmpresa) {
		this.donoEmpresa = donoEmpresa;
	}
	
}
