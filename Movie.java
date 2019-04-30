/*
 Movie modals
 */
package moviePackage;

import java.util.*;

/**
 *
 * @author smeetdeval
 */
public class Movie {

   public static final String PATH = "/Users/smeetdeval/Desktop/PROJECT/MovieTheater-master/MovieTheater 2/images/";
    public int id;
    public String title;
    public String description;
    public String poster;
    public ArrayList<Showtime> showtimes;

    public Movie(int id, String title, String description, String poster) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.poster = poster;
                    System.out.println("const"+this.poster);
                    
                    

    }

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }
    public void setTitle() {
        this.title= title;
    }
    public String getDescription() {
        return this.description;
    }
     public void setDescription() {
        this.description= description;
    }
    
    public String getPoster() {
        return  this.poster;
    }
    public String getPath() {
        
        return (this.PATH +this.poster);
    }
     public void setPoster() {
        this.poster = this.poster;
    }
    
    public ArrayList<Showtime> getShowtimes() {
        return this.showtimes;
    }


    public void setShowtimes(ArrayList<Showtime> showtimes) {
        this.showtimes = showtimes;
    }

}

