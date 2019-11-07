package bean;

public class Compte {
	private Long idCompte;
    private String nom;
	private String prenom;
    private String email;
    private String password;
    private String adresse;
    private String numTelephone;
     
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

	public Compte() {
    	 
     }

	public Compte(String nom, String prenom, String email, String password, String adresse, String numTelephone) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.adresse = adresse;
		this.numTelephone = numTelephone;
	}

	public Compte(Long idCompte, String nom, String prenom, String email, String password, String adresse,
			String numTelephone) {
		super();
		this.idCompte = idCompte;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.adresse = adresse;
		this.numTelephone = numTelephone;
	}
	
	
     

}
