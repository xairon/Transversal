package transversal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import transversal.Ville;
 
public class JDBCVilleDAO {
 
    Connection connection = null;
 
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            if(connection == null)
                connection = DriverManager.getConnection("jdbc:mysql://localhost/projet","root","root");
           
        } catch (ClassNotFoundException e) {
 
            e.printStackTrace();
             
        } catch (SQLException e) {
             
            e.printStackTrace();
             
        }
        return connection;
    }
    public void insert(Ville ville) {
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO projet.ville (nom ,departement) VALUES (? , ?)");
            preparedStatement.setString(1,  ville.getNom());
            preparedStatement.setString(2,  ville.getDepartement());
            preparedStatement.executeUpdate();
            preparedStatement.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
         
    }
 
    public List<Ville> select() {
        List<Ville> villes = new LinkedList<Ville>();
         try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery("SELECT * FROM projet.ville");
                 
                Ville ville = null;
                while(resultSet.next()){
                    ville = new Ville();
                    ville.setNom((resultSet.getString("nom")));
                    ville.setDepartement(resultSet.getString("departement"));
                     
                    villes.add(ville);
                }
                resultSet.close();
                statement.close();
                 
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(villes);
            return villes;
    }
     
     
    public void closeConnection(){
        try {
              if (connection != null) {
                  connection.close();
              }
            } catch (Exception e) { 
                //do nothing
            }
    }
 
}
