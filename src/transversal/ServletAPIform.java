package transversal;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
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

	HashMap <String,ArrayList> jsonh = new HashMap<String,ArrayList>();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//("1", "villeA", "37", "3", "14"); pour la liste
		 response.setContentType("text/html;charset=UTF-8");
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
			if(!arg[i].contains("false")&&!arg[i].contains("0")) {
				valeurA.add(arg[i]);
				nomA.add(arg[i-1]);
			}

		}
		String tabnom[] = new String[nomA.size()]; 
		tabnom = nomA.toArray(tabnom);
		System.out.println(Arrays.toString(tabnom));
		for(int i =0;i<tabnom.length;i++) 
		{
			switch(tabnom[i]) {
			case "etudes-nombre": name.add("Nombre d'étudiant");value.add("2000");
			break;

			case "Universite": name.add("Universités");value.add("8");
			break;
			case "ecoles_paramedicales_et_sociales": name.add("écoles paramédicales et sociales");value.add("5");
			break;

			case "ecoles_juridiques_et_administratives": name.add("p");value.add("p");
			break;


			case "ecoles_superieures_art_et_culture": name.add("pp");value.add("pp");
			break;


			case "ecole_de_commerce,_gestion_et_comptabilite": name.add("ppp");value.add("ppp");
			break;


			case "Formations_ingenieurs": name.add("a");value.add("a");
			break;


			case "Section_de_techniciens_superieurs_et_assimiles": name.add("aa");value.add("aa");
			break;


			case "Universite_de_technologie": name.add("aaa");value.add("aaa");
			break;


			case "Grands_etablissement_MENESR": name.add("d");value.add("d");

			break;

			case "ecoles_normales_superieures": name.add("dd");value.add("dd");

			break;

			case "Instituts_nationaux_polytechniques": name.add("ddd");value.add("ddd");
			break;


			case "ESPE": name.add("c");value.add("c");
			break;


			case "Classes_preparatoires_aux_grandes_ecoles_(CPGE)": name.add("cc");value.add("cc");

			break;

			case "etudes-secteur-public": name.add("ccc");value.add("ccc");
			break;


			case "etudes-secteur-prive": name.add("j");value.add("j");
			break;

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
			default:
				break;
			}
			
			System.out.println(tabnom[i]);
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