package br.com.cassi.funcionarios.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Cargo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id_cargo;

	private String nome_cargo;
	private String nivel_cargo;
	private Integer step_cargo;
	private float valor_hora;

	@Column(insertable = false, updatable = false)
	private float faturamento_cargo;

	private String tipo_cargo;

	public void setFaturamento_cargo(float faturamento_cargo) {
		this.faturamento_cargo = faturamento_cargo;
	}

	public String getTipo_cargo() {
		return tipo_cargo;
	}

	public void setTipo_cargo(String tipo_cargo) {
		this.tipo_cargo = tipo_cargo;
	}

	public List<Funcionario> getFuncionarioList() {
		return funcionarioList;
	}

	public void setFuncionarioList(List<Funcionario> funcionarioList) {
		this.funcionarioList = funcionarioList;
	}

	@OneToMany(mappedBy = "cargo")
	private List<Funcionario> funcionarioList;

	public Long getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(Long id_cargo) {
		this.id_cargo = id_cargo;
	}

	public String getNome_cargo() {
		return nome_cargo;
	}

	public void setNome_cargo(String nome_cargo) {
		this.nome_cargo = nome_cargo;
	}

	public String getNivel_cargo() {
		return nivel_cargo;
	}

	public void setNivel_cargo(String nivel_cargo) {
		this.nivel_cargo = nivel_cargo;
	}

	public Integer getStep_cargo() {
		return step_cargo;
	}

	public void setStep_cargo(Integer step_cargo) {
		this.step_cargo = step_cargo;
	}

	public float getValor_hora() {
		return valor_hora;
	}

	public void setValor_hora(float valor_hora) {
		this.valor_hora = valor_hora;
	}

	public float getFaturamento_cargo() {
		return faturamento_cargo;
	}

}
