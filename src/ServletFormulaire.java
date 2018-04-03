import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletFormulaire extends HttpServlet {
	ArrayList<String> name = new ArrayList();
	ArrayList<Integer> value = new ArrayList();
	String test = "bonjour";
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
		 name.add("dylan");
			name.add("marie");
			name.add("gaëtan");
			value.add(10);
			value.add(50);
			value.add(23);
			test = "coucou";
		request.getSession().setAttribute("name", name);
		request.getSession().setAttribute("test", test);
		request.getSession().setAttribute("value",value);
		 PrintWriter out=response.getWriter();
		RequestDispatcher rs = request.getRequestDispatcher("pagePrincipale.jsp");
        rs.forward(request, response);
        out.close(); 
	}

}
