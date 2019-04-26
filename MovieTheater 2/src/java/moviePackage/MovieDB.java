/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviePackage;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author angeljoelperez
 */
public class MovieDB {
    private static final String URL = "jdbc:derby://localhost:1527/MovieTheater";
    //setts URL equal to the database url
   private static final String USERNAME = "app";
   //sets USERNAME equal to the username for the database
   private static final String PASSWORD = "app";
   //sets PASSWORD equal to the password for the database
   private Connection connection = null; // manages connection
   private PreparedStatement selectMovieByName = null; 
   //sets the preparedstatement equal to null
   private PreparedStatement insertNewMovie = null; 
   //sets the preparedstatement equal to null
   private PreparedStatement deleteOldMovie = null;
   private PreparedStatement insertLocation = null;
   private int result;
   
   public MovieDB()
   {
       try 
      {
         connection = 
            DriverManager.getConnection( URL, USERNAME, PASSWORD );
         // create insert that adds a new entry into the database
         // create query that selects entries with a specific last name
         selectMovieByName = connection.prepareStatement("SELECT * FROM movieinfo WHERE MovieTitle = ?");
         //selects information from the LastName column of the database
         insertNewMovie = connection.prepareStatement( 
            "INSERT INTO salaryInfo " + 
            "( movietitle, moviedesc, ) " + 
            "VALUES ( ?, ?)" );
         deleteOldMovie = connection.prepareStatement("Delete * FROM movieinfo" + "(movietitle, moviedesc)" + "VALUES(?,?)");
         //allows data to be sent into the database
         insertLocation = connection.prepareStatement("INSERT INTO movieinfo" + "(Location)" + "VALUES(?)");
      } // end try
      catch ( SQLException sqlException )
      {
         sqlException.printStackTrace();
         System.exit( 1 );
      } // end catch
   }
      public int insertNewMovie()
   {
     
      
           ResultSet resultSet = null;
        // attempt to do the entry
        try {
            int result = 0;
            insertNewMovie.setString( 2, "movietitle");
            insertNewMovie.setString( 3, "moviedesc" );


          result = insertNewMovie.executeUpdate();
        }
        catch ( SQLException sqlException ) {
            sqlException.printStackTrace();
        } // end catch
        finally {
            try {
                resultSet.close();
            } // end try
            catch ( SQLException sqlException ) {
                sqlException.printStackTrace();
                close();
            }
        }
        return result;
        //returns the result to the NewServlet Class
   }
            public int insertLocation()
   {
     
      
           ResultSet resultSet = null;
        // attempt to do the entry
        try {
            int result = 0;
            insertNewMovie.setString( 1, "Location");
            result = insertNewMovie.executeUpdate();
        }
        catch ( SQLException sqlException ) {
            sqlException.printStackTrace();
        } // end catch
        finally {
            try {
                resultSet.close();
            } // end try
            catch ( SQLException sqlException ) {
                sqlException.printStackTrace();
                close();
            }
        }
        return result;
        //returns the result to the NewServlet Class
   }
      public int deletePerson()
   {
      int result = 0;
      
      // set parameters, then execute DeletePerson
      try 
      {
         deleteOldMovie.setString(2,"movieTitle");
         deleteOldMovie.setString(2,"moviedesc");
         // Deletes the entry; returns # of rows updated
         result = deleteOldMovie.executeUpdate(); 
      } // end try
      catch ( SQLException sqlException )
      {
         sqlException.printStackTrace();
         close();
      } // end catch
      
      return result;
   } // end method deletePerson
    public void close()
   {
      try 
      {
         connection.close();
      } // end try
      catch ( SQLException sqlException )
      {
         sqlException.printStackTrace();
      } // end catch
   } // end method close
} // end class PersonQueries

