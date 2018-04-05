package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Ze2010DAOImpl {
	
	public void insert(Ze2010 ze2010) throws SQLException {
		
		ResultSet myRs = null;
		Connection myConn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
			
			  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.ze2010 (codgeo , LIBGEO , EMPESTIM09 , TCHOMB3T12) VALUES (? , ? , ? , ?)");
	            preparedStatement.setFloat(1, ze2010.getCodgeo());
	            preparedStatement.setString(2,  ze2010.getLIBGEO());
	            preparedStatement.setInt(3,  ze2010.getEMPESTIM09());
	            preparedStatement.setFloat(4,  ze2010.getTCHOMB3T12());
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
 
    public List<Ze2010> select() {
        List<Ze2010> ze2010s = new LinkedList<Ze2010>();
    	Connection myConn = null;
         try {
       
        	  myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
                Statement statement = myConn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.ze2010");
                 
                Ze2010 ze2010 = null;
                while(resultSet.next()){
                	ze2010 = new Ze2010();
                	ze2010.setCodgeo((resultSet.getFloat("Codgeo")));
                	ze2010.setLIBGEO(resultSet.getString("LIBGEO"));
                	ze2010.setEMPESTIM09(resultSet.getInt("EMPESTIM09"));
                	ze2010.setTCHOMB3T12(resultSet.getFloat("TCHOMB3T12"));
                    ze2010s.add(ze2010);
                }
                resultSet.close();
                statement.close();
                 
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(ze2010s);
            return ze2010s;
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
