package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class VilleDAOImpl {
	
	public void insert(Ville ville) throws SQLException {
		
		ResultSet myRs = null;
		Connection myConn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
			
			  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.ville (codgeo , REG , DEP , ZE2010 , LIBGEO , SUPERF) VALUES (? , ? , ? , ? , ? , ?)");
	            preparedStatement.setFloat(1, ville.getCODGEO());
	            preparedStatement.setInt(2,  ville.getREG());
	            preparedStatement.setFloat(3,  ville.getDEP());
	            preparedStatement.setInt(4,  ville.getZE2010());
	            preparedStatement.setString(5,  ville.getLIBGEO());
	            preparedStatement.setFloat(6, ville.getSUPERF());
	            preparedStatement.executeUpdate();
	            preparedStatement.close();
		}
		catch (Exception exc) {
			exc.printStackTrace();
		}
		finally {
			if (myRs != null) {
				myRs.close();
			}
			
			
			
			if (myConn != null) {
				myConn.close();
			}
		}
         
    }
 
    public List<Ville> select() {
        List<Ville> villes = new LinkedList<Ville>();
    	Connection myConn = null;
         try {
       
        	  myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
                Statement statement = myConn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.ville");
                 
                Ville ville = null;
                while(resultSet.next()){
                	ville = new Ville();
                	ville.setCODGEO((resultSet.getFloat("CODGEO")));
                	ville.setREG(resultSet.getInt("REG"));
                	ville.setDEP(resultSet.getFloat("DEP"));
                	ville.setZE2010(resultSet.getInt("ZE2010"));
                	ville.setLIBGEO(resultSet.getString("LIBGEO"));
                     
                    villes.add(ville);
                }
                resultSet.close();
                statement.close();
                 
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(villes);
            return villes;
    }
     
     
    public void closeConnection() throws SQLException{
    	Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
        try {
              if (myConn != null) {
            	  myConn.close();
              }
            } catch (Exception e) { 
                //do nothing
            }
    }
    

}
