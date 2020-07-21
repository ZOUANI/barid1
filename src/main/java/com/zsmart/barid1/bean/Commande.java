package com.zsmart.barid1.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Commande {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String reference;
	private Double qteTotalProduitCommande;
	private Double qteTotalProduitReception;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getReference() {
		return reference;
	}
	public void setReference(String reference) {
		this.reference = reference;
	}
	public Double getQteTotalProduitCommande() {
		return qteTotalProduitCommande;
	}
	public void setQteTotalProduitCommande(Double qteTotalProduitCommande) {
		this.qteTotalProduitCommande = qteTotalProduitCommande;
	}
	public Double getQteTotalProduitReception() {
		return qteTotalProduitReception;
	}
	public void setQteTotalProduitReception(Double qteTotalProduitReception) {
		this.qteTotalProduitReception = qteTotalProduitReception;
	}
	@Override
	public String toString() {
		return "Commande [id=" + id + ", reference=" + reference + ", qteTotalProduitCommande="
				+ qteTotalProduitCommande + ", qteTotalProduitReception=" + qteTotalProduitReception + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Commande other = (Commande) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
