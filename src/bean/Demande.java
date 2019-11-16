package bean;

public class Demande {
	private Long idDemande;
	private String sujet;
	private byte[] document_joindre;
	private Client client;
	private AdministrateurTechnique administrateurTechnique;
	
	public Long getIdDemande() {
		return idDemande;
	}
	public void setIdDemande(Long idDemande) {
		this.idDemande = idDemande;
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
	public Demande() {
		
	}
	public Demande(String sujet, byte[] document_joindre) {
		super();
		this.sujet = sujet;
		this.document_joindre = document_joindre;
	}
	public Demande(Long idDemande, String sujet, byte[] document_joindre) {
		super();
		this.idDemande = idDemande;
		this.sujet = sujet;
		this.document_joindre = document_joindre;
	}
}
