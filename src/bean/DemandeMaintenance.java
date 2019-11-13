package bean;

public class DemandeMaintenance extends Demande{
	private String motif;

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public DemandeMaintenance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemandeMaintenance(Long idDemande, String sujet, byte[] document_joindre) {
		super(idDemande, sujet, document_joindre);
		// TODO Auto-generated constructor stub
	}

	public DemandeMaintenance(String sujet, byte[] document_joindre) {
		super(sujet, document_joindre);
		// TODO Auto-generated constructor stub
	}

	public DemandeMaintenance(String motif) {
		super();
		this.motif = motif;
	}
	
	
	

}
