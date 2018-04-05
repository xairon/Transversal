package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Rstat_regDAOImpl {
	
	public void insert(Rstat_reg rstat_reg) throws SQLException {
		
		ResultSet myRs = null;
		Connection myConn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
			
			  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.rstat_reg (codgeo , LIBGEO , TCHOMB3T12) VALUES (? , ? , ?)");
	            preparedStatement.setFloat(1, rstat_reg.getCodgeo());
	            preparedStatement.setString(2,  rstat_reg.getLIBGEO());
	            preparedStatement.setFloat(3,  rstat_reg.getTCHOMB3T12());
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
 
    public List<Rstat_reg> select() {
        List<Rstat_reg> rstat_regs = new LinkedList<Rstat_reg>();
    	Connection myConn = null;
         try {
       
        	  myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
                Statement statement = myConn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.rstat_reg");
                 
                Rstat_reg rstat_reg = null;
                while(resultSet.next()){
                	rstat_reg = new Rstat_reg();
                	rstat_reg.setCodgeo((resultSet.getFloat("Codgeo")));
                	rstat_reg.setLIBGEO(resultSet.getString("LIBGEO"));
                	rstat_reg.setTCHOMB3T12(resultSet.getFloat("TCHOMB3T12"));
                     
                    rstat_regs.add(rstat_reg);
                }
                resultSet.close();
                statement.close();
                 
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(rstat_regs);
            return rstat_regs;
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
