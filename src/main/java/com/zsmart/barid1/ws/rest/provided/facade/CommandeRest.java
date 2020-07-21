package com.zsmart.barid1.ws.rest.provided.facade;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zsmart.barid1.bean.Commande;
import com.zsmart.barid1.service.impl.CommandeServiceImpl;

@RestController
@RequestMapping("stock-api/commande")
public class CommandeRest {
	@Autowired
	private CommandeServiceImpl commandeServiceImpl;

	@PutMapping("/reference/{reference}/qteTotalProduit/{qteTotalProduit}")
	public int recevoir(@PathVariable String reference,@PathVariable  Double qteTotalProduit) {
		return commandeServiceImpl.recevoir(reference, qteTotalProduit);
	}
	
	@GetMapping("/reference/{reference}")
	public Commande findByReference(@PathVariable String reference) {
		return commandeServiceImpl.findByReference(reference);
	}

	@PostMapping("/")
	public Commande save(@RequestBody Commande entity) {
		return commandeServiceImpl.save(entity);
	}
	@GetMapping("/")
	public List<Commande> findAll() {
		return commandeServiceImpl.findAll();
	}

}
