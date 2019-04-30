/*
 Talks to the data base.
 */


package moviePackage;

/**
 *
 * @author smeetdeval
 */
import java.sql.*;
import java.util.*;
import java.util.ArrayList;
public class DataBaseIO {
    
    private static final String URL = "jdbc:derby://localhost:1527/Theater";
    private static final String DATABASE = "COMPSCI";
    private static final String USERNAME = "CompSci";
    private static final String PASSWORD = "smd";
    
   
    public DataBaseIO()
   {
       
   }

 
    public Movie getMovieById(int ID) {
        
        Movie movie = null;
        ResultSet resultset = null;
        Connection connection;
        PreparedStatement stmt;
        
        try {
            connection = DriverManager.getConnection( URL, USERNAME, PASSWORD );
            stmt = connection.prepareStatement("Select * from MOVIE where id = ? ");
            stmt.setInt(1, ID);
            resultset = stmt.executeQuery();
           while(resultset.next()) {
                movie= new Movie(
                    resultset.getInt("ID"),
                    resultset.getString("TITLE"),
                    resultset.getString("DESCRIPTION"),
                    resultset.getString("MOVIE_POSTER")
                );
            }
           
    
        } catch ( SQLException sqlException ) {
         sqlException.printStackTrace();
         //close();
        } finally {
            try {
                resultset.close();
            } catch(SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        return movie;
        

    }
   
    /// get all movies 
     /*
   public ArrayList<Movie> getAllMovies() {
        String sql = "SELECT * FROM movie";
       Connection con = null;
        ArrayList<Movie> movies = new ArrayList<Movie>();
        Movie movie;
        try {            
            this.connect();
           Statement st = this.connection.createStatement();
           ResultSet rs = st.executeQuery(sql);
           while(rs.next()){
                movie = new Movie(
                    rs.getInt("id"),
                    rs.getString("title"),
                    rs.getString("description"),
                    rs.getString("poster")
                );
                movie.setShowtimes(this.getMovieShowtimes(movie.getId()));
                movies.add(movie);
            }
            rs.close();
            st.close();
            this.connect.close();
        } catch(Exception ex) {
     	   System.err.println(ex);
        }
        return movies;
   }
*/
    public ArrayList<Movie> getAllMovies() {
        
        ArrayList<Movie> movies = new ArrayList<Movie>();
        ResultSet resultset = null;
        Connection connection;
        PreparedStatement stmt;
        
        try {
            connection = DriverManager.getConnection( URL, USERNAME, PASSWORD );
            stmt = connection.prepareStatement("Select * from MOVIE ");
            resultset = stmt.executeQuery();
           while(resultset.next()) {
                movies.add(new Movie(
                    resultset.getInt("ID"),
                    resultset.getString("TITLE"),
                    resultset.getString("DESCRIPTION"),
                    resultset.getString("MOVIE_POSTER")
                ));
            }
           
    
        } catch ( SQLException sqlException ) {
         sqlException.printStackTrace();
         //close();
        } finally {
            try {
                resultset.close();
            } catch(SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        return movies;
        

    }
    
    
    
    
    
    
    //// i am working now /*
      public List<Showtime> getMovieShowtimes(int ID) {
        
        List<Showtime> showtime = new ArrayList<Showtime>();
        ResultSet resultset = null;
        Connection connection;
        PreparedStatement stmt;
        
        try {
            connection = DriverManager.getConnection( URL, USERNAME, PASSWORD );
            stmt = connection.prepareStatement("Select * from  SHOWTIMES where id = ? ");
            stmt.setInt(1, ID);
            resultset = stmt.executeQuery();
           while(resultset.next()) {
                showtime.add(new Showtime(
                      resultset.getInt("ID"),
                    resultset.getInt("ROOM"),
                    resultset.getString("TIME"),
                    resultset.getInt("price")
                ));
            }
           
    
        } catch ( SQLException sqlException ) {
         sqlException.printStackTrace();
        // close();
        } finally {
            try {
                resultset.close();
            } catch(SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        return showtime;

    }
      
      public List<Customers> getCustomers(int ID) {
        
        List<Customers> customers = new ArrayList<Customers>();
        ResultSet resultset = null;
        Connection connection;
        PreparedStatement stmt;
        try {
            connection = DriverManager.getConnection( URL, USERNAME, PASSWORD );
            stmt = connection.prepareStatement("Select * from  SHOWTIMES where id = ? ");
            stmt.setInt(1, ID);
            resultset = stmt.executeQuery();
           while(resultset.next()) {
                customers.add(new Customers(
                      //resultset.getInt("ID"),
                    resultset.getString("firstName"),
                    resultset.getString("lastName"),
                    resultset.getString("phone")
                ));
            }
           
    
        } catch ( SQLException sqlException ) {
         sqlException.printStackTrace();
        } finally {
            try {
                resultset.close();
            } catch(SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        return customers;

    }
      public List<Room> getRoom(int ID) {
        
        List<Room> room = new ArrayList<Room>();
        ResultSet resultset = null;
        Connection connection;
        PreparedStatement stmt;
        
        try {
            connection = DriverManager.getConnection( URL, USERNAME, PASSWORD );
            stmt = connection.prepareStatement("Select * from  ROOM where id = ? ");
            stmt.setInt(1, ID);
            resultset = stmt.executeQuery();
           while(resultset.next()) {
                room.add(new Room(
                      resultset.getInt("ID"),
                    resultset.getInt("number"),
                    resultset.getInt("capacity")
                ));
                
            }
           
    
        } catch ( SQLException sqlException ) {
         sqlException.printStackTrace();
        } finally {
            try {
                resultset.close();
            } catch(SQLException sqlException) {
                sqlException.printStackTrace();
            }
        }
        return room;

    }
      
      
   
    
    ////////////
      
    /*
  
    public void close()
    {
      try
      {
          connection.close();
      }
      catch(SQLException sqlException)
              {
                  sqlException.printStackTrace();
              }
    }
*/
    
}
