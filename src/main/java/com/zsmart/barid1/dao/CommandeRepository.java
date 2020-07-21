package com.zsmart.barid1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zsmart.barid1.bean.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Long> {

	Commande findByReference(String reference);
	// findBy + deleteBy
	// findAll + save + update == error
}
