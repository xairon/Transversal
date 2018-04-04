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
		ArrayList<String> nomA = new ArrayList<String>();
		ArrayList<String> valeurA = new ArrayList<String>();
		ArrayList<String> liste = new ArrayList<String>();
		ArrayList<String> name2 = new ArrayList<String>();
		ArrayList<String> value2 = new ArrayList<String>();
		ArrayList<String> liste2 = new ArrayList<String>();
		String body;
		String arg[];
	

		String ville1;
		String ville2;
		boolean v1;
		boolean v2;
		
	 body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));	
	 arg = body.split(";");

	 ville1 = arg[0];
	 ville2 = arg[1];

	if(ville1.equals("ville1"))
		v1=false;
	else v1 =true;
	if(ville2.equals("ville2"))
		v2=false;
	else v2 = true;
	

	
if(v1==true&&v2==false) {
	name.add("Population"); 
	name.add("taux de chomage");
	name.add("nombre d'etudiant");
	name.add("Superficie");
	name.add("urbanite");
	value.add("3000");//requête sur la population
	value.add("30");//requête sur le chomage
	value.add("453");//requête sur le nombre d'étudiant
	value.add("100");//requête blabla
	value.add("200");//requête sur blabla
	liste.add("1"); //requête sur la meilleure ville son numéro de classement
	liste.add(ville1);
	liste.add("Indre"); //requête sur le département
	liste.add("Centre"); //requête sur la région
	liste.add("0"); //requête sur le ??score ??
}
if(v1==true&&v2==true) {
	name.add("Population");
	name.add("taux de chomage");
	name.add("nombre d'etudiant");
	name.add("Superficie");
	name.add("urbanite");
	name2.add("Population v2");
	name2.add("taux de chomage v2");
	name2.add("nombre d'etudiant v2");
	name2.add("Superficie v2");
	name2.add("urbanite v2");
	value.add("3000");//requête sur la population
	value.add("30");//requête sur le chomage
	value.add("453");//requête sur le nombre d'étudiant
	value.add("100");//requête blabla
	value.add("200");//requête sur blabla
	liste.add("1"); //requête sur la meilleure ville son numéro de classement
	liste.add(ville1);
	liste.add("Indre"); //requête sur le département
	liste.add("Centre"); //requête sur la région
	liste.add("0"); //requête sur le ??score ??
	value2.add("3000");//requête sur la population
	value2.add("30");//requête sur le chomage
	value2.add("453");//requête sur le nombre d'étudiant
	value2.add("100");//requête blabla
	value2.add("200");//requête sur blabla
	liste2.add("1"); //requête sur la meilleure ville son numéro de classement
	liste2.add(ville2);
	liste2.add("Indre"); //requête sur le département
	liste2.add("Centre"); //requête sur la région
	liste2.add("0"); //requête sur le ??score ??
}



	System.out.println(jsonh);
	System.out.println(body);
	
	jsonh.put("value", value);
	jsonh.put("value2", value2);
	jsonh.put("name", name);
	jsonh.put("name2", name2);
	jsonh.put("liste", liste);
	jsonh.put("liste2", liste2);


	Gson gson = new Gson(); 
	String json = gson.toJson(jsonh);
	PrintWriter out = null; 
	response.setContentType(json);
	out = response.getWriter();
	out.println(json);
	}
	
}
