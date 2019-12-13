package dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import bean.Client;

public class ClientDAO {
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

	public Client authentification(String email, String password) throws SQLException,
			   ClassNotFoundException {
				Connection conn = ClientDAO.getConnection();
				String sql = "select * from client where EMAIL = ? and PASSWORD = ?";
				PreparedStatement statement = conn.prepareStatement(sql);
				statement.setString(1, email);
				statement.setString(2, password);
				System.out.println(statement);
				ResultSet result = statement.executeQuery();
					
				Client client = null;
					
				if (result.next()) {
					    client = new Client();
					    client.setId_client(result.getLong(1));
					    client.setNomCLT(result.getString(2));
					    client.setPrenomCLT(result.getString(3));
					    client.setEmailCLT(result.getString(4));
					    client.setPasswordCLT(result.getString(5));	
					    client.setCinCLT(result.getString(6));
					    client.setAdresseCLT(result.getString(7));
					    client.setNum_telephoneCLT(result.getString(8));
				}	
				conn.close();	
			return client;
			}
	public static List<Client> getAll(){
	    List<Client> clients = new ArrayList<Client>();
	    try{
	        Connection conn = ChefDeProjetDAO.getConnection();
	        PreparedStatement ps = conn.prepareStatement("SELECT *FROM client");
	        ResultSet rs = ps.executeQuery();
	        while(rs.next()){
	        	Client cl = new Client();
	        	cl.setId_client(rs.getLong(1));
	        	cl.setNomCLT(rs.getString(2));
	        	cl.setPrenomCLT(rs.getString(3));
	        	cl.setEmailCLT(rs.getString(4));
	        	cl.setPasswordCLT(rs.getString(5));
	        	cl.setCinCLT(rs.getString(6));
	        	cl.setAdresseCLT(rs.getString(7));
	        	cl.setNum_telephoneCLT(rs.getString(8));
	        	clients.add(cl);
	        }
	    return clients;
	    } catch(Exception e){}
	    return null;
	}
}
