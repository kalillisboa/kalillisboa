package br.com.cassi.funcionarios.dto;

import br.com.cassi.funcionarios.model.Contrato;
import br.com.cassi.funcionarios.model.Empresa;
import br.com.cassi.funcionarios.repository.ContratoRepository;
import br.com.cassi.funcionarios.repository.EmpresaRepository;

public class RequisicaoContrato {
	
	
	private String comentario; 
	private String numero_contrato; 
	private String tipo_acao; 
	private String tipo_contrato; 
	private Empresa empresa;
	private String numero_contrato_juridico;
	
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public String getNumero_contrato() {
		return numero_contrato;
	}
	public void setNumero_contrato(String numero_contrato) {
		this.numero_contrato = numero_contrato;
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
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	} 
	
	public String getNumero_contrato_juridico() {
		return numero_contrato_juridico;
	}
	public void setNumero_contrato_juridico(String numero_contrato_juridico) {
		this.numero_contrato_juridico = numero_contrato_juridico;
	}
	
	
	public Contrato tocontrato(){
		
		Contrato contrato = new Contrato();
		
		contrato.setComentario(comentario);
		contrato.setTipo_acao(tipo_acao);
		contrato.setTipo_contrato(tipo_contrato);
		contrato.setEmpresa(empresa);
		contrato.setNumero_contrato_juridico(numero_contrato_juridico);
		contrato.setNumero_contrato(numero_contrato);
		
		
		
		return contrato;
	}

	
	

}
