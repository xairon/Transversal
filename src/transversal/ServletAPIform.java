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


public class ServletAPIform extends HttpServlet {
		/**
	 * 
	 */
	private static final long serialVersionUID = 2638098469236376682L;
		HashMap <String,ArrayList> jsonh = new HashMap<String,ArrayList>();
	
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

		
	 body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));	
	 arg = body.split(";");
	 



	
	for(int i =1;i<arg.length;i+=2) {
		if(!arg[i].contains("false")) {
			valeurA.add(arg[i]);
			nomA.add(arg[i-1]);
		}
			
	}
	String tabnom[] = new String[nomA.size()]; 
	tabnom = nomA.toArray(tabnom);
switch(tabnom[0]) {
	case"etudes-nombre": name.add("Nombre d'étudiant");value.add("2000");

	case"etudes-regroupement-Universite": name.add("Universités");value.add("8");
	
	case"etudes-regroupement-ecoles_paramedicales_et_sociales": name.add("écoles paramédicales et sociales");value.add("5");

	
	case"etudes-regroupement-ecoles_juridiques_et_administratives": name.add("p");value.add("p");

	
	
	case"etudes-regroupement-ecoles_superieures_art_et_culture": name.add("pp");value.add("pp");

	
	
	case"etudes-regroupement-ecole_de_commerce,_gestion_et_comptabilite": name.add("ppp");value.add("ppp");

	
	
	case"etudes-regroupement-Formations_ingenieurs": name.add("a");value.add("a");

	
	
	case"etudes-regroupement-Section_de_techniciens_superieurs_et_assimiles": name.add("aa");value.add("aa");

	
	
	case"etudes-regroupement-Universite_de_technologie": name.add("aaa");value.add("aaa");

	
	
	case"etudes-regroupement-Grands_etablissement_MENESR": name.add("d");value.add("d");

	
	
	case"etudes-regroupement-ecoles_normales_superieures": name.add("dd");value.add("dd");

	
	
	case"etudes-regroupement-Instituts_nationaux_polytechniques": name.add("ddd");value.add("ddd");

	
	
	case"etudes-regroupement-ESPE": name.add("c");value.add("c");

	
	
	case"etudes-regroupement-Classes_preparatoires_aux_grandes_ecoles_(CPGE)": name.add("cc");value.add("cc");

	
	
	case"etudes-secteur-public": name.add("ccc");value.add("ccc");

	
	
	case"etudes-secteur-prive": name.add("j");value.add("j");

	
	/*
	case"population-densite": 

	
	
	case"population-croissance": 

	
	
	case"population-chomage": 

	
		
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

	*/
	
	break;
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

	System.out.println(jsonh);
	System.out.println(body);
	PrintWriter out = null; 
	response.setContentType(json);
	out = response.getWriter();
	out.println(json);
	}
	
}