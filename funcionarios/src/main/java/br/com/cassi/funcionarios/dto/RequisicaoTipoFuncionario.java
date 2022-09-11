package br.com.cassi.funcionarios.dto;

import br.com.cassi.funcionarios.model.TipoFuncionario;

public class RequisicaoTipoFuncionario {

	private Long id_tipo_funcionario;
	private String tipo_funcionario_nome;
	
	
	public Long getId_tipo_funcionario() {
		return id_tipo_funcionario;
	}
	public void setId_tipo_funcionario(Long id_tipo_funcionario) {
		this.id_tipo_funcionario = id_tipo_funcionario;
	}
	public String getTipo_funcionario_nome() {
		return tipo_funcionario_nome;
	}
	public void setTipo_funcionario_nome(String tipo_funcionario_nome) {
		this.tipo_funcionario_nome = tipo_funcionario_nome;
	}
	
	
	
	
		public TipoFuncionario toTipoFuncionario () {
		
			TipoFuncionario tipofuncionario = new TipoFuncionario (); 
		
			tipofuncionario.setTipo_funcionario_nome(tipo_funcionario_nome);
		
		return tipofuncionario;
		
		}
	
	
	
}
