package transversal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

//CTRL + SHIFT + O pour générer les imports
public class VilleDAO extends DAO<Ville> {
public VilleDAO(Connection conn) {
  super(conn);
}

public boolean create(Ville obj) {
  return false;
}

public boolean delete(Ville obj) {
  return false;
}
 
public boolean update(Ville obj) {
  return false;
}
 
public Ville find(int id) {
	Ville ville = new Ville();      
    
  try {
    ResultSet result = this.connect.createStatement(
      ResultSet.TYPE_SCROLL_INSENSITIVE,
      ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM eleve WHERE elv_id = " + id);
    if(result.first())
      ville = new Ville(result.getString("nom"),result.getString("departement"));         
  } catch (SQLException e) {
    e.printStackTrace();
  }
  return ville;
}
}