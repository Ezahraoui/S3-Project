package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import bean.ChefDeProjet;


public class ChefDeProjetDAO {
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

	public ChefDeProjet authentification(String email, String password) throws SQLException,
			   ClassNotFoundException {
				Connection conn = ChefDeProjetDAO.getConnection();
				String sql = "select * from chef_de_projet where EMAIL = ? and PASSWORD = ?";
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setString(1, email);
				statement.setString(2, password);
				System.out.println(statement);
				ResultSet result = statement.executeQuery();
					
				ChefDeProjet chefDeProjet = null;
					
				if (result.next()) {
						chefDeProjet = new ChefDeProjet();
						chefDeProjet.setId_chef_projet(result.getLong(1));
						chefDeProjet.setNomCP(result.getString(2));
						chefDeProjet.setPrenomCP(result.getString(3));
						chefDeProjet.setEmailCP(result.getString(4));
						chefDeProjet.setPasswordCP(result.getString(5));	
						chefDeProjet.setGithubCP(result.getString(6));
					    chefDeProjet.setAdresseCP(result.getString(7));
					    chefDeProjet.setNum_telephoneCP(result.getString(8));
				}	
				conn.close();	
			return chefDeProjet;
			}
	public static List<ChefDeProjet> getAll(){
        List<ChefDeProjet> chefsDeProjet = new ArrayList<ChefDeProjet>();
        try{
            Connection conn = ChefDeProjetDAO.getConnection();
            PreparedStatement ps = conn.prepareStatement("SELECT *FROM chef_de_projet");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
            	ChefDeProjet cp = new ChefDeProjet();
            	cp.setId_chef_projet(rs.getLong(1));
            	cp.setNomCP(rs.getString(2));
            	cp.setPrenomCP(rs.getString(3));
            	cp.setEmailCP(rs.getString(4));
            	cp.setPasswordCP(rs.getString(5));
            	cp.setGithubCP(rs.getString(6));
            	cp.setAdresseCP(rs.getString(7));
            	cp.setNum_telephoneCP(rs.getString(8));
            	chefsDeProjet.add(cp);
            }
        return chefsDeProjet;
        } catch(Exception e){}
        return null;
}
}
