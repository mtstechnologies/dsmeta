package br.com.mts.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mts.dsmeta.entities.Sale;

/**
 * componente criado para ser responsavel para acessar o banco de dados
 * @author Michael
 *
 */
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
