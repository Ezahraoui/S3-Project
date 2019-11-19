package bean;

public class Demande {
	private Long id_demande;
	private String sujet;
	private byte[] document_joindre;
	private String message;
	private Client client;
	private AdministrateurTechnique administrateurTechnique;
	
	public Long getIdDemande() {
		return id_demande;
	}
	public void setIdDemande(Long id_demande) {
		this.id_demande = id_demande;
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
	public Demande() {
		
	}
	
	
	
	public Demande(byte[] document_joindre) {
		super();
		this.document_joindre = document_joindre;
	}
	public Demande(String sujet, byte[] document_joindre, String message, Client client,
			AdministrateurTechnique administrateurTechnique) {
		super();
		this.sujet = sujet;
		this.document_joindre = document_joindre;
		this.message = message;
		this.client = client;
		this.administrateurTechnique = administrateurTechnique;
	}
	public Demande(Long id_demande, String sujet, byte[] document_joindre, String message) {
		super();
		this.id_demande = id_demande;
		this.sujet = sujet;
		this.document_joindre = document_joindre;
		this.message = message;
	}
	
}
