package br.com.cassi.funcionarios.dto;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.cassi.funcionarios.controller.CargoController;
import br.com.cassi.funcionarios.model.Cargo;
import br.com.cassi.funcionarios.repository.CargoRepository;

public class RequisicaoCargo {

	private String nome_cargo;
	private String nivel_cargo;
	private Integer step_cargo;
	private float valor_hora;
	private Long id_cargo;
	
	@Autowired
	private CargoRepository repositorio;
	
	public Long getId_cargo() {
		return id_cargo;
	}

	public void setId_cargo(Long id_cargo) {
		this.id_cargo = id_cargo;
	}

	private float faturamento_cargo;
	private String tipo_cargo;

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

	public void setFaturamento_cargo(float faturamento_cargo) {
		this.faturamento_cargo = faturamento_cargo;
	}

	public String getTipo_cargo() {
		return tipo_cargo;
	}

	public void setTipo_cargo(String tipo_cargo) {
		this.tipo_cargo = tipo_cargo;
	}
	
	public CargoRepository getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(CargoRepository repositorio) {
		this.repositorio = repositorio;
	}

	public Cargo toCargo() {

		
			Cargo cargo = new Cargo();

			cargo.setId_cargo(id_cargo);
			cargo.setNome_cargo(nome_cargo);
			cargo.setTipo_cargo(tipo_cargo);
			cargo.setNivel_cargo(nivel_cargo);
			cargo.setStep_cargo(step_cargo);
			cargo.setValor_hora(valor_hora);

			return cargo;

	}

	
	public Cargo alteraCargo (CargoRepository repositorio) {
		
		Cargo cargo = repositorio.getReferenceById(id_cargo);
		
		cargo.setNome_cargo(nome_cargo);
		cargo.setTipo_cargo(tipo_cargo);
		cargo.setNivel_cargo(nivel_cargo);
		cargo.setStep_cargo(step_cargo);
		cargo.setValor_hora(valor_hora);

		return cargo;
		
		
		
	}
	

}
