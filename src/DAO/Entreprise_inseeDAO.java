package DAO;

import java.util.List;

public interface Entreprise_inseeDAO {
	
	Entreprise_insee load(final Entreprise_insee data) throws Exception;

	public int delete(final Entreprise_insee data) throws Exception;

	public int update(final Entreprise_insee data) throws Exception;

	public long insert(final Entreprise_insee data) throws Exception;


	public List<Entreprise_insee> queryAll()throws Exception;



	public List<Entreprise_insee> queryBycodgeo(float codgeo)throws Exception;
	public List<Entreprise_insee> queryBynb_entreprises_secteur_services(int nb_entreprises_secteur_services)throws Exception;
	public List<Entreprise_insee> queryBynb_entreprises_secteur_commerce(int nb_entreprises_secteur_commerce)throws Exception;
	public List<Entreprise_insee> queryBynb_entreprises_secteur_construction(int nb_entreprises_secteur_construction)throws Exception;
	public List<Entreprise_insee> queryBynb_entreprises_secteur_industrie(int nb_entreprises_secteur_industrie)throws Exception;
	public List<Entreprise_insee> queryBynb_creation_enteprises(int nb_creation_enteprises)throws Exception;
	public List<Entreprise_insee> queryBynb_creation_industrielles(int nb_creation_industrielles)throws Exception;
	public List<Entreprise_insee> queryBynb_creation_construction(int nb_creation_construction)throws Exception;
	public List<Entreprise_insee> queryBynb_creation_commerces(int nb_creation_commerces)throws Exception;
	public List<Entreprise_insee> queryBynb_creation_services(int nb_creation_services)throws Exception;
	public List<Entreprise_insee> queryBynb_actifs(int nb_actifs)throws Exception;
	

}
