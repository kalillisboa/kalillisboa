package br.com.cassi.funcionarios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cassi.funcionarios.model.Contrato;

@Repository
public interface ContratoRepository extends JpaRepository<Contrato, Long> {

}
