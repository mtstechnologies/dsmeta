package br.com.mts.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
	
	public List<Sale> findSales(){
		return repository.findAll();
	}
}
