package bean;

public class DemandeSousTraitance extends Demande{
	private float capaciteAutoFinancement;

	public float getCapaciteAutoFinancement() {
		return capaciteAutoFinancement;
	}

	public void setCapaciteAutoFinancement(float capaciteAutoFinancement) {
		this.capaciteAutoFinancement = capaciteAutoFinancement;
	}

	public DemandeSousTraitance() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DemandeSousTraitance(Long idDemande, String sujet, byte[] document_joindre) {
		super(idDemande, sujet, document_joindre);
		// TODO Auto-generated constructor stub
	}

	public DemandeSousTraitance(String sujet, byte[] document_joindre) {
		super(sujet, document_joindre);
		// TODO Auto-generated constructor stub
	}

	public DemandeSousTraitance(float capaciteAutoFinancement) {
		super();
		this.capaciteAutoFinancement = capaciteAutoFinancement;
	}
	
}
