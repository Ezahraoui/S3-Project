package bean;

public class DemandeSousTraitance extends Demande{
	private float capaciteFinancement;

	public float getCapaciteFinancement() {
		return capaciteFinancement;
	}

	public void setCapaciteFinancement(float capaciteFinancement) {
		this.capaciteFinancement = capaciteFinancement;
	}

	public DemandeSousTraitance() {
		super();
		// TODO Auto-generated constructor stub
	}


	public DemandeSousTraitance(float capaciteFinancement) {
		super();
		this.capaciteFinancement = capaciteFinancement;
	}
	
}