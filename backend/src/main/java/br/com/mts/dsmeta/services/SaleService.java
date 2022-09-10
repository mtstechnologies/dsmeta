package br.com.mts.dsmeta.services;

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
	
	public Page<Sale> findSales(Pageable pageable){
		return repository.findAll(pageable);
	}
}
