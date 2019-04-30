/*
Customers modals
 */
package moviePackage;

/**
 *
 * @author smeetdeval
 */
public class Customers {
    
    

    private int id;
    private String firstName;
    private String lastName;
    private String phone;

    public Customers( String firstName, String lastName, String phone) {
        //this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
    }

    public int getID() {
        return this.id;
    }

    public void setID(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
     public String getPhone() {
        return this.firstName;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    
    
    
}


    
