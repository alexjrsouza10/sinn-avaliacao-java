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
import javax.persistence.OneToMany;

@Entity
public class Adiantamento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@Column(name="funcionario")
	private Funcionario funcionario;
	
	@Column(name="valor")
	private Double valor;
	
	@Column(name="data_adiantamento")
	private Date dataAdiantamento;
	
	@Column(name="data_devolucao")
	private Date dataDevolucao;
	
	@Column(name="parcelado")
	private Boolean parcelado;
	
	
	@Column(name="quitado")
	private Boolean quitado;
	
	@Column(name="valor_devolvido")
	private Double valorDevolvido;
	
	@OneToMany
	@JoinColumn(name="codigo_parcela")
	private Parcela parcela;
	
	public Adiantamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public Date getDataAdiantamento() {
		return dataAdiantamento;
	}

	public void setDataAdiantamento(Date dataAdiantamento) {
		this.dataAdiantamento = dataAdiantamento;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Boolean getParcelado() {
		return parcelado;
	}

	public void setParcelado(Boolean parcelado) {
		this.parcelado = parcelado;
	}


	public Boolean getQuitado() {
		return quitado;
	}

	public void setQuitado(Boolean quitado) {
		this.quitado = quitado;
	}

	public Double getValorDevolvido() {
		return valorDevolvido;
	}

	public void setValorDevolvido(Double valorDevolvido) {
		this.valorDevolvido = valorDevolvido;
	}

	public Parcela getParcela() {
		return parcela;
	}

	public void setParcela(Parcela parcela) {
		this.parcela = parcela;
	}

}
