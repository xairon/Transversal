package transversal;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

import transversal.Ville;
 
public class JDBCVilleDAO {
	
    
 
    public void insert(Ville ville) throws SQLException {
	
		ResultSet myRs = null;
		Connection myConn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
			
			  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.ville (nom ,departement) VALUES (? , ?)");
	            preparedStatement.setString(1,  ville.getNom());
	            preparedStatement.setString(2,  ville.getDepartement());
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
                    ville.setNom((resultSet.getString("nom")));
                    ville.setDepartement(resultSet.getString("departement"));
                     
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
