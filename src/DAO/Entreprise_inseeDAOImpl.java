package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Entreprise_inseeDAOImpl {
	
	 public void insert(Entreprise_insee entreprise_insee) throws SQLException {
			
			ResultSet myRs = null;
			Connection myConn = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				// 1. Get a connection to database
				myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
				
				  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.entreprise_insee (codgeo , Nb_entreprises_secteur_services, Nb_entreprise_secteur_commerce, Nb_entreprises_secteur_construction, Nb_entreprises_secteur_industrie, Nb_creation_enteprises, Nb_creation_industrielles, Nb_creation_construction, Nb_creation_commerces, Nb_creation_services, Nb_actifs) VALUES (? , ? , ? , ? , ? , ? , ? , ? , ? , ? , ?)");
		            preparedStatement.setFloat(1, entreprise_insee.getCodgeo());
		            preparedStatement.setInt(2,  entreprise_insee.getNb_Entreprises_Secteur_Services());
		            preparedStatement.setInt(3,  entreprise_insee.getNb_Entreprises_Secteur_Commerce());
		            preparedStatement.setInt(4,  entreprise_insee.getNb_Entreprises_Secteur_Construction());
		            preparedStatement.setInt(5,  entreprise_insee.getNb_Entreprises_Secteur_Industrie());
		            preparedStatement.setInt(6,  entreprise_insee.getNb_Creation_Enteprises());
		            preparedStatement.setInt(7,  entreprise_insee.getNb_Creation_Industrielles());
		            preparedStatement.setInt(8,  entreprise_insee.getNb_Creation_Construction());
		            preparedStatement.setInt(9,  entreprise_insee.getNb_Creation_Commerces());
		            preparedStatement.setInt(10,  entreprise_insee.getNb_Creation_Services());
		            preparedStatement.setInt(11,  entreprise_insee.getNb_Actifs());
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
	 
	    public List<Entreprise_insee> select() {
	        List<Entreprise_insee> entreprise_insees = new LinkedList<Entreprise_insee>();
	    	Connection myConn = null;
	         try {
	       
	        	  myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
	                Statement statement = myConn.createStatement();
	                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.entreprise_insee");
	                 
	                Entreprise_insee entreprise_insee = null;
	                while(resultSet.next()){
	                	entreprise_insee = new Entreprise_insee();
	                	entreprise_insee.setCodgeo((resultSet.getFloat("Codgeo")));
	                	entreprise_insee.setNb_Entreprises_Secteur_Services(resultSet.getInt("Nb_Entreprises_Secteur_Services"));
	                	entreprise_insee.setNb_Entreprises_Secteur_Commerce(resultSet.getInt("Nb_Entreprises_Secteur_Commerce"));
	                	entreprise_insee.setNb_Entreprises_Secteur_Construction(resultSet.getInt("Nb_Entreprises_Secteur_Construction"));
	                	entreprise_insee.setNb_Entreprises_Secteur_Industrie(resultSet.getInt("Nb_Entreprises_Secteur_Industrie"));
	                	entreprise_insee.setNb_Creation_Enteprises(resultSet.getInt("Nb_Creation_Enteprises"));
	                	entreprise_insee.setNb_Creation_Industrielles(resultSet.getInt("Nb_Creation_Industrielles"));
	                	entreprise_insee.setNb_Creation_Construction(resultSet.getInt("Nb_Creation_Construction"));
	                	entreprise_insee.setNb_Creation_Commerces(resultSet.getInt("Nb_Creation_Commerces"));
	                	entreprise_insee.setNb_Creation_Services(resultSet.getInt("Nb_Creation_Services"));
	                	entreprise_insee.setNb_Actifs(resultSet.getInt("Nb_Actifs"));	                     
	                    entreprise_insees.add(entreprise_insee);
	                }
	                resultSet.close();
	                statement.close();
	                 
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            System.out.println(entreprise_insees);
	            return entreprise_insees;
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
