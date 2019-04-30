/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviePackage;

import java.util.ArrayList;

/**
 *
 * @author smeetdeval
 */
public class Room {
    
    private int id;
    private int number;
    private int capacity;
    private ArrayList<Room> room;
        
    public Room(int id, int number, int capacity) {
        this.id = id;
        this.number = number;
        this.capacity = capacity;
        
    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getNumber() {
        return this.number;
    }
    public void setNumber(int number) {
        this.number = number;
    }public int getCapacity() {
        return this.capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    
}
