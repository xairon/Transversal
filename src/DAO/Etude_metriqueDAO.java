package DAO;

import java.util.List;
import java.util.Date;
import DAO.Etude_metrique;

public interface Etude_metriqueDAO {

	Etude_metrique load(final Etude_metrique data) throws Exception;
	
	public int delete(final Etude_metrique data) throws Exception;
	
	public int update(final Etude_metrique data) throws Exception;
	
	public int insert(final Etude_metrique data) throws Exception;
	
	
	public List<Etude_metrique> queryAll()throws Exception;
	
	
	public List<Etude_metrique> queryBycodgeo(float codgeo) throws Exception;
	public List<Etude_metrique> queryBymetrique_effmoy(double codgeo) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff1(double metrique_eff1) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff2(double metrique_eff2) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff3(double metrique_eff3) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff4(double metrique_eff4) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff5(double metrique_eff5) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff6(double metrique_eff6) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff7(double metrique_eff7) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff8(double metrique_eff8) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff9(double metrique_eff9) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff10(double metrique_eff10) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff11(double metrique_eff11) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff12(double metrique_eff12) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff13(double metrique_eff13) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff14(double metrique_eff14) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff15(double metrique_eff15) throws Exception;
	public List<Etude_metrique> queryBymetrique_eff16(double metrique_eff16) throws Exception;
	public List<Etude_metrique> queryBymetrique_public(double metrique_public) throws Exception;
	public List<Etude_metrique> queryBymetrique_privee(double metrique_privee) throws Exception;
	public List<Etude_metrique> queryBynbetudiant(int nbetudiant) throws Exception;
	
}
