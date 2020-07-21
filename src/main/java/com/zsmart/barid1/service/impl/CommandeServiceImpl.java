package com.zsmart.barid1.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zsmart.barid1.bean.Commande;
import com.zsmart.barid1.dao.CommandeRepository;

@Service
public class CommandeServiceImpl {

	@Autowired
	private CommandeRepository commandeRepository;

	public int recevoir(String reference,Double qteTotalProduit) {
		Commande commande=findByReference(reference);
		if(commande==null) {
			return -1;
		}else if(qteTotalProduit+commande.getQteTotalProduitReception()>commande.getQteTotalProduitCommande()) {
			return -2;
		}else {
			commande.setQteTotalProduitReception(qteTotalProduit+commande.getQteTotalProduitReception());
			save(commande); // create + update
			return 1;
		}
	}
	public Commande findByReference(String reference) {
		return commandeRepository.findByReference(reference);
	}

	public Commande save(Commande entity) {
		return commandeRepository.save(entity);
	}

	public List<Commande> findAll() {
		return commandeRepository.findAll();
	}
	
	
}
