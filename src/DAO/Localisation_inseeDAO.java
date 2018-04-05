package DAO;

import java.util.List;
import java.util.Date;
import DAO.Member;

public interface Localisation_inseeDAO {
	Localisation_insee load(final long id) throws Exception;
	
	public int delete(final Localisation_insee data) throws Exception;
	
	public int update(final Localisation_insee data) throws Exception;
	
	public int insert(final Localisation_insee data) throws Exception;
	
	public List<Localisation_insee> queryAll() throws Exception;
	
	public List<Localisation_insee> queryBycodgeo(float codgeo) throws Exception;
	public List<Localisation_insee> queryBydep(float dep) throws Exception;
	public List<Localisation_insee> queryBylibgeo(String libgeo) throws Exception;
	public List<Localisation_insee> queryByurbanite_ruralite(int urbanite_ruralite) throws Exception;
	public List<Localisation_insee> queryByscore_urbanite(float score_urbanite) throws Exception;
}
