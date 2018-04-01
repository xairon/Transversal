package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.sql.*;


import java.util.Date;
import java.util.LinkedList;


public  class MemberDAOImpl {
	

	
	

	
	 public void insert(Member member) throws SQLException {
			
			ResultSet myRs = null;
			Connection myConn = null;
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				// 1. Get a connection to database
				myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
				
				  PreparedStatement preparedStatement = myConn.prepareStatement("INSERT INTO projet.members (uname ,pass) VALUES (? , ?)");
		            preparedStatement.setString(1, member.getUname());
		            preparedStatement.setString(2,  member.getPas());
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
	 
	    public List<Member> select() {
	        List<Member> membres = new LinkedList<Member>();
	    	Connection myConn = null;
	         try {
	       
	        	  myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
	                Statement statement = myConn.createStatement();
	                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.members");
	                 
	                Member membre = null;
	                while(resultSet.next()){
	                	membre = new Member();
	                	membre.setUname((resultSet.getString("uname")));
	                	membre.setPas(resultSet.getString("pass"));
	                     
	                    membres.add(membre);
	                }
	                resultSet.close();
	                statement.close();
	                 
	            } catch (SQLException e) {
	                e.printStackTrace();
	            }
	            System.out.println(membres);
	            return membres;
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