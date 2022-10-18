package br.com.estudojavareact.estudojavareact.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "usuario")
@Getter
@Setter
public class UsuarioModelo {
    
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id_usuario; 
        private String nome_usuario;
        private String senha_usuario;








}
