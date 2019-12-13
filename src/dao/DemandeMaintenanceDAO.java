package dao;

import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bean.Client;
import bean.DemandeMaintenance;

public class DemandeMaintenanceDAO {
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

	    public static int save(DemandeMaintenance dm, InputStream file, long id){
	        int status=0;
	        try{
	            Connection conn = DemandeMaintenanceDAO.getConnection();
	            PreparedStatement ps = conn.prepareStatement("insert into demandemaintenance(ID_CLIENT, SUJET, DESCRIPTION, DOCUMENT_JOINDRE, OBSERVATION_COMPLEMENTAIRE)  values(?,?,?,?,?)");
	            ps.setLong(1, id);
	            ps.setString(2, dm.getSujet());
	            ps.setString(3, dm.getDescription());
	            if (file != null) {
	                ps.setBlob(4, file);
	            }
	            ps.setString(5, dm.getObservation_complementaire());

	            status = ps.executeUpdate();
	            conn.close();}
	            catch(Exception e){System.out.println(e);}
	            return status;
	    }
	    
	    public static List<DemandeMaintenance> getAll(){
	        List<DemandeMaintenance> demandesMaintenance = new ArrayList<DemandeMaintenance>();
	        try{
	            Connection conn = DemandeMaintenanceDAO.getConnection();
	            PreparedStatement ps = conn.prepareStatement("SELECT *FROM demandemaintenance INNER JOIN client ON demandemaintenance.ID_CLIENT = client.ID_CLIENT");
	            ResultSet rs = ps.executeQuery();
	            while(rs.next()){
	            	DemandeMaintenance dm = new DemandeMaintenance();
	            	Client client = new Client();
	            	dm.setId_demande_maintenance(rs.getLong(1));
	            	dm.setSujet(rs.getString(3));
	            	dm.setDescription(rs.getString(4));
	            	dm.setDocument_joindre(rs.getBytes(5));
	            	dm.setObservation_complementaire(rs.getString(6));
	            	demandesMaintenance.add(dm);
	            	client.setNomCLT(rs.getString("NOM"));
	            	client.setId_client(rs.getLong("ID_CLIENT"));
	            	client.setPrenomCLT(rs.getString("PRENOM"));
	            	client.setEmailCLT(rs.getString("EMAIL"));
	            	client.setPasswordCLT(rs.getString("PASSWORD"));
	            	client.setCinCLT(rs.getString("CIN"));
	            	client.setAdresseCLT(rs.getString("ADRESSE"));
	            	client.setNum_telephoneCLT(rs.getString("NUM_TELEPHONE"));
	            	dm.setClient(client);
	            }
	        return demandesMaintenance;
	        } catch(Exception e){}
	        return null;
	}

}
