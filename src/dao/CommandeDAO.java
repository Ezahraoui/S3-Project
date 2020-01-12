package dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import bean.ChefDeProjet;
import bean.Client;
import bean.Commande;
import bean.DemandeMaintenance;
import bean.Produit;

public class CommandeDAO {
public static Connection getConnection(){
	    
	    Connection conn = null;
	    try{
	        Class.forName("com.mysql.jdbc.Driver");
	        conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/esoft?useSSL=false", "root", "");
	    
	    }catch(Exception e){
	            System.out.println(e);
	    }
	        return conn;
	    }
	public static int save(long id, long id2){
        int status=0;
        try{
            Connection conn =CommandeDAO.getConnection();
            PreparedStatement ps = conn.prepareStatement("insert into commande(ID_PRODUIT, ID_CLIENT, DATE_COMMANDE)  values(?,?,?)");
            ps.setLong(1, id2);
            ps.setLong(2, id);
            ps.setDate(3, java.sql.Date.valueOf(java.time.LocalDate.now()));

            status = ps.executeUpdate();
            conn.close();}
            catch(Exception e){System.out.println(e);}
            return status;
    }
	
	public static List<Commande> getAll(Long id){
        List<Commande> commandes = new ArrayList<Commande>();
        try{
            Connection conn = CommandeDAO.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT *FROM commande INNER JOIN produit ON commande.ID_PRODUIT = produit.ID_PRODUIT where commande.ID_CLIENT = ?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();   
            while(rs.next()){
            	Commande cmd = new Commande();
            	Produit p =new Produit();
            	cmd.setId_commande(rs.getLong(1));
            	cmd.setDate_commande(rs.getDate(4));
            	cmd.setDate_livraison(rs.getDate(5));
            	cmd.setEtat(rs.getInt(6));
            	commandes.add(cmd);
            	p.setId_produit(rs.getLong("ID_PRODUIT"));
            	p.setNom(rs.getString("NOM"));
            	p.setDescription(rs.getString("DESCRIPTION"));
            	p.setPrix(rs.getDouble("PRIX"));
            	p.setDocument(rs.getBlob("DOCUMENT"));
            	p.setImageData(rs.getBytes("IMAGE"));
            	p.setImageFileName(rs.getString("IMAGE_FILE_NAME"));
            	cmd.setProduit(p);
            }
	        return commandes;
	        } catch(Exception e){}
	        return null;
	}
	
	public static List<Commande> getAll2(Long id){
        List<Commande> commandes = new ArrayList<Commande>();
        try{
            Connection conn = CommandeDAO.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT *FROM commande where commande.ID_CLIENT = ?");
            ps.setLong(1, id);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            	Commande cmd = new Commande();
            	cmd.setId_commande(rs.getLong(1));
            	cmd.setDate_commande(rs.getDate(4));
            	cmd.setDate_livraison(rs.getDate(5));
            	cmd.setEtat(rs.getInt(6));
            	/*p.setId_produit(rs.getLong("ID_PRODUIT"));
            	p.setNom(rs.getString("NOM"));
            	cmd.setProduit(p);*/
            	commandes.add(cmd);
            }
        return commandes;
        } catch(Exception e){}
        return null;
}

}
