package br.com.cassi.funcionarios.dto;

import br.com.cassi.funcionarios.model.Empresa;

public class RequisicaoEmpresa {

	private Long id_empresa; 
	private String nome_empresa;
	
	
	
	
	public Long getId_empresa() {
		return id_empresa;
	}
	public void setId_empresa(Long id_empresa) {
		this.id_empresa = id_empresa;
	}
	public String getNome_empresa() {
		return nome_empresa;
	}
	public void setNome_empresa(String nome_empresa) {
		this.nome_empresa = nome_empresa;
	}
	
	
	public Empresa toEmpresa () {
		
		Empresa empresa = new Empresa (); 
		
		empresa.setNome_empresa(nome_empresa);
		
		return empresa;
		
	
		
	}
	

	
}
