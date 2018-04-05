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


public class ServletAPIjs extends HttpServlet {
	HashMap <String,ArrayList> jsonh = new HashMap<>();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


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
		boolean v1=false;
		boolean v2=false;

		body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));	
		arg = body.split(";");

		ville1 = arg[0];
		ville2 = arg[1];
System.out.println(ville1);
System.out.println(ville2);
		if(ville1.equals("ville1"))
			v1=false;
		else v1 =true;
		if(ville2.equals("ville2"))
			v2=false;
		else v2 = true;

		for(int i =3;i<arg.length;i+=2) {
			if(!arg[i].contains("false")&&!arg[i].contains("0")) {
				valeurA.add(arg[i]);
				nomA.add(arg[i-1]);
			}

		}
		String tabnom[] = new String[nomA.size()]; 
		tabnom = nomA.toArray(tabnom);
		System.out.println(Arrays.toString(tabnom));
		if(tabnom.length==0) {

		if(v1==true&&v2==false) {
			name.add("Population "); 
			name.add("taux de chomage ");
			name.add("nombre d'étudiant ");
			name.add("Superficie ");
			name.add("urbanité ");
			value.add("3000");//requête sur la population
			value.add("30");//requête sur le chomage
			value.add("453");//requête sur le nombre d'étudiant
			value.add("100");//requête blabla
			value.add("200");//requête sur blabla
			liste.add("1"); //requête sur la meilleure ville son numéro de classement
			liste.add(ville1);
			liste.add("Indre"); //requête sur le département
			liste.add("Centre"); //requête sur la région

		}
		if(v1==true&&v2==true) {
			name.add("Population ");
			name.add("taux de chomage ");
			name.add("nombre d'etudiant ");
			name.add("Superficie ");
			name.add("urbanite ");
			name2.add("Population ");
			name2.add("taux de chomage ");
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

			value2.add("3000");//requête sur la population
			value2.add("30");//requête sur le chomage
			value2.add("453");//requête sur le nombre d'étudiant
			value2.add("100");//requête blabla
			value2.add("200");//requête sur blabla
			liste2.add("1"); //requête sur la meilleure ville son numéro de classement
			liste2.add(ville2);
			liste2.add("Indre"); //requête sur le département
			liste2.add("Centre"); //requête sur la région

		}

		}
		else {
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
