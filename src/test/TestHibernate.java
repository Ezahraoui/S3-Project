package test;

import java.util.Date;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import bean.Compte;
import bean.Panier;

public class TestHibernate {
	public static void main(String args[]) {
		Compte compte1=new Compte();
        compte1.setIdCompte((long) 1);
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
		
		
               
	} 
}
