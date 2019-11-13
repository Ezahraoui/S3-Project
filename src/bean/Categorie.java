package bean;

import java.util.*;

public class Categorie {
	private Long idCategorie;
	private String nom_categorie;
	private String subtitle_categorie;
	private Set<Produit> produits = new HashSet<Produit>();
	
	public Long getIdCategorie() {
		return idCategorie;
	}

	public void setIdCategorie(Long idCategorie) {
		this.idCategorie = idCategorie;
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

	public Categorie(Long idCategorie, String nom_categorie, String subtitle_categorie) {
		super();
		this.idCategorie = idCategorie;
		this.nom_categorie = nom_categorie;
		this.subtitle_categorie = subtitle_categorie;
	}
}
