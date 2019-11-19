package test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import bean.Administrateur;
import bean.AdministrateurTechnique;
import bean.Client;
import bean.Compte;
import bean.Panier;

public class TestHibernate {
	public static void main(String args[]) {
		Compte compte1=new Compte();
        compte1.setId_compte((long) 1);
        compte1.setNom("jad");
        compte1.setPrenom("ezahraoui");
        compte1.setEmail("jad@gmail.com");
        compte1.setPassword("156");
        compte1.setAdresse("fes");
        compte1.setCin("AB56598");
        compte1.setNumTelephone("02255");
        compte1.setPrivilege("client");
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(compte1);
        session.getTransaction().commit();
		
		/*Client client=new Client();
		client.setIdCompte((long) 3);
		client.setNom("jad");
		client.setPrenom("samiri");
		client.setEmail("jad@gmail.com");
		client.setPassword("156");
		client.setAdresse("fes");
		client.setCin("AB56598");
		client.setNumTelephone("02255");
		client.setPrivilege("client");
		client.setEtat(false);
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(client);
        session.getTransaction().commit();*/
        
		/*AdministrateurTechnique admintech=new AdministrateurTechnique();
		admintech.setIdCompte((long) 4);
		admintech.setNom("jad");
		admintech.setPrenom("samiri");
		admintech.setEmail("jad@gmail.com");
		admintech.setPassword("156");
		admintech.setAdresse("fes");
		admintech.setCin("AB56598");
		admintech.setNumTelephone("02255");
		admintech.setPrivilege("admintech");
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(admintech);
        session.getTransaction().commit();*/
		
		/*Administrateur admin=new Administrateur();
		admin.setIdCompte((long) 5);
		admin.setNom("jad");
		admin.setPrenom("samiri");
		admin.setEmail("jad@gmail.com");
		admin.setPassword("156");
		admin.setAdresse("fes");
		admin.setCin("AB56598");
		admin.setNumTelephone("02255");
		admin.setPrivilege("admintech");
        SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
        Session session=sessionFactory.openSession();
        session.beginTransaction();
        session.save(admin);
        session.getTransaction().commit();*/
               
	} 
}
