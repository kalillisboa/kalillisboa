package br.com.cassi.funcionarios.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class Empresa {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_empresa; 
	private String nome_empresa;

	
	

		
	@OneToMany (mappedBy = "empresa")
	public List<Funcionario> funcionarioList;
	
	
	
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
	
	

	
	
}
