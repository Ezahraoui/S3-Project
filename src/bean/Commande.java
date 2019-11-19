package bean;

import java.util.Date;

public class Commande {
	private Long id_commande; 
	private Date date_commande;
	private Date date_livraison;
	private Panier panier;
	
	
	
	public Long getId_commande() {
		return id_commande;
	}
	public void setId_commande(Long id_commande) {
		this.id_commande = id_commande;
	}
	public Panier getPanier() {
		return panier;
	}
	public void setPanier(Panier panier) {
		this.panier = panier;
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
	public Commande(Long id_commande, Date date_commande, Date date_livraison) {
		super();
		this.id_commande = id_commande;
		this.date_commande = date_commande;
		this.date_livraison = date_livraison;
	}
	
	
	

}
