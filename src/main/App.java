package main;


import org.hibernate.Session;

import bean.Client;
import bean.DemandeMaintenance;
import util.HibernateUtil;

public class App {
	public static void main(String[] args) {
		
    System.out.println("Hibernate one to many (XML Mapping)");
	Session session = HibernateUtil.getSessionFactory().openSession();

	session.beginTransaction();

	    Client client=new Client();
		client.setId_compte((long) 3);
		client.setNom("jad");
		client.setPrenom("samiri");
		client.setEmail("jad@gmail.com");
		client.setPassword("156");
		client.setAdresse("fes");
		client.setCin("AB56598");
		client.setNumTelephone("02255");
		client.setPrivilege("client");
		client.setEtat(false);
        session.save(client);
        
        DemandeMaintenance demandes = new DemandeMaintenance();
        demandes.setIdDemande((long) 3);
        demandes.setSujet("réparation");
        demandes.setDocument_joindre(null);
        demandes.setMessage("allo");
        demandes.setMotif("pb");
        
        demandes.setClient(client);        
        client.getDemandes().add(demandes);

        session.save(demandes);

	session.getTransaction().commit();
	System.out.println("Done");
	}

}
