package br.com.cassi.funcionarios.dto;

import br.com.cassi.funcionarios.model.Cargo;
import br.com.cassi.funcionarios.model.Empresa;
import br.com.cassi.funcionarios.model.Funcionario;
import br.com.cassi.funcionarios.model.Squad;
import br.com.cassi.funcionarios.model.TipoFuncionario;
import br.com.cassi.funcionarios.repository.FuncionarioRepository;

public class RequisicaoFuncionario {

	private String termo_nomeacao;
	private String observacoes;
	private Empresa empresa;
	private Squad squad;
	private Cargo cargo;
	private int posicao;
	private TipoFuncionario tipofuncionario;

	private String nome;

	private Long id_funcionario;

	public TipoFuncionario getTipofuncionario() {
		return tipofuncionario;
	}

	public void setTipofuncionario(TipoFuncionario tipofuncionario) {
		this.tipofuncionario = tipofuncionario;
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

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public Squad getSquad() {
		return squad;
	}

	public void setSquad(Squad squad) {
		this.squad = squad;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Long getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Funcionario toFuncionario() {

		Funcionario funcionario = new Funcionario();
		funcionario.setNome_funcionario(nome);
		funcionario.setObservacoes(observacoes);
		funcionario.setPosicao(posicao);
		funcionario.setTermo_nomeacao(termo_nomeacao);

		funcionario.setTipoFuncionario(tipofuncionario);

		funcionario.setEmpresa(empresa);

		funcionario.setCargo(cargo);

		funcionario.setSquad(squad);

		return funcionario;

	}

	public Funcionario alteraFuncionario(FuncionarioRepository repositorio) {

		Funcionario funcionario = repositorio.getReferenceById(id_funcionario);

		funcionario.setNome_funcionario(nome);
		funcionario.setObservacoes(observacoes);
		funcionario.setPosicao(posicao);
		funcionario.setTermo_nomeacao(termo_nomeacao);

		funcionario.setEmpresa(empresa);

		funcionario.setTipoFuncionario(tipofuncionario);

		funcionario.setCargo(cargo);

		funcionario.setSquad(null);

		funcionario.setSquad(squad);

		return funcionario;
	}

}
