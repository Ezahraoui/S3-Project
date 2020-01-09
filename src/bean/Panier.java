package bean;

import java.util.Set;

public class Panier {
	private Long id_panier;
	private double total;
	private Client client;
	private Set<Produit> produits;
	private Set<Commande> commandes;
	public Long getId_panier() {
		return id_panier;
	}
	public void setId_panier(Long id_panier) {
		this.id_panier = id_panier;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public Set<Produit> getProduits() {
		return produits;
	}
	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}
	public Set<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}
	
	
	
	
}
