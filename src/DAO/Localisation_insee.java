package DAO;

public class Localisation_insee {
	
	private float codgeo;
	private float dep;
	private String libgeo;
	private int urbanite_ruralite;
	private float score_urbanite;
	
	
	public float getCodgeo() {
		return codgeo;
	}
	public void setCodgeo(float codgeo) {
		this.codgeo = codgeo;
	}
	public float getDep() {
		return dep;
	}
	public void setDep(float dep) {
		this.dep = dep;
	}
	public String getLibgeo() {
		return libgeo;
	}
	public void setLibgeo(String libgeo) {
		this.libgeo = libgeo;
	}
	public int getUrbanite_ruralite() {
		return urbanite_ruralite;
	}
	public void setUrbanite_ruralite(int urbanite_ruralite) {
		this.urbanite_ruralite = urbanite_ruralite;
	}
	public float getScore_urbanite() {
		return score_urbanite;
	}
	public void setScore_urbanite(float score_urbanite) {
		this.score_urbanite = score_urbanite;
	}
}
