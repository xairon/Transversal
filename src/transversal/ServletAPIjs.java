package transversal;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import DAO.Ville;


public class ServletAPIjs extends HttpServlet {
	HashMap <String,ArrayList> jsonh = new HashMap<>();

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html;charset=UTF-8");
		
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Integer> value = new ArrayList<Integer>();
		ArrayList<String> nomA = new ArrayList<String>();
		ArrayList<String> valeurA = new ArrayList<String>();
		ArrayList<String> liste = new ArrayList<String>();
		ArrayList<String> name2 = new ArrayList<String>();
		ArrayList<Integer> value2 = new ArrayList<Integer>();
		ArrayList<String> liste2 = new ArrayList<String>();
		String body;
		String arg[];


		String ville1 ="ville1";
		String ville2="ville2";
		float superf1=0;
		float superf2 = 0;
		String dep1;
		String dep2;
		String reg1;
		String reg2;
		boolean v1=false;
		boolean v2=false;
		  
		body = request.getReader().lines().collect(Collectors.joining(System.lineSeparator()));	
		arg = body.split(";");

		ville1 = arg[0];
		ville2 = arg[1];
System.out.println(ville1);
System.out.println(ville2);
try{

	
	 //loading drivers for mysql
    Class.forName("com.mysql.jdbc.Driver");

 //creating connection with the database 
    Connection con=DriverManager.getConnection
                   ("jdbc:mysql://localhost:3306/projet","root","root");
	
        
        PreparedStatement ps =con.prepareStatement
                            ("select superf from ville where libgeo=?");
        ps.setString(1, ville1);
       
        ResultSet rs =ps.executeQuery();
        if(rs.next()) 
       superf1 = rs.getFloat(1);
       
}

catch(Exception e)
     {
         e.printStackTrace();
     }
if(v2==true) {// les requêtes de la ville 2
try{

	
	 //loading drivers for mysql
    Class.forName("com.mysql.jdbc.Driver");

 //creating connection with the database 
    Connection con=DriverManager.getConnection
                   ("jdbc:mysql://localhost:3306/projet","root","root");

    
    PreparedStatement ps =con.prepareStatement
                        ("select superf from ville where libgeo=?");
    ps.setString(1, ville2);
   
    ResultSet rs =ps.executeQuery();
    superf2 = rs.getFloat(1);
   
 }
catch(Exception e)
     {
         e.printStackTrace();
     }}

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
			value.add(20);//requête sur la population
			value.add(20);//requête sur le chomage
			value.add(20);//requête sur le nombre d'étudiant
			value.add((int)superf1);//requête blabla
			value.add(20);//requête sur blabla
			liste.add("1"); //requête sur la meilleure ville son numéro de classement
			liste.add(ville1);
			liste.add(""); //requête sur le département
			liste.add(""); //requête sur la région

		}
		if(v1==true&&v2==true) {
			name.add("Population ");
			name.add("taux de chômage ");
			name.add("nombre d'étudiant ");
			name.add("Superficie ");
			name.add("Département ");
			name.add("Région ");
			name2.add("Population ");
			name2.add("taux de chômage ");
			name2.add("nombre d'étudiant ");
			name2.add("Superficie ");
			name2.add("Département ");
			name2.add("Région ");
			value.add(20);//requête sur la population
			value.add(20);//requête sur le chomage
			value.add(20);//requête sur le nombre d'étudiant
			value.add((int)superf1);//requête blabla
			value.add(20);//requête sur blabla
			liste.add("1"); //requête sur la meilleure ville son numéro de classement
			liste.add(ville1);
			liste.add(""); //requête sur le département
			liste.add(""); //requête sur la région

			value2.add(20);//requête sur la population
			value2.add(20);//requête sur le chomage
			value2.add(20);//requête sur le nombre d'étudiant
			value2.add((int)superf2);//requête blabla
			value2.add(20);//requête sur blabla
			liste2.add("1"); //requête sur la meilleure ville son numéro de classement
			liste2.add(ville2);
			liste2.add(""); //requête sur le département
			liste2.add(""); //requête sur la région

		}

		}
		else {
		for(int i =0;i<tabnom.length;i++) 
		{
			switch(tabnom[i]) {
			case "etudes-nombre": 

			case "Universite": 
			break;
			case "ecoles_paramedicales_et_sociales": 
			break;

			case "ecoles_juridiques_et_administratives": 
			break;


			case "ecoles_superieures_art_et_culture": 
			break;


			case "ecole_de_commerce,_gestion_et_comptabilite": 
			break;


			case "Formations_ingenieurs": 
			break;


			case "Section_de_techniciens_superieurs_et_assimiles":
			break;


			case "Universite_de_technologie": 
			break;


			case "Grands_etablissement_MENESR": 

			break;

			case "ecoles_normales_superieures":

			break;

			case "Instituts_nationaux_polytechniques": 
			break;


			case "ESPE": 
			break;


			case "Classes_preparatoires_aux_grandes_ecoles_(CPGE)":

			break;

			case "etudes-secteur-public":
			break;


			case "etudes-secteur-prive": 
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
