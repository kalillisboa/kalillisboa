package br.com.cassi.funcionarios.dto;



import br.com.cassi.funcionarios.model.Cargo;
import br.com.cassi.funcionarios.model.Empresa;
import br.com.cassi.funcionarios.model.Funcionario;
import br.com.cassi.funcionarios.model.Squad;
import br.com.cassi.funcionarios.repository.FuncionarioRepository;

public class RequisicaoFuncionario {

	private String termo_nomeacao;
	private String observacoes;
	

	private String squad_nome;
	private int posicao;
	private String cargo_nome;
	private String nome;
	private String empresa_nome;
	private Long id_funcionario;

	public Long getId_funcionario() {
		return id_funcionario;
	}

	public void setId_funcionario(Long id_funcionario) {
		this.id_funcionario = id_funcionario;
	}

	public String getCargo_nome() {
		return cargo_nome;
	}

	public void setCargo_nome(String cargo_nome) {
		this.cargo_nome = cargo_nome;
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

	public String getSquad_nome() {
		return squad_nome;
	}

	public void setSquad_nome(String squad_nome) {
		this.squad_nome = squad_nome;
	}

	public int getPosicao() {
		return posicao;
	}

	public void setPosicao(int posicao) {
		this.posicao = posicao;
	}

	public String getCargo() {
		return cargo_nome;
	}

	public void setCargo(String cargo_nome) {
		this.cargo_nome = cargo_nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmpresa_nome() {
		return empresa_nome;
	}

	public void setEmpresa_nome(String empresa_nome) {
		this.empresa_nome = empresa_nome;
	}

	public Funcionario toFuncionario() {
		
		
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome_funcionario(nome);
		funcionario.setObservacoes(observacoes);
		funcionario.setPosicao(posicao);
		funcionario.setTermo_nomeacao(termo_nomeacao);

		Empresa empresa = new Empresa();

		empresa.setId_empresa(Long.parseLong(empresa_nome));

		funcionario.setEmpresa(empresa);
		
		Cargo cargo = new Cargo();

		cargo.setId_cargo(Long.parseLong(cargo_nome));

		funcionario.setCargo(cargo);
		
		
		
		
		if(this.squad_nome.equals("0")) {
		
			this.squad_nome= null;
			return funcionario;
		}
		else
		{
			
		Squad squad = new Squad();

			squad.setId_squad(Long.parseLong(squad_nome));
			funcionario.setSquad(squad);
			return funcionario;
		}
		
		
			
		

	}

	public Funcionario alteraFuncionario(FuncionarioRepository repositorio) {

		Funcionario funcionario = repositorio.getReferenceById(id_funcionario);

		funcionario.setNome_funcionario(nome);
		funcionario.setObservacoes(observacoes);
		funcionario.setPosicao(posicao);
		funcionario.setTermo_nomeacao(termo_nomeacao);

		Empresa empresa = new Empresa ();
		
		empresa.setId_empresa(Long.parseLong(empresa_nome));
		
		funcionario.setEmpresa(empresa);
			
		Cargo cargo = new Cargo();

		cargo.setId_cargo(Long.parseLong(cargo_nome));

		funcionario.setCargo(cargo);
		

		
		if(funcionario.getSquad() == null) {
			
			this.squad_nome= null;
			return funcionario;
		}
		else
		{
			
			Squad squad = new Squad();

			squad.setId_squad(Long.parseLong(squad_nome));
			funcionario.setSquad(squad);
			return funcionario;
		
		}

	}

}
