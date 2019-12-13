package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.AdministrateurTechnique;

public class AdministrateurTechniqueDAO {
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

public AdministrateurTechnique authentification(String email, String password) throws SQLException,
		   ClassNotFoundException {
			Connection conn = AdministrateurTechniqueDAO.getConnection();
			String sql = "select * from administrateurtechnique where EMAIL = ? and PASSWORD = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, email);
			statement.setString(2, password);
			System.out.println(statement);
			ResultSet result = statement.executeQuery();
				
			AdministrateurTechnique administrateurTechnique = null;
				
			if (result.next()) {
				administrateurTechnique = new AdministrateurTechnique();
				administrateurTechnique.setId_admin_technique(result.getLong(1));
				administrateurTechnique.setNomAT(result.getString(2));
				administrateurTechnique.setPrenomAT(result.getString(3));
				administrateurTechnique.setEmailAT(result.getString(4));
				administrateurTechnique.setPasswordAT(result.getString(5));	
				administrateurTechnique.setCinAT(result.getString(6));
				administrateurTechnique.setAdresseAT(result.getString(7));
				administrateurTechnique.setNum_telephoneAT(result.getString(8));
			}	
			conn.close();	
		return administrateurTechnique;
		}

}
