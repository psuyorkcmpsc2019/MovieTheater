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
class Showtime {

    private int id;
    private int room;
    private String time;
    private int price;


    public Showtime(int id, int room, String time, int price) {
        this.id = id;
        this.room = room;
        this.time = time;
        this.price = price;     
    }
    public int getID() {
        return this.id;
    }
//getIDgetRoomgetTimegetPrice
    public void setID(int id) {
        this.id = id;
    }
     public int getRoom() {
        return this.room;
    }

    public void getRoom(int room) {
        this.room = room;
    }
     public String getTime() {
        return this.time;
    }

    public void setTime(String time) {
        this.time = time;
    }
    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    

}
