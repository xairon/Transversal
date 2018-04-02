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
		String nom[] = null;
		String valeur[] = null;
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
	
	for(int i =4;i<arg.length;i+=2) {
		if(!arg[i].contains("false")) {
			valeurA.add(arg[i]);
			nomA.add(arg[i-1]);
		}
			//note : remplacer les == par des equals sur les string
	}
if(v1==true&&v2==false) {
	name.add("Population");
	name.add("taux de chomage");
	name.add("nombre d'etudiant");
	name.add("Superficie");
	name.add("urbanite");
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
	name.add("taux de chomage");
	name.add("nombre d'etudiant");
	name.add("Superficie");
	name.add("urbanite");
	name2.add("Population v2");
	name2.add("taux de chomage v2");
	name2.add("nombre d'etudiant v2");
	name2.add("Superficie v2");
	name2.add("urbanite v2");
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
jsonh.put("nom", nomA);
jsonh.put("valeur", valeurA);
Gson gson = new Gson(); 
String json = gson.toJson(jsonh);

response.setStatus(200);
	System.out.println(jsonh);
	System.out.println(body);
	switch(arg[0]) {
	case"request1":	response.setContentType(json);
	PrintWriter out = response.getWriter();
	out.println(json);
	case"etudes-nombre": 

	
	
	case"etudes-regroupement-ecoles_paramedicales_et_sociales": 

	
	case"etudes-regroupement-Universite": 

	
	
	case"etudes-regroupement-ecoles_juridiques_et_administratives": 

	
	
	case"etudes-regroupement-ecoles_superieures_art_et_culture": 

	
	
	case"etudes-regroupement-ecole_de_commerce,_gestion_et_comptabilite": 

	
	
	case"etudes-regroupement-Formations_ingenieurs": 

	
	
	case"etudes-regroupement-Section_de_techniciens_superieurs_et_assimiles": 

	
	
	case"etudes-regroupement-Universite_de_technologie": 

	
	
	case"etudes-regroupement-Grands_etablissement_MENESR": 

	
	
	case"etudes-regroupement-ecoles_normales_superieures": 

	
	
	case"etudes-regroupement-Instituts_nationaux_polytechniques": 

	
	
	case"etudes-regroupement-ESPE": 

	
	
	case"etudes-regroupement-Classes_preparatoires_aux_grandes_ecoles_(CPGE)": 

	
	
	case"etudes-secteur-public": 

	
	
	case"etudes-secteur-prive": 

	
	
	case"population-densite": 

	
	
	case"population-croissance": 

	
	
	case"population-chomage": 

	
	
	case"population-secteur-Agriculture": 

	
	
	case"population-secteur-Industrie": 

	
	
	case"population-secteur-Construction": 

	
	
	case"population-secteur-Commerce_et_service": 

	
	
	case"population-secteur-Commerce": 

	
	
	case"population-secteur-Administration_publique": 

	
	
	case"territoire-orientation-Residentiel": 

	
	
	case"territoire-orientation-Urbain": 

	
	
	case"territoire-orientation-Industriel": 

	
	
	case"territoire-orientation-Agroalimentaire": 

	
	
	case"territoire-orientation-Diversifie": 

	
	
	case"entreprise-emploi": 

	
	
	case"entreprise-secteur-Services": 

	
	
	case"entreprise-secteur-Commerce": 

	
	
	case"entreprise-secteur-Construction": 

	
	
	case"entreprise-secteur-Industrie": 

	
	
	break;
	}
	/*PrintWriter out = null; pour l'envoie de réponse
	response.setContentType(json);
	out = response.getWriter();
	out.println(json);*/
	}
	
}
