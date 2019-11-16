package bean;

public class Compte {
	private Long idCompte;
    private String nom;
	private String prenom;
    private String email;
    private String password;
    private String cin;
    private String adresse;
    private String numTelephone;
    private String privilege;
    

	public Long getIdCompte() {
		return idCompte;
	}

	public void setIdCompte(Long idCompte) {
		this.idCompte = idCompte;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getNumTelephone() {
		return numTelephone;
	}

	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}
	
	
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}


	public String getPrivilege() {
		return privilege;
	}

	public void setPrivilege(String privilege) {
		this.privilege = privilege;
	}

	public Compte() {
    	 
     }

	public Compte(String nom, String prenom, String email, String password, String cin, String adresse,
			String numTelephone, String privilege) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.cin = cin;
		this.adresse = adresse;
		this.numTelephone = numTelephone;
		this.privilege = privilege;
	}

	public Compte(Long idCompte, String nom, String prenom, String email, String password, String cin, String adresse,
			String numTelephone, String privilege) {
		super();
		this.idCompte = idCompte;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.cin = cin;
		this.adresse = adresse;
		this.numTelephone = numTelephone;
		this.privilege = privilege;
	}


	
	
	
	
	
     

}
