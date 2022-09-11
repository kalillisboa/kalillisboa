package br.com.cassi.funcionarios.model;

import javax.persistence.*;

@Entity
public class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_funcionario;
	private String nome_funcionario;

	private String termo_nomeacao;
	private String observacoes;
	private Integer posicao;


	

	

	public Long getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getNome_funcionario() {
		return nome_funcionario;
	}

	public void setNome_funcionario(String nome_funcionario) {
		this.nome_funcionario = nome_funcionario;
	}

	public String getTermo_nomeacao() {
		return termo_nomeacao;
	}

	public void setTermo_nomeacao(String termo_nomeacao) {
		this.termo_nomeacao = termo_nomeacao;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public void setPosicao(Integer posicao) {
		this.posicao = posicao;
	}

	public Integer getPosicao() {
		return posicao;
	}

	@ManyToOne
	@JoinColumn(name = "cargo_id", nullable = true, referencedColumnName = "id_cargo")
	private Cargo cargo;

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Cargo getCargo() {
		return cargo;
	}

	@ManyToOne
	@JoinColumn(name = "empresa_id", nullable = false, referencedColumnName = "id_empresa")
	private Empresa empresa;

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	@ManyToOne
	@JoinColumn(name = "squad_id", nullable = true, referencedColumnName = "id_squad")
	private Squad squad;

	
	
	public void setSquad(Squad squad) {
		this.squad = squad;
	}

	
	public Squad getSquad() {
		
				
		return squad;
		
	}

}
