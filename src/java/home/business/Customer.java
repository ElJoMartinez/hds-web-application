
package home.business;

/**
 *
 * @author Elliot Martinez
 * description: Entity class for the 
 * database table: Customer*
 */

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class Customer implements Serializable{
    
    @Id //primary key
    @Column(name = "CustomerId", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long customerId;
    
    @Column(name = "LastName", nullable = false)
    private String lastName;
    
    @Column(name = "FirstName", nullable = false)
    private String firstName;
    
    @Column(name = "MI", nullable = false)
    private String mI;
    
    @Column(name = "Phone", nullable = false)
    private String phone;
    
    @Column(name = "Email", nullable = false)
    private String email;
    
    @Column(name = "Street", nullable = false)
    private String street;
    
    @Column(name = "City", nullable = false)
    private String city;
    
    @Column(name = "St", nullable = false)
    private String st;
    
    @Column(name = "Zip", nullable = false)
    private String zip;
    
    public long getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getMI() {
        return mI;
    }
    
    public void setMI(String mI) {
        this.mI = mI;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getSt() {
        return st;
    }
    
    public void setSt(String st) {
        this.st = st;
    }
    
    public String getZip() {
        return zip;
    }
    
    public void setZip(String zip) {
        this.zip = zip;
    }
}
