package transversal;

public class Ville {
	private String nom;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getDepartement() {
		return departement;
	}
	public void setDepartement(String departement) {
		this.departement = departement;
	}
	public Ville(String nom, String departement) {
		super();
		this.nom = nom;
		this.departement = departement;
	}
	public Ville() {
	
	}
	private String departement;

}
