package br.com.mts.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.mts.dsmeta.entities.Sale;
import br.com.mts.dsmeta.services.SaleService;

/**
 * componente que implementa a API, que disponibilizará os endpoints para o frontend acessar o backend
 * @author Michael
 *
 */

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	@GetMapping
	public List<Sale> findSales() {
		return service.findSales();
	}
	
}
