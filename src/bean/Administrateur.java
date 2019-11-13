package bean;

public class Administrateur extends Compte{

	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrateur(Long idCompte, String nom, String prenom, String email, String password, String adresse,
			String numTelephone, boolean privilege) {
		super(idCompte, nom, prenom, email, password, adresse, numTelephone, privilege);
		// TODO Auto-generated constructor stub
	}

	public Administrateur(String nom, String prenom, String email, String password, String adresse, String numTelephone,
			boolean privilege) {
		super(nom, prenom, email, password, adresse, numTelephone, privilege);
		// TODO Auto-generated constructor stub
	}
}
