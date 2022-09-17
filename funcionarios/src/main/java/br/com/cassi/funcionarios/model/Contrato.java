package br.com.cassi.funcionarios.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contrato {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_contrato;
	private String numero_contrato; 
	private String comentario; 
	private String tipo_acao; 
	private String tipo_contrato;
	private String numero_contrato_juridico;
	
	public Long getId_contrato() {
		return id_contrato;
	}
	public void setId_contrato(Long id_contrato) {
		this.id_contrato = id_contrato;
	}
	public String getNumero_contrato_juridico() {
		return numero_contrato_juridico;
	}
	public void setNumero_contrato_juridico(String numero_contrato_juridico) {
		this.numero_contrato_juridico = numero_contrato_juridico;
	}
	public String getNumero_contrato() {
		return numero_contrato;
	}
	public void setNumero_contrato(String numero_contrato) {
		this.numero_contrato = numero_contrato;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getTipo_acao() {
		return tipo_acao;
	}
	public void setTipo_acao(String tipo_acao) {
		this.tipo_acao = tipo_acao;
	}
	public String getTipo_contrato() {
		return tipo_contrato;
	}
	public void setTipo_contrato(String tipo_contrato) {
		this.tipo_contrato = tipo_contrato;
	}
	
	
	
	@ManyToOne
	@JoinColumn (name = "empresa_id" , referencedColumnName = "id_empresa", nullable = false )
	private Empresa empresa;


	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	} 
	
	
	
	
	
	
	
	

}
