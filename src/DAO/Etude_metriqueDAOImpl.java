package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Etude_metriqueDAOImpl {

	public void insert(Etude_metrique etude_metrique) throws SQLException {
		
		ResultSet myRs = null;
		Connection myConn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
			
			  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.etude_metrique (codgeo, Metrique_effmoy, Metrique_eff1, Metrique_eff2, Metrique_eff3, Metrique_eff4, Metrique_eff5, Metrique_eff6, Metrique_eff7, Metrique_eff8, Metrique_eff9, Metrique_eff10, Metrique_eff11, Metrique_eff12, Metrique_eff13, Metrique_eff14, Metrique_eff15, Metrique_eff16, Metrique_public, Metrique_privee, Nbetudiant) VALUES (? , ? , ? , ? , ? , ? , ? , ?, ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?)");
	            preparedStatement.setFloat(1, etude_metrique.getCodgeo());
	            preparedStatement.setDouble(2,  etude_metrique.getMetrique_effmoy());
	            preparedStatement.setDouble(3,  etude_metrique.getMetrique_eff1());
	            preparedStatement.setDouble(4,  etude_metrique.getMetrique_eff2());
	            preparedStatement.setDouble(5,  etude_metrique.getMetrique_eff3());
	            preparedStatement.setDouble(6,  etude_metrique.getMetrique_eff4());
	            preparedStatement.setDouble(7,  etude_metrique.getMetrique_eff5());
	            preparedStatement.setDouble(8,  etude_metrique.getMetrique_eff6());
	            preparedStatement.setDouble(9,  etude_metrique.getMetrique_eff7());
	            preparedStatement.setDouble(10,  etude_metrique.getMetrique_eff8());
	            preparedStatement.setDouble(11,  etude_metrique.getMetrique_eff9());
	            preparedStatement.setDouble(12,  etude_metrique.getMetrique_eff10());
	            preparedStatement.setDouble(13,  etude_metrique.getMetrique_eff11());
	            preparedStatement.setDouble(14,  etude_metrique.getMetrique_eff12());
	            preparedStatement.setDouble(15,  etude_metrique.getMetrique_eff13());
	            preparedStatement.setDouble(16,  etude_metrique.getMetrique_eff14());
	            preparedStatement.setDouble(17,  etude_metrique.getMetrique_eff15());
	            preparedStatement.setDouble(18,  etude_metrique.getMetrique_eff16());
	            preparedStatement.setDouble(19,  etude_metrique.getMetrique_public());
	            preparedStatement.setDouble(20,  etude_metrique.getMetrique_privee());
	            preparedStatement.setInt(21,  etude_metrique.getNbetudiant());
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
 
    public List<Etude_metrique> select() {
        List<Etude_metrique> etude_metriques = new LinkedList<Etude_metrique>();
    	Connection myConn = null;
         try {
       
        	  myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
                Statement statement = myConn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.etude_metrique");
                 
                Etude_metrique etude_metrique = null;
                while(resultSet.next()){
                	etude_metrique = new Etude_metrique();
                	etude_metrique.setCodgeo((resultSet.getFloat("Codgeo")));
                	etude_metrique.setMetrique_effmoy(resultSet.getDouble("Metrique_effmoy"));
                	etude_metrique.setMetrique_eff1(resultSet.getDouble("Metrique_eff1"));
                	etude_metrique.setMetrique_eff2(resultSet.getDouble("Metrique_eff2"));
                	etude_metrique.setMetrique_eff3(resultSet.getDouble("Metrique_eff3"));
                	etude_metrique.setMetrique_eff4(resultSet.getDouble("Metrique_eff4"));
                	etude_metrique.setMetrique_eff5(resultSet.getDouble("Metrique_eff5"));
                	etude_metrique.setMetrique_eff6(resultSet.getDouble("Metrique_eff6"));
                	etude_metrique.setMetrique_eff7(resultSet.getDouble("Metrique_eff7"));
                	etude_metrique.setMetrique_eff8(resultSet.getDouble("Metrique_eff8"));
                	etude_metrique.setMetrique_eff9(resultSet.getDouble("Metrique_eff9"));
                	etude_metrique.setMetrique_eff10(resultSet.getDouble("Metrique_eff10"));
                	etude_metrique.setMetrique_eff11(resultSet.getDouble("Metrique_eff11"));
                	etude_metrique.setMetrique_eff12(resultSet.getDouble("Metrique_eff12"));
                	etude_metrique.setMetrique_eff13(resultSet.getDouble("Metrique_eff13"));
                	etude_metrique.setMetrique_eff14(resultSet.getDouble("Metrique_eff14"));
                	etude_metrique.setMetrique_eff15(resultSet.getDouble("Metrique_eff15"));
                	etude_metrique.setMetrique_eff16(resultSet.getDouble("Metrique_eff16"));
                	etude_metrique.setMetrique_public(resultSet.getDouble("Metrique_Public"));
                	etude_metrique.setMetrique_privee(resultSet.getDouble("Metrique_Privee"));
                	etude_metrique.setNbetudiant(resultSet.getInt("Nbetudiant"));
                     
                    etude_metriques.add(etude_metrique);
                }
                resultSet.close();
                statement.close();
                 
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(etude_metriques);
            return etude_metriques;
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
