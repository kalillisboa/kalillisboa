package br.com.testcrud.model;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;


@Component
public class RespostaModelo {

	
	private String mensagem;
	
	
	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	
}
