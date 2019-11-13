package bean;

import java.util.HashSet;
import java.util.Set;

public class Produit {
	private Long idProduit;
	private String lien_git;
	private String nom_logiciel;
	private String nom_technologie;
	private Float prix;
	private Float version;
	private Categorie categorie;
	private Set<Panier> paniers = new HashSet<Panier>();
	
	public Long getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(Long idProduit) {
		this.idProduit = idProduit;
	}
	public String getLien_git() {
		return lien_git;
	}
	public void setLien_git(String lien_git) {
		this.lien_git = lien_git;
	}
	public String getNom_logiciel() {
		return nom_logiciel;
	}
	public void setNom_logiciel(String nom_logiciel) {
		this.nom_logiciel = nom_logiciel;
	}
	public String getNom_technologie() {
		return nom_technologie;
	}
	public void setNom_technologie(String nom_technologie) {
		this.nom_technologie = nom_technologie;
	}
	public Float getPrix() {
		return prix;
	}
	public void setPrix(Float prix) {
		this.prix = prix;
	}
	public Float getVersion() {
		return version;
	}
	public void setVersion(Float version) {
		this.version = version;
	}
	public Produit() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Produit(String lien_git, String nom_logiciel, String nom_technologie, Float prix, Float version) {
		super();
		this.lien_git = lien_git;
		this.nom_logiciel = nom_logiciel;
		this.nom_technologie = nom_technologie;
		this.prix = prix;
		this.version = version;
	}
	public Produit(Long idProduit, String lien_git, String nom_logiciel, String nom_technologie, Float prix,
			Float version) {
		super();
		this.idProduit = idProduit;
		this.lien_git = lien_git;
		this.nom_logiciel = nom_logiciel;
		this.nom_technologie = nom_technologie;
		this.prix = prix;
		this.version = version;
	}
	
	

}
