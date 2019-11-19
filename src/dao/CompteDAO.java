package dao;

import bean.Client;
import bean.Compte;

public interface CompteDAO {
    public void saveClient(Client client);
    public void saveCompte(Compte compte);
    public void updateCompte(Compte compte);
    public void deleteCompte(Long id_compte);
    public Compte getCompte(Long id_compte);
}