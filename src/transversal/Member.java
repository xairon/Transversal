package transversal;

public class Member implements java.io.Serializable{
	private Long ID;
	private String uname;
	private String pas;

	public Long getID(){
		return this.ID;
	}

	public String getUname(){
		return this.uname;
	}

	public String getPas(){
		return this.pas;
	}


	public void setID(Long ID){
		this.ID = ID;
	}
	public void setfull(String uname, String pas){
		this.uname = uname;
		this.pas = pas;
	}
	public void setUname(String uname){
		this.uname = uname;
	}

	public void setPas(String pas){
		this.pas = pas;
	}

}