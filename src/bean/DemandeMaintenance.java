package bean;

public class DemandeMaintenance{
	private Long id_demande_maintenance;
	private String sujet;
	private String description;
	private byte[] document_joindre;
	private String observation_complementaire;
	private Client client;
	private AdministrateurTechnique administrateurTechnique;
	
	public Long getId_demande_maintenance() {
		return id_demande_maintenance;
	}
	public void setId_demande_maintenance(Long id_demande_maintenance) {
		this.id_demande_maintenance = id_demande_maintenance;
	}
	public String getSujet() {
		return sujet;
	}
	public void setSujet(String sujet) {
		this.sujet = sujet;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public byte[] getDocument_joindre() {
		return document_joindre;
	}
	public void setDocument_joindre(byte[] document_joindre) {
		this.document_joindre = document_joindre;
	}
	
	public String getObservation_complementaire() {
		return observation_complementaire;
	}
	public void setObservation_complementaire(String observation_complementaire) {
		this.observation_complementaire = observation_complementaire;
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
	public DemandeMaintenance(Long id_demande_maintenance, String sujet, String description, byte[] document_joindre,
			String observation_complementaire) {
		super();
		this.id_demande_maintenance = id_demande_maintenance;
		this.sujet = sujet;
		this.description = description;
		this.document_joindre = document_joindre;
		this.observation_complementaire = observation_complementaire;
	}
	public DemandeMaintenance() {
		super();
		// TODO Auto-generated constructor stub
	}	
}
