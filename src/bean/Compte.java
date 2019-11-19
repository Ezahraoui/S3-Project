package bean;

public class Compte {
	private Long id_compte;
    private String nom;
	private String prenom;
    private String email;
    private String password;
    private String cin;
    private String adresse;
    private String num_telephone;
    private String privilege;
    
    
    

	public Long getId_compte() {
		return id_compte;
	}

	public void setId_compte(Long id_compte) {
		this.id_compte = id_compte;
	}

	public String getNum_telephone() {
		return num_telephone;
	}

	public void setNum_telephone(String num_telephone) {
		this.num_telephone = num_telephone;
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
		return num_telephone;
	}

	public void setNumTelephone(String num_telephone) {
		this.num_telephone = num_telephone;
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
			String num_telephone, String privilege) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.cin = cin;
		this.adresse = adresse;
		this.num_telephone = num_telephone;
		this.privilege = privilege;
	}

	public Compte(Long id_compte, String nom, String prenom, String email, String password, String cin, String adresse,
			String num_telephone, String privilege) {
		super();
		this.id_compte = id_compte;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.password = password;
		this.cin = cin;
		this.adresse = adresse;
		this.num_telephone = num_telephone;
		this.privilege = privilege;
	}


	
	
	
	
	
     

}
