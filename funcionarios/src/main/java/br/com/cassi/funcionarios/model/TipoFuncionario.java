package br.com.cassi.funcionarios.model;

import java.util.List;

import javax.persistence.*;

@Entity
public class TipoFuncionario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_tipo_funcionario;
	
	private String tipo_funcionario_nome;

	


	@OneToMany(mappedBy = "tipoFuncionario")
	public List<Funcionario> funcionarioList;

	
	
	
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

	
}
