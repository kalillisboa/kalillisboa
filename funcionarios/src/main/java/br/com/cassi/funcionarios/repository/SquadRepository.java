package br.com.cassi.funcionarios.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cassi.funcionarios.model.Funcionario;
import br.com.cassi.funcionarios.model.Squad;



@Repository
public interface SquadRepository extends JpaRepository<Squad, Long>{

	
		
		
		
		public List<Squad> findAll();
		
	
	
	
}



