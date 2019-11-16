package bean;

import java.util.HashSet;
import java.util.Set;

public class Panier {
	private Long idPanier;
	private String nom_panier;
	private double total_payer;
	private boolean etat_commande;
	private Client client;
	private Set<Produit> produits = new HashSet<Produit>();
	private Set<Commande> commandes = new HashSet<Commande>();
	
	public Long getIdPanier() {
		return idPanier;
	}
	public void setIdPanier(Long idPanier) {
		this.idPanier = idPanier;
	}
	public double getTotal_payer() {
		return total_payer;
	}
	public void setTotal_payer(double total_payer) {
		this.total_payer = total_payer;
	}
	public boolean getEtat_commande() {
		return etat_commande;
	}
	public void setEtat_commande(boolean etat_commande) {
		this.etat_commande = etat_commande;
	}
	
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	
	
	public String getNom_panier() {
		return nom_panier;
	}
	public void setNom_panier(String nom_panier) {
		this.nom_panier = nom_panier;
	}
	public Panier() {
		
	}
	public Panier(double total_payer, boolean etat_commande) {
		super();
		this.total_payer = total_payer;
		this.etat_commande = etat_commande;
	}

	public Panier(Long idPanier, String nom_panier, double total_payer, boolean etat_commande) {
		super();
		this.idPanier = idPanier;
		this.nom_panier = nom_panier;
		this.total_payer = total_payer;
		this.etat_commande = etat_commande;
	}
	
	
	
}
