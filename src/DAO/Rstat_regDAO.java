package DAO;

import java.util.List;

public interface Rstat_regDAO {
	Rstat_reg load(final Rstat_reg data) throws Exception;

	public int delete(final Rstat_reg data) throws Exception;

	public int update(final Rstat_reg data) throws Exception;

	public long insert(final Rstat_reg data) throws Exception;


	public List<Rstat_reg> queryAll()throws Exception;



	public List<Rstat_reg> queryBycodgeo(float codgeo)throws Exception;
	public List<Rstat_reg> queryBylibgeo(String libgeo)throws Exception;
	public List<Rstat_reg> queryBytchomb3t12(float tchomb3t12)throws Exception;

}
