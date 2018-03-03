package transversal;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class Connexion extends HttpServlet {
 
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("user");
        String pass = request.getParameter("pass");
     
        HttpSession session = request.getSession();
  
        if(Validate.checkUser(name, pass))
        	
        {
        	request.getSession().setAttribute("co", 2);

            RequestDispatcher rs = request.getRequestDispatcher("admin.jsp");
            rs.forward(request, response);
        }
        else
        {
        	
        	request.getSession().setAttribute("erreur", 1);
          
           RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
           rs.include(request, response);
        }
    }  
}