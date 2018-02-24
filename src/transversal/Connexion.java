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
        
        String email = request.getParameter("user");
        String pass = request.getParameter("pass");
        HttpSession session = request.getSession();

        if(Validate.checkUser(email, pass))
        {
            RequestDispatcher rs = request.getRequestDispatcher("index.jsp");
            rs.forward(request, response);
        }
        else
        {
           out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("login.jsp");
           rs.include(request, response);
        }
    }  
}