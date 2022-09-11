package br.com.cassi.funcionarios.model;


import java.util.List;

import javax.persistence.*;

@Entity
public class Squad {

		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(insertable = false, nullable= true)
		private Long id_squad;
		
		private String nome_squad; 
		private String descricao_squad;
		
		
		@OneToMany(mappedBy = "squad")
		
		private List<Funcionario> funcionarioList;
		
		
		public List<Funcionario> getFuncionarioList() {
			return funcionarioList;
		}
		public void setFuncionarioList(List<Funcionario> funcionarioList) {
			this.funcionarioList = funcionarioList;
		}
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
		
		
		
	

}
