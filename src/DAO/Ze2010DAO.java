package DAO;
import java.util.List;
import java.util.Date;
import DAO.Ze2010;
public interface Ze2010DAO {
	

		Ze2010 load(final Ze2010 data) throws Exception;

		public int delete(final Ze2010 data) throws Exception;

		public int update(final Ze2010 data) throws Exception;

		public long insert(final Ze2010 data) throws Exception;


		public List<Ze2010> queryAll()throws Exception;



		public List<Ze2010> queryBycodgeo(float codgeo)throws Exception;
		public List<Ze2010> queryBylibgeo(String libgeo)throws Exception;
		public List<Ze2010> queryByempestim09(int empestim09)throws Exception;
		public List<Ze2010> queryBytchomb3t12(float tchomb3t12)throws Exception;

}
