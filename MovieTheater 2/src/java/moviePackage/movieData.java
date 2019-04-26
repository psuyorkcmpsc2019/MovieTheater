/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviePackage;

/**
 *
 * @author angeljoelperez
 */
public class movieData {
    
   private   String locationOne,locationTwo,FirstName,LastName,MovieTitle,MovieDescription,time,price,date;
   private   String ticketQuantity;
   private    byte[] image;
   
    movieData(){
       locationOne = "";
       FirstName=" ";
       LastName=" ";
       MovieTitle=" ";
       MovieDescription=" ";
       ticketQuantity="";
       time="";
       date = "";
       
}
    public movieData(String frstnm, String lstNm, String tcktq) {
        FirstName = frstnm ;
        LastName = lstNm;
        ticketQuantity = tcktq;
        
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String frstnm) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lstnme) {
        this.LastName = LastName;
    }


    public byte[] getImage() {
        return image;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }




    public String getMovieDescription() {
        return MovieDescription;
    }

    public void setMovieDescription(String MovieDescription) {
        this.MovieDescription = MovieDescription;
    }


    public String getTitle() {
        return MovieTitle;
    }

    public void setTitle(String MovieTitle) {
        this.MovieTitle = MovieTitle;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    
    public void setticketQuantity(double tcktq) {
        this.ticketQuantity = ticketQuantity;
    }

    public String getticketQuantity() {
        return ticketQuantity;
    }
    public void setmovieLocation(String locationName)
    {
        this.locationOne = locationName;
    }
    public String returnmovieLocation()
    {
        return locationOne;
    }
    
      public static void main(String[] args) {
        // TODO Auto-generated method stub

    }
    
    
    
    
    
    
    
    
    
}
