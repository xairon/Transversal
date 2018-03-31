package transversal;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Formulaire extends HttpServlet {

	
	public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
		response.setContentType("text/html");
		//Etape2. Récupère le PrintWriterpourenvoyerdes donnéesauclient
		PrintWriter out = response.getWriter();
		// Step3.Envoyer l’informationauclient
		out.println("<html>");
		out.println("<head><title>Bonjour</title></head>");
		out.println("<body>");
		out.println("<h1>Bonjouràtous</h1>");
		out.println("Il est: " + new java.util.Date());
		out.println("</body></html>");

    }

    

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
    	
    }
	
}
