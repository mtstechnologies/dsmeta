package br.com.mts.dsmeta.services;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.com.mts.dsmeta.entities.Sale;
import br.com.mts.dsmeta.repositories.SaleRepository;

/**
 * componente responsavel por fazer operações de negocios com vendas
 * @author Michael
 *
 */

@Service
public class SaleService {

	@Autowired
	private SaleRepository repository;
	
	//public List<Sale> findSales(){
		//return repository.findAll();
	//}para não retornar todos, irei criar uma paginação abaixo
	
	public Page<Sale> findSales(String minDate, String maxDate, Pageable pageable){
		
		LocalDate today = LocalDate.ofInstant(Instant.now(), ZoneId.systemDefault()); //pegando a data do sistema
		/*abaixo estou convertendo o conteudo minData, que esta vindo em forma de texto(String), para formato data */
		//LocalDate min = LocalDate.parse(minDate); 
		//LocalDate max = LocalDate.parse(maxDate); 
		LocalDate min = minDate.equals("") ? today.minusDays(365) : LocalDate.parse(minDate);/*pega a data minima de 1 ano atras*/
		LocalDate max = maxDate.equals("") ? today : LocalDate.parse(maxDate); /*expressão condicional ternário: se a data maxima for vazia, então pega a data do sistema, se não pega o maxData*/
		
		return repository.findSales(min, max, pageable);
	}
}
