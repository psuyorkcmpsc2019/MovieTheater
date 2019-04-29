/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviePackage;

/**
 *
 * @author smeetdeval
 */
 public class tickets  {
   static int maxSeats = 40;
   static int ticketQuantity = 0;
   int ticketSold;
   
public void ticketsbooked(){
    
   if(ticketSold <= maxSeats) {
       
       ticketSold=+ super.ticketQuantity;
       
       
   }
   else{
       
       System.out.println("Sorry we are booked. You can only buy "+ (maxSeats-ticketSold));
   }
   
}

}
