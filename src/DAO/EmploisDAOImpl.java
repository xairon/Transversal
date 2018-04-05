package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class EmploisDAOImpl {
	
	 public void insert(Emplois emplois) throws SQLException {
			
			ResultSet myRs = null;
			Connection myConn = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				// 1. Get a connection to database
				myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
				
				  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.emplois (codgeo , P09_emplt , P99_emplt , Defmret11 , Defmt11) VALUES (? , ? , ? , ?)");
		            preparedStatement.setFloat(1, emplois.getCodgeo());
		            preparedStatement.setInt(2,  emplois.getP09_emplt());
		            preparedStatement.setInt(3,  emplois.getP99_emplt());
		            preparedStatement.setInt(4,  emplois.getDefmret11());
		            preparedStatement.setInt(5,  emplois.getDefmt11());
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
	 
	    public List<Emplois> select() {
	        List<Emplois> emploiss = new LinkedList<Emplois>();
	    	Connection myConn = null;
	         try {
	       
	        	  myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
	                Statement statement = myConn.createStatement();
	                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.emplois");
	                 
	                Emplois emplois = null;
	                while(resultSet.next()){
	                	emplois = new Emplois();
	                	emplois.setCodgeo((resultSet.getFloat("Codgeo")));
	                	emplois.setP09_emplt(resultSet.getInt("P09_emplt"));
	                	emplois.setP99_emplt(resultSet.getInt("P99_emplt"));
	                	emplois.setDefmret11(resultSet.getInt("Defmret11"));
	                	emplois.setDefmt11(resultSet.getInt("Defmt11"));
	                     
	                    emploiss.add(emplois);
	                }
	                resultSet.close();
	                statement.close();
	                 
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            System.out.println(emploiss);
	            return emploiss;
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
