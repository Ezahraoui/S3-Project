package bean;

public class DemandeAdaptee{
	private Long id_demande_adaptee;
	private String sujet;
	private byte[] document_joindre;
	private String message;
	private double capaciteFinancement;
	private Client client;
	private AdministrateurTechnique administrateurTechnique;
	
	public Long getId_demande_adaptee() {
		return id_demande_adaptee;
	}
	public void setId_demande_adaptee(Long id_demande_adaptee) {
		this.id_demande_adaptee = id_demande_adaptee;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	public byte[] getDocument_joindre() {
		return document_joindre;
	}
	public void setDocument_joindre(byte[] document_joindre) {
		this.document_joindre = document_joindre;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public double getCapaciteFinancement() {
		return capaciteFinancement;
	}
	public void setCapaciteFinancement(double capaciteFinancement) {
		this.capaciteFinancement = capaciteFinancement;
	}
	
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	
	public AdministrateurTechnique getAdministrateurTechnique() {
		return administrateurTechnique;
	}
	public void setAdministrateurTechnique(AdministrateurTechnique administrateurTechnique) {
		this.administrateurTechnique = administrateurTechnique;
	}
	public DemandeAdaptee(Long id_demande_adaptee, String sujet, byte[] document_joindre, String message,
			double capaciteFinancement) {
		super();
		this.id_demande_adaptee = id_demande_adaptee;
		this.sujet = sujet;
		this.document_joindre = document_joindre;
		this.message = message;
		this.capaciteFinancement = capaciteFinancement;
	}
	public DemandeAdaptee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}