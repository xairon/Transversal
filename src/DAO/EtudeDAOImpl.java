package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class EtudeDAOImpl {

	public void insert(Etude etude) throws SQLException {
		
		ResultSet myRs = null;
		Connection myConn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
			
			  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.etudiant (codgeo, eff_moy, eff1, eff2, eff3, eff4, eff5, eff6, eff7, eff8, eff9, eff10, eff11, eff12, eff13, eff14, eff15, eff16, privee, public_, geo_nom) VALUES (? , ? , ? , ? , ? , ? , ? , ?, ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?)");
	            preparedStatement.setFloat(1, etude.getCodgeo());
	            preparedStatement.setFloat(2,  etude.getEff_moy());
	            preparedStatement.setFloat(3,  etude.getEff1());
	            preparedStatement.setFloat(5,  etude.getEff2());
	            preparedStatement.setFloat(6,  etude.getEff3());
	            preparedStatement.setFloat(7,  etude.getEff4());
	            preparedStatement.setFloat(8,  etude.getEff5());
	            preparedStatement.setFloat(8,  etude.getEff6());
	            preparedStatement.setFloat(8,  etude.getEff7());
	            preparedStatement.setFloat(8,  etude.getEff8());
	            preparedStatement.setFloat(8,  etude.getEff9());
	            preparedStatement.setFloat(8,  etude.getEff10());
	            preparedStatement.setFloat(8,  etude.getEff11());
	            preparedStatement.setFloat(8,  etude.getEff12());
	            preparedStatement.setFloat(8,  etude.getEff13());
	            preparedStatement.setFloat(8,  etude.getEff14());
	            preparedStatement.setFloat(8,  etude.getEff15());
	            preparedStatement.setFloat(8,  etude.getEff16());
	            preparedStatement.setFloat(8,  etude.getPrivee());
	            preparedStatement.setFloat(8,  etude.getPublic_());
	            preparedStatement.setString(21,  etude.getGeo_nom());
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
 
    public List<Etude> select() {
        List<Etude> etudes = new LinkedList<Etude>();
    	Connection myConn = null;
         try {
       
        	  myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
                Statement statement = myConn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.etudiant");
                 
                Etude etude = null;
                while(resultSet.next()){
                	etude = new Etude();
                	etude.setCodgeo((resultSet.getFloat("Codgeo")));
                	etude.setEff_moy(resultSet.getFloat("Eff_moy"));
                	etude.setEff1(resultSet.getFloat("Eff1"));
                	etude.setEff2(resultSet.getFloat("Eff2"));
                	etude.setEff3(resultSet.getFloat("Eff3"));
                	etude.setEff4(resultSet.getFloat("Eff4"));
                	etude.setEff5(resultSet.getFloat("Eff5"));
                	etude.setEff6(resultSet.getFloat("Eff6"));
                	etude.setEff7(resultSet.getFloat("Eff7"));
                	etude.setEff8(resultSet.getFloat("Eff8"));
                	etude.setEff9(resultSet.getFloat("Eff9"));
                	etude.setEff10(resultSet.getFloat("Eff10"));
                	etude.setEff11(resultSet.getFloat("Eff11"));
                	etude.setEff12(resultSet.getFloat("Eff12"));
                	etude.setEff13(resultSet.getFloat("Eff13"));
                	etude.setEff14(resultSet.getFloat("Eff14"));
                	etude.setEff15(resultSet.getFloat("Eff15"));
                	etude.setEff16(resultSet.getFloat("Eff16"));
                	etude.setPrivee(resultSet.getFloat("Privee"));
                	etude.setPublic_(resultSet.getFloat("Public_"));
                	etude.setGeo_nom(resultSet.getString("Geo_nom"));
                     
                    etudes.add(etude);
                }
                resultSet.close();
                statement.close();
                 
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(etudes);
            return etudes;
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
