package DAO;

import java.util.List;

public interface VilleDAO {
	
	Ville load(final Ville data) throws Exception;

	public int delete(final Ville data) throws Exception;

	public int update(final Ville data) throws Exception;

	public long insert(final Ville data) throws Exception;


	public List<Ville> queryAll()throws Exception;



	public List<Ville> queryBycodgeo(float codgeo)throws Exception;
	public List<Ville> queryByreg(int reg)throws Exception;
	public List<Ville> queryBydep(float dep)throws Exception;
	public List<Ville> queryByze2010(int ze2010)throws Exception;
	public List<Ville> queryBylibgeo(String libgeo)throws Exception;
	public List<Ville> queryBysuperf(float superf)throws Exception;

}
