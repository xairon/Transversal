package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class PopulationsDAOImpl {
	
	public void insert(Populations populations) throws SQLException {
		
		ResultSet myRs = null;
		Connection myConn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
			
			  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.population (codgeo , P09_POP1564 , P99_CHOM1564, ACT1564) VALUES (? , ? , ? , ?)");
	            preparedStatement.setFloat(1, populations.getCODGEO());
	            preparedStatement.setInt(2,  populations.getP09_POP1564());
	            preparedStatement.setInt(3,  populations.getP09_CHOM1564());
	            preparedStatement.setInt(4,  populations.getP09_ACT1564());
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
 
    public List<Populations> select() {
        List<Populations> populationss = new LinkedList<Populations>();
    	Connection myConn = null;
         try {
       
        	  myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
                Statement statement = myConn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.population");
                 
                Populations populations = null;
                while(resultSet.next()){
                	populations = new Populations();
                	populations.setCODGEO((resultSet.getFloat("Codgeo")));
                	populations.setP09_POP1564(resultSet.getInt("P09_POP1564"));
                	populations.setP09_CHOM1564(resultSet.getInt("P09_CHOM1564"));
                	populations.setP09_ACT1564(resultSet.getInt("P09_ACT1564"));
                     
                    populationss.add(populations);
                }
                resultSet.close();
                statement.close();
                 
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(populationss);
            return populationss;
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
