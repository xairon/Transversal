package DAO;

import java.util.List;

public interface PopulationsDAO {
	Populations load(final Populations data) throws Exception;

	public int delete(final Populations data) throws Exception;

	public int update(final Populations data) throws Exception;

	public long insert(final Populations data) throws Exception;


	public List<Populations> queryAll()throws Exception;



	public List<Populations> queryBycodgeo(float codgeo)throws Exception;
	public List<Populations> queryByp09_pop1564(int p09_pop1564)throws Exception;
	public List<Populations> queryByp09_chom1564(int p09_chom1564)throws Exception;
	public List<Populations> queryByp09_ct1564(int p09_ct1564)throws Exception;

}
