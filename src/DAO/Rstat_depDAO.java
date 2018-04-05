package DAO;

import java.util.List;

public interface Rstat_depDAO {
	Rstat_dep load(final Rstat_dep data) throws Exception;

	public int delete(final Rstat_dep data) throws Exception;

	public int update(final Rstat_dep data) throws Exception;

	public long insert(final Rstat_dep data) throws Exception;


	public List<Rstat_dep> queryAll()throws Exception;



	public List<Rstat_dep> queryBycodgeo(float codgeo)throws Exception;
	public List<Rstat_dep> queryByreg(int reg)throws Exception;
	public List<Rstat_dep> queryBylibgeo(String libgeo)throws Exception;
	public List<Rstat_dep> queryBypopest12(int popest12)throws Exception;
	public List<Rstat_dep> queryBytchomb3t12(int tchomb3t12)throws Exception;
	public List<Rstat_dep> queryByempestim10(int empestim10)throws Exception;
	public List<Rstat_dep> queryByID(String ID) throws Exception;

}
