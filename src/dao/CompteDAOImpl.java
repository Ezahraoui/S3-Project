package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import bean.Client;
import bean.Compte;
import util.HibernateUtil;


public class CompteDAOImpl implements CompteDAO{

	@Override
	public void saveClient(Client client) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(client);
        tx.commit();
        session.close();
        System.out.println("Card Inserted Successfully..");
		
	}
	
	/**
     * Save Compte
     * @param compte
     */

	@Override
	public void saveCompte(Compte compte) {
		SessionFactory factory= new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(compte);
        tx.commit();
        session.close();
        System.out.println("Card Inserted Successfully..");
		
	}
	
	/**
     * Update Compte
     * @param compte
     */

	@Override
	public void updateCompte(Compte compte) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.update(compte);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
		
	}
	
	/**
     * Delete Compte
     * @param id
     */

	@Override
	public void deleteCompte(Long id_compte) {
		Transaction transaction = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();

            // Delete a user object
            Compte compte = session.get(Compte.class, id_compte);
            if (compte != null) {
                session.delete(compte);
                System.out.println("compte is deleted");
            }

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
		
	}
	
	/**
     * Get Compte By ID
     * @param id
     * @return
     */

	@Override
	public Compte getCompte(Long id_compte) {
		Transaction transaction = null;
        Compte compte = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object
            compte = session.get(Compte.class, id_compte);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return compte;
	}
	
	/**
     * Get all Comptes
     * @return
     */
    @SuppressWarnings("unchecked")
    public List < Compte > getAllUser() {

        Transaction transaction = null;
        List < Compte > listOfCompte = null;
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            // start a transaction
            transaction = session.beginTransaction();
            // get an user object

            listOfCompte = session.createQuery("from Compte").getResultList();

            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
        return listOfCompte;
    }

}
