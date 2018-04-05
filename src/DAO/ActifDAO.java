package DAO; 

import java.util.List;
import java.util.Date;
import DAO.Actif;
public interface ActifDAO{
	Actif load(final Actif data) throws Exception;

	public int delete(final Actif data) throws Exception;

	public int update(final Actif data) throws Exception;

	public long insert(final Actif data) throws Exception;


	public List<Actif> queryAll()throws Exception;



	public List<Actif> queryBycodgeo(float codgeo)throws Exception;
	public List<Actif> queryByettot10(int ettot10)throws Exception;
	public List<Actif> queryByetaz10(int etaz10)throws Exception;
	public List<Actif> queryByetbe10(int etbe10)throws Exception;
	public List<Actif> queryByetfz10(int etfz10)throws Exception;
	public List<Actif> queryByetgu10(int etgu10)throws Exception;
	public List<Actif> queryByetgz10(int etgz10)throws Exception;
	public List<Actif> queryByetoq10(int etoq10)throws Exception;
	public List<Actif> queryByettef110(int ettef110)throws Exception;
	public List<Actif> queryByettefp1010(int ettefp1010)throws Exception;
	}