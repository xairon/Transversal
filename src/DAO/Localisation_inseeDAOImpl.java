package DAO;

import java.util.List;
import java.sql.*;


import java.util.Date;
import java.util.LinkedList;

import DAO.DAO;
import DAO.Localisation_insee;

public class Localisation_inseeDAOImpl {
	
	public void insert(Localisation_insee localisation_insee) throws SQLException {
		
		ResultSet myRs = null;
		Connection myConn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
			
			  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.localisation_insee (codgeo, dep, libgeo, urbanite_ruralite, score_urbanite) VALUES (? , ? , ? , ? , ?)");
	            preparedStatement.setFloat(1, localisation_insee.getCodgeo());
	            preparedStatement.setFloat(2,  localisation_insee.getDep());
	            preparedStatement.setString(3,  localisation_insee.getLibgeo());
	            preparedStatement.setInt(4,  localisation_insee.getUrbanite_ruralite());
	            preparedStatement.setFloat(5,  localisation_insee.getScore_urbanite());
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
 
    public List<Localisation_insee> select() {
        List<Localisation_insee> localisation_insees = new LinkedList<Localisation_insee>();
    	Connection myConn = null;
         try {
       
        	  myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
                Statement statement = myConn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.localisation_insee");
                 
                Localisation_insee localisation_insee = null;
                while(resultSet.next()){
                	localisation_insee = new Localisation_insee();
                	localisation_insee.setCodgeo((resultSet.getFloat("Codgeo")));
                	localisation_insee.setDep(resultSet.getFloat("Dep"));
                	localisation_insee.setLibgeo(resultSet.getString("Libgeo"));
                	localisation_insee.setUrbanite_ruralite(resultSet.getInt("Urbanite_ruralite"));
                	localisation_insee.setScore_urbanite(resultSet.getFloat("Score_urbanite"));
                     
                    localisation_insees.add(localisation_insee);
                }
                resultSet.close();
                statement.close();
                 
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(localisation_insees);
            return localisation_insees;
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
