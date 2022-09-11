package br.com.cassi.funcionarios.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.cassi.funcionarios.model.Cargo;





@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long>{

	
	
	public List<Cargo> findAll();
	
	
	
	
}
