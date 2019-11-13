package bean;

public class AdministrateurTechnique extends Compte{

	public AdministrateurTechnique() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AdministrateurTechnique(Long idCompte, String nom, String prenom, String email, String password,
			String adresse, String numTelephone, boolean privilege) {
		super(idCompte, nom, prenom, email, password, adresse, numTelephone, privilege);
		// TODO Auto-generated constructor stub
	}

	public AdministrateurTechnique(String nom, String prenom, String email, String password, String adresse,
			String numTelephone, boolean privilege) {
		super(nom, prenom, email, password, adresse, numTelephone, privilege);
		// TODO Auto-generated constructor stub
	}

	
	

}
