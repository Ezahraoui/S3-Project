package bean;

import java.util.HashSet;
import java.util.Set;

public class AdministrateurTechnique extends Compte{
	private Long id_admin_tech;
	
	
	public Long getId_admin_tech() {
		return id_admin_tech;
	}
	public void setId_admin_tech(Long id_admin_tech) {
		this.id_admin_tech = id_admin_tech;
	}
	private Set<Demande> demandes = new HashSet<Demande>();
	public AdministrateurTechnique() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Set<Demande> getDemandes() {
		return demandes;
	}
	public void setDemandes(Set<Demande> demandes) {
		this.demandes = demandes;
	}

	
	
	

}
