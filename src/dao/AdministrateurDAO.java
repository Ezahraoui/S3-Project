package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bean.Administrateur;


public class AdministrateurDAO {
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

public Administrateur authentification(String email, String password) throws SQLException,
		   ClassNotFoundException {
			Connection conn = AdministrateurDAO.getConnection();
			String sql = "select * from admin where EMAIL = ? and PASSWORD = ?";
			PreparedStatement statement = conn.prepareStatement(sql);
			statement.setString(1, email);
			statement.setString(2, password);
			System.out.println(statement);
			ResultSet result = statement.executeQuery();
				
			Administrateur administrateur = null;
				
			if (result.next()) {
				administrateur = new Administrateur();
				administrateur.setId_admin(result.getLong(1));
				administrateur.setNomA(result.getString(2));
				administrateur.setPrenomA(result.getString(3));
				administrateur.setEmailA(result.getString(4));
				administrateur.setPasswordA(result.getString(5));	
				administrateur.setCinA(result.getString(6));
				administrateur.setAdresseA(result.getString(7));
				administrateur.setNum_telephoneA(result.getString(8));
			}	
			conn.close();	
		return administrateur;
		}

}
