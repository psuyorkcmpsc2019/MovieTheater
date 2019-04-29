/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviePackage;

import java.util.List;

/**
 *
 * @author smeetdeval
 */
public class NewClass  {
    
    public static void main (String args []){
        int id = 1;
        DataBaseIO dbio = new DataBaseIO();
        /*
        dbio.getMovieById(id);
        List<Movie> movie = dbio.getMovieById(id);
        */
       List<Movie> movies = dbio.getAllMovies();
        System.out.println(movies.size());
        Movie m;
        for(int i = 0; i < movies.size(); i++) {
            m = movies.get(i);
            System.out.println(m.getId());
            System.out.println(m.getTitle());
            System.out.println(m.getDescription());
            System.out.println(m.getPoster());
        }
    }
    
    
}
