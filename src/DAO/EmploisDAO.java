package DAO;

import java.util.List;

public interface EmploisDAO {
	
	Emplois load(final Emplois data) throws Exception;

	public int delete(final Emplois data) throws Exception;

	public int update(final Emplois data) throws Exception;

	public long insert(final Emplois data) throws Exception;


	public List<Emplois> queryAll()throws Exception;



	public List<Emplois> queryBycodgeo(float codgeo)throws Exception;
	public List<Emplois> queryByp09_emplt(int p09_emplt)throws Exception;
	public List<Emplois> queryByp99_emplt(int p99_emplt)throws Exception;
	public List<Emplois> queryBydefmret11(int defmret11)throws Exception;
	public List<Emplois> queryBydefmt11(int defmt11)throws Exception;

}
