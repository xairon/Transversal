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
		HashMap <String,ArrayList> jsonh = new HashMap<>();
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//("1", "villeA", "37", "3", "14"); pour la liste
		
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> value = new ArrayList<String>();
		ArrayList<String> liste = new ArrayList<String>();
		ArrayList<String> name2 = new ArrayList<String>();
		ArrayList<String> value2 = new ArrayList<String>();
		ArrayList<String> liste2 = new ArrayList<String>();
		String body;
		String arg[];
		String req;
		String ville1;
		String ville2;
		boolean v1;
		boolean v2;

	 body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));	
	 arg = body.split(";");
	 req = arg[0];
	 ville1 = arg[1];
	 ville2 = arg[2];

	if(ville1.equals("ville1"))
		v1=false;
	else v1 =true;
	if(ville2.equals("ville2"))
		v2=false;
	else v2 = true;
	
	/*for(int i =4;i<arg.length;i+=2) {
		if(!arg[i].contains("false")) {
			value.add(arg[i]);
			name.add(arg[i-1]);
		}
			//note : remplacer les == par des equals sur les string
	}*/
if(v1==true&&v2==false) {
	name.add("Population");
	name.add("taux de chômage");
	name.add("nombre d'étudiant");
	name.add("Population");
	name.add("Population");
	value.add("3000");
	value.add("30");
	value.add("453");
	value.add("100");
	value.add("200");
	liste.add("1");
	liste.add(ville1);
	liste.add("Indre");
	liste.add("Centre");
	liste.add("0");
}
if(v1==true&&v2==true) {
	name.add("Population");
	name.add("taux de chômage");
	name.add("nombre d'étudiant");
	name.add("Population1");
	name.add("Population2");
	name2.add("Population v2");
	name2.add("taux de chômage v2");
	name2.add("nombre d'étudiant v2");
	name2.add("Population1 v2");
	name2.add("Population2 v2");
	value.add("3000");
	value.add("30");
	value.add("453");
	value.add("100");
	value.add("200");
	liste.add("1");
	liste.add(ville1);
	liste.add("Indre");
	liste.add("Centre");
	liste.add("0");
	value2.add("5000");
	value2.add("45");
	value2.add("853");
	value2.add("300");
	value2.add("100");
	liste2.add("1");
	liste2.add(ville2);
	liste2.add("Indre");
	liste2.add("Centre");
	liste2.add("0");
}
jsonh.put("value", value);
jsonh.put("value2", value2);
jsonh.put("name", name);
jsonh.put("name2", name2);
jsonh.put("liste", liste);
jsonh.put("liste2", liste2);
Gson gson = new Gson(); 
String json = gson.toJson(jsonh);

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
