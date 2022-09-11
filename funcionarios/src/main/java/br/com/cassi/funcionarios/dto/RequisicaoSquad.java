package br.com.cassi.funcionarios.dto;

import br.com.cassi.funcionarios.model.Squad;

public class RequisicaoSquad {

	
	
	
	
	private Long id_squad;
	private String nome_squad; 
	private String descricao_squad;
	
	
	public Long getId_squad() {
		return id_squad;
	}
	public void setId_squad(Long id_squad) {
		this.id_squad = id_squad;
	}
	public String getNome_squad() {
		return nome_squad;
	}
	public void setNome_squad(String nome_squad) {
		this.nome_squad = nome_squad;
	}
	public String getDescricao_squad() {
		return descricao_squad;
	}
	public void setDescricao_squad(String descricao_squad) {
		this.descricao_squad = descricao_squad;
	}
	
	
	public Squad toSquad() {
		
		Squad squad = new Squad();
		
		squad.setNome_squad(nome_squad);
		squad.setDescricao_squad(descricao_squad);
		
		return squad;
	}
	
}
