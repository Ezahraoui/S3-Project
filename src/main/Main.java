package main;

import bean.Compte;
import dao.CompteDAO;
import dao.CompteDAOFactory;


// Pour tester compte et client
public class Main {
    public static void main(String[] args) {
        Compte compte1 = new Compte();
        compte1.setId_compte((long) 1);
        compte1.setNom("jad");
        compte1.setPrenom("ezahraoui");
        compte1.setEmail("jad@gmail.com");
        compte1.setPassword("156");
        compte1.setAdresse("fes");
        compte1.setCin("AB56598");
        compte1.setNumTelephone("02255");
        compte1.setPrivilege("client");
        CompteDAO dao = CompteDAOFactory.getInstance();
        dao.saveCompte(compte1);
        System.out.println("=========================");
        
    }
}