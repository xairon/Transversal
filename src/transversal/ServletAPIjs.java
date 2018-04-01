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
		ArrayList<Integer> value = new ArrayList<Integer>();
		HashMap <String,ArrayList> jsonh = new HashMap<>();
		name.add("str1");
		name.add("str2");
		name.add("str3");
		value.add(20);
		value.add(50);
		value.add(90);
		jsonh.put("value", value);
		jsonh.put("name", name);
		Gson gson = new Gson(); 
		String json = gson.toJson(jsonh);
	
	String body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));
	System.out.println(jsonh);
	System.out.println(body);
	String arg []= body.split(";");
	switch(arg[0]) {
	case"request1": response.setContentType(json);
	PrintWriter out = response.getWriter();
	out.println(json);
	response.setStatus(200);	
	break;
	}
	}

}
