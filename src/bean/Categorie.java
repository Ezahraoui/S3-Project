package bean;

import java.util.*;

public class Categorie {
	private Long id_categorie;
	private String nom_categorie;
	private String subtitle_categorie;
	private Set<Produit> produits = new HashSet<Produit>();
	
	
	
	public Long getId_categorie() {
		return id_categorie;
	}

	public void setId_categorie(Long id_categorie) {
		this.id_categorie = id_categorie;
	}

	public Set<Produit> getProduits() {
		return produits;
	}

	public void setProduits(Set<Produit> produits) {
		this.produits = produits;
	}


	public String getNom_categorie() {
		return nom_categorie;
	}

	public void setNom_categorie(String nom_categorie) {
		this.nom_categorie = nom_categorie;
	}

	public String getSubtitle_categorie() {
		return subtitle_categorie;
	}

	public void setSubtitle_categorie(String subtitle_categorie) {
		this.subtitle_categorie = subtitle_categorie;
	}

	public Categorie() {

	}

	public Categorie(String nom_categorie, String subtitle_categorie) {
		super();
		this.nom_categorie = nom_categorie;
		this.subtitle_categorie = subtitle_categorie;
	}

	public Categorie(Long id_categorie, String nom_categorie, String subtitle_categorie) {
		super();
		this.id_categorie = id_categorie;
		this.nom_categorie = nom_categorie;
		this.subtitle_categorie = subtitle_categorie;
	}
}
