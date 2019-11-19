package bean;

import java.util.HashSet;
import java.util.Set;

public class Client extends Compte{
    private boolean etat;
    private Panier panier;
    private Set<Demande> demandes = new HashSet<Demande>();

    public boolean getEtat() {
        return etat;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }
    
    public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}
	
	

	public Set<Demande> getDemandes() {
		return demandes;
	}

	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}

	public Client() {

    }


	public Client(boolean etat) {
		super();
		this.etat = etat;
	}

	public Client(boolean etat, Panier panier, Set<Demande> demandes) {
		super();
		this.etat = etat;
		this.panier = panier;
		this.demandes = demandes;
	}

	
	
	

    
    
    
}
