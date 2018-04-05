package DAO;

import java.util.*;
import DAO.Etude;
public interface EtudeDAO {
	
	Etude load(final Etude data) throws Exception;
	
	public int delete(final Etude data) throws Exception;
	
	public int update(final Etude data) throws Exception;
	
	public long insert(final Etude data) throws Exception;
	
	public List<Etude> queryAll()throws Exception;
	public List<Etude> queryByCODGEO(float CODGEO) throws Exception;
	public List<Etude> queryByeff_moy(float eff_moy)throws Exception;
	public List<Etude> queryByeff1(float eff1)throws Exception;
	public List<Etude> queryByeff2(float eff1)throws Exception;
	public List<Etude> queryByeff3(float eff1)throws Exception;
	public List<Etude> queryByeff4(float eff1)throws Exception;
	public List<Etude> queryByeff5(float eff1)throws Exception;
	public List<Etude> queryByeff6(float eff1)throws Exception;
	public List<Etude> queryByeff7(float eff1)throws Exception;
	public List<Etude> queryByeff8(float eff1)throws Exception;
	public List<Etude> queryByeff9(float eff1)throws Exception;
	public List<Etude> queryByeff10(float eff1)throws Exception;
	public List<Etude> queryByeff11(float eff1)throws Exception;
	public List<Etude> queryByeff12(float eff1)throws Exception;
	public List<Etude> queryByeff13(float eff1)throws Exception;
	public List<Etude> queryByeff14(float eff1)throws Exception;
	public List<Etude> queryByeff15(float eff1)throws Exception;
	public List<Etude> queryByeff16(float eff1)throws Exception;
	public List<Etude> queryByprivee(float privee)throws Exception;
	public List<Etude> queryBypublic_(float public_)throws Exception;
	public List<Etude> queryBygeo_nom(String geo_nom)throws Exception;
}
