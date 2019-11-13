package bean;

import java.util.Date;

public class Commande {
	private Long idCommande; 
	private Date date_commande;
	private Date date_livraison;
	private Panier panier;
	
	public Long getIdCommande() {
		return idCommande;
	}
	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}
	public Date getDate_commande() {
		return date_commande;
	}
	public void setDate_commande(Date date_commande) {
		this.date_commande = date_commande;
	}
	public Date getDate_livraison() {
		return date_livraison;
	}
	public void setDate_livraison(Date date_livraison) {
		this.date_livraison = date_livraison;
	}
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commande(Date date_commande, Date date_livraison) {
		super();
		this.date_commande = date_commande;
		this.date_livraison = date_livraison;
	}
	public Commande(Long idCommande, Date date_commande, Date date_livraison) {
		super();
		this.idCommande = idCommande;
		this.date_commande = date_commande;
		this.date_livraison = date_livraison;
	}
	
	
	

}
