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

	

	public DemandeMaintenance(String motif) {
		super();
		this.motif = motif;
	}
	
	
}
