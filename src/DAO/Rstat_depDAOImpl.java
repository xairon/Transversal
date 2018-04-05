package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class Rstat_depDAOImpl {
	
	public void insert(Rstat_dep rstat_dep) throws SQLException {
		
		ResultSet myRs = null;
		Connection myConn = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 1. Get a connection to database
			myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
			
			  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.rstat_dep (codgeo , REG , LIBGEO , POPEST12 , EMPESTIM10 , TCHOMB3T12, ID) VALUES (? , ? , ? , ? , ? , ?, ?)");
	            preparedStatement.setFloat(1, rstat_dep.getCodgeo());
	            preparedStatement.setInt(2,  rstat_dep.getREG());
	            preparedStatement.setString(3,  rstat_dep.getLIBGEO());
	            preparedStatement.setInt(4,  rstat_dep.getPOPEST12());
	            preparedStatement.setInt(5,  rstat_dep.getEMPESTIM10());
	            preparedStatement.setFloat(6,  rstat_dep.getTCHOMB3T12());
	            preparedStatement.setString(6,  rstat_dep.getID());
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
 
    public List<Rstat_dep> select() {
        List<Rstat_dep> rstat_deps = new LinkedList<Rstat_dep>();
    	Connection myConn = null;
         try {
       
        	  myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
                Statement statement = myConn.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.rstat_dep");
                 
                Rstat_dep rstat_dep = null;
                while(resultSet.next()){
                	rstat_dep = new Rstat_dep();
                	rstat_dep.setCodgeo((resultSet.getFloat("Codgeo")));
                	rstat_dep.setREG(resultSet.getInt("REG"));
                	rstat_dep.setLIBGEO(resultSet.getString("LIBGEO"));
                	rstat_dep.setPOPEST12(resultSet.getInt("POPEST12"));
                	rstat_dep.setEMPESTIM10(resultSet.getInt("EMPESTIM10"));
                	rstat_dep.setTCHOMB3T12(resultSet.getInt("TCHOMB3T12"));
                	rstat_dep.setID(resultSet.getString("ID"));
                     
                    rstat_deps.add(rstat_dep);
                }
                resultSet.close();
                statement.close();
                 
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(rstat_deps);
            return rstat_deps;
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
