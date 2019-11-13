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

	public Client() {

    }


	public Client(boolean etat) {
		super();
		this.etat = etat;
	}

	public Client(Long idCompte, String nom, String prenom, String email, String password, String adresse,
			String numTelephone, boolean privilege) {
		super(idCompte, nom, prenom, email, password, adresse, numTelephone, privilege);
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String prenom, String email, String password, String adresse, String numTelephone,
			boolean privilege) {
		super(nom, prenom, email, password, adresse, numTelephone, privilege);
		// TODO Auto-generated constructor stub
	}

    
    
    
}
