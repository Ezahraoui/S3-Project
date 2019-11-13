package bean;

public class ChefDeProjet extends Compte{
	private boolean etatCP;
	private String lien_git_CP;
	private double rate;
	
	public boolean isEtatCP() {
		return etatCP;
	}
	public void setEtatCP(boolean etatCP) {
		this.etatCP = etatCP;
	}
	public String getLien_git_CP() {
		return lien_git_CP;
	}
	public void setLien_git_CP(String lien_git_CP) {
		this.lien_git_CP = lien_git_CP;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	public ChefDeProjet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChefDeProjet(Long idCompte, String nom, String prenom, String email, String password, String adresse,
			String numTelephone, boolean privilege) {
		super(idCompte, nom, prenom, email, password, adresse, numTelephone, privilege);
		// TODO Auto-generated constructor stub
	}
	public ChefDeProjet(String nom, String prenom, String email, String password, String adresse, String numTelephone,
			boolean privilege) {
		super(nom, prenom, email, password, adresse, numTelephone, privilege);
		// TODO Auto-generated constructor stub
	}
	public ChefDeProjet(boolean etatCP, String lien_git_CP, double rate) {
		super();
		this.etatCP = etatCP;
		this.lien_git_CP = lien_git_CP;
		this.rate = rate;
	}
}
