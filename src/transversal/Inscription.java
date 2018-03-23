package transversal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Inscription extends HttpServlet {
	 public static final  Member membre= new Member();

	    HttpSession session;

	 public static void main (String[] args) throws java.lang.Exception
	    {
	System.out.println(userexist("admin"));
	System.out.println(userexist("tamere"));
	 
	    }
	 public static boolean userexist(String pseudo) throws SQLException {
		  final String queryCheck = "SELECT * from members WHERE uname = ?";
		 boolean res = false;

				ResultSet myRs = null;
				Connection myConn = null;
				
				try {
					Class.forName("com.mysql.jdbc.Driver");
					// 1. Get a connection to database
					myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/projet", "root" , "root");
					
					 final PreparedStatement ps = myConn.prepareStatement(queryCheck);
					  ps.setString(1, pseudo);
					  final ResultSet resultSet = ps.executeQuery();
					  if (resultSet.next()) {
						   res=true;
						} else {
						   res= false;
						}
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
				return res;
		         
		    }
  
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{



    }

    

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{

        /* Récupération des champs du formulaire. */
    	   session = request.getSession();
    	   
    	
 

        String motDePasse = request.getParameter("pass");

        String confirmation = request.getParameter("pass2");

        String nom = request.getParameter("user");
        membre.setfull(nom,motDePasse);

        try {

        	 if (userexist(membre.getUname())) {
        		  if (motDePasse.trim().length() < 3) 
                    	session.setAttribute("erreurmdp", 2);                    	
                    
             	 if (!motDePasse.equals(confirmation)) 
                       	session.setAttribute("erreurmdpconf", 2);                        
                       
                	session.setAttribute("erreurnom", 2);
                	RequestDispatcher rs = request.getRequestDispatcher("Inscription.jsp");
        	      rs.forward(request, response);
        	      session.invalidate();
        	      
        	 }
        	 else if ( membre.getUname().contains(" ") || membre.getUname().matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" )|| membre.getUname().trim().length() > 15) {
        		   	session.setAttribute("erreurcarac", 2);
                	RequestDispatcher rs = request.getRequestDispatcher("Inscription.jsp");
                	rs.forward(request, response);
                	session.invalidate();
             }
        	 else if (motDePasse.trim().length() < 3 ||motDePasse.trim().length() > 20 || motDePasse.contains(" ") || motDePasse.matches( "=+" )) {
        		 if (!motDePasse.equals(confirmation)) 
                    	session.setAttribute("erreurmdpconf", 2);
               	session.setAttribute("erreurmdp", 2);
               	RequestDispatcher rs = request.getRequestDispatcher("Inscription.jsp");
               	rs.forward(request, response);
               	session.invalidate();
               }
        	 else if (!motDePasse.equals(confirmation)) {
        		
                  	session.setAttribute("erreurmdpconf", 2);
                   	RequestDispatcher rs = request.getRequestDispatcher("Inscription.jsp");
                   	rs.forward(request, response);
                   	session.invalidate();
                  } 
              
        	  
               
        	  else
        	  {
        		  MemberDAOImpl connection = new MemberDAOImpl();        		 
        		 
              	
        		  connection.insert(membre);
        		  connection.closeConnection();
        		  RequestDispatcher rs = request.getRequestDispatcher("index.jsp"); 
        		  rs.include(request, response);
        	  }

        } catch (Exception e) {

            /* Gérer les erreurs de validation ici. */

        }

    }



   
}