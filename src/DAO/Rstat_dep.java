package DAO;

public class Rstat_dep {
	
	private float codgeo; 
	private int REG; 
	private String LIBGEO;
	private int POPEST12; 
	private int EMPESTIM10; 
	private float TCHOMB3T12;
	private String ID;

	
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public float getCodgeo() {
		return codgeo;
	}
	public void setCodgeo(float codgeo) {
		this.codgeo = codgeo;
	}
	public int getREG() {
		return REG;
	}
	public void setREG(int rEG) {
		REG = rEG;
	}
	public String getLIBGEO() {
		return LIBGEO;
	}
	public void setLIBGEO(String lIBGEO) {
		LIBGEO = lIBGEO;
	}
	public int getPOPEST12() {
		return POPEST12;
	}
	public void setPOPEST12(int pOPEST12) {
		POPEST12 = pOPEST12;
	}
	public int getEMPESTIM10() {
		return EMPESTIM10;
	}
	public void setEMPESTIM10(int eMPESTIM10) {
		EMPESTIM10 = eMPESTIM10;
	}
	public float getTCHOMB3T12() {
		return TCHOMB3T12;
	}
	public void setTCHOMB3T12(float tCHOMB3T12) {
		TCHOMB3T12 = tCHOMB3T12;
	}
	
}
