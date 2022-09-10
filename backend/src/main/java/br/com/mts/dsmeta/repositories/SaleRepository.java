package br.com.mts.dsmeta.repositories;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.com.mts.dsmeta.entities.Sale;

/**
 * componente criado para ser responsavel para acessar o banco de dados
 * @author Michael
 *
 */
public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	//implementando JPQL de busca por data minima e maxima abaixo
	
	@Query("SELECT obj FROM Sale obj WHERE obj.date BETWEEN :min AND :max ORDER BY obj.amount DESC")
	Page<Sale> findSales(LocalDate min, LocalDate max, Pageable pageable);

}
