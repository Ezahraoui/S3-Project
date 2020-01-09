package bean;


import java.sql.Blob;
import java.util.Set;

public class Produit {
	private Long id_produit;
	private String nom;
	private Double prix;
	private Blob document;
	private Set<Panier> paniers;
	private Set<Commande> commandes;
	public Long getId_produit() {
		return id_produit;
	}
	public void setId_produit(Long id_produit) {
		this.id_produit = id_produit;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Double getPrix() {
		return prix;
	}
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	public Blob getDocument() {
		return document;
	}
	public void setDocument(Blob document) {
		this.document = document;
	}
	public Set<Panier> getPaniers() {
		return paniers;
	}
	public void setPaniers(Set<Panier> paniers) {
		this.paniers = paniers;
	}
	public Set<Commande> getCommandes() {
		return commandes;
	}
	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}
	public Produit() {
		
	}
	public Produit(Blob document) {
		this.document=document;
	}
	
}