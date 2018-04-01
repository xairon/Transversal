package transversal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;


public class ServletAPIjs extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> value = new ArrayList<String>();
		
		HashMap <String,ArrayList> jsonh = new HashMap<>();
		jsonh.put("value", value);
		jsonh.put("name", name);
		Gson gson = new Gson(); 
		String json = gson.toJson(jsonh);
	
	String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));	
	String arg []= body.split(";");
	for(int i =4;i<arg.length;i+=2) {
		if(!arg[i].contains("false")) {
			value.add(arg[i]);
			name.add(arg[i-1]);
		}
			
	}

	System.out.println(jsonh);
	System.out.println(body);
	switch(arg[0]) {
	case"request1": response.setContentType(json);
	PrintWriter out = response.getWriter();
	out.println(json);
	response.setStatus(200);	
	break;
	}
	}

}
