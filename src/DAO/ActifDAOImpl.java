package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

import DAO.Actif;

public class ActifDAOImpl {

	 public void insert(Actif actif) throws SQLException {
			
			ResultSet myRs = null;
			Connection myConn = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				// 1. Get a connection to database
				myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
				
				  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.actif (codgeo , ettot10 , etaz10 , etbe10 , etfz10 , etgu10 , etgz10 , etoq10 , ettef110 , ettefp1010) VALUES (? , ? , ? , ? , ? , ? , ? , ? , ? , ?)");
		            preparedStatement.setFloat(1, actif.getCodgeo());
		            preparedStatement.setInt(2,  actif.getEttot10());
		            preparedStatement.setInt(3,  actif.getEtaz10());
		            preparedStatement.setInt(4,  actif.getEtbe10());
		            preparedStatement.setInt(5,  actif.getEtfz10());
		            preparedStatement.setInt(6,  actif.getEtgu10());
		            preparedStatement.setInt(7,  actif.getEtgz10());
		            preparedStatement.setInt(8,  actif.getEtoq10());
		            preparedStatement.setInt(9,  actif.getEttef110());
		            preparedStatement.setInt(10,  actif.getEttefp1010());
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
	 
	    public List<Actif> select() {
	        List<Actif> actifs = new LinkedList<Actif>();
	    	Connection myConn = null;
	         try {
	       
	        	  myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
	                Statement statement = myConn.createStatement();
	                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.actif");
	                 
	                Actif actif = null;
	                while(resultSet.next()){
	                	actif = new Actif();
	                	actif.setCodgeo((resultSet.getFloat("Codgeo")));
	                	actif.setEttot10(resultSet.getInt("Ettot10"));
	                	actif.setEtaz10(resultSet.getInt("Etaz10"));
	                	actif.setEtbe10(resultSet.getInt("Etbe10"));
	                	actif.setEtfz10(resultSet.getInt("Etfz10"));
	                	actif.setEtgu10(resultSet.getInt("Etgu10"));
	                	actif.setEtgz10(resultSet.getInt("Etgz10"));
	                	actif.setEtoq10(resultSet.getInt("Etoq10"));
	                	actif.setEttef110(resultSet.getInt("Ettef110"));
	                	actif.setEttefp1010(resultSet.getInt("Ettefp1010"));
	                     
	                    actifs.add(actif);
	                }
	                resultSet.close();
	                statement.close();
	                 
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            System.out.println(actifs);
	            return actifs;
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
