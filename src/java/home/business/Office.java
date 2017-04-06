
package home.business;

/**
 *
 * @author Elliot Martinez
 * Changelog: 4/6/2017: Adding Office class for database
 */

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Office implements Serializable{
    
    @Id //primary key
    @Column(name="OfficeId", nullable=false)
    private long officeId;
    
    @Column(name="street", nullable=false)
    private String street;
    
    @Column(name="city", nullable=false)
    private String city;
    
    // making use of variable st instead of state
    // avoids conflict with the SQL keyword
    // state: st = state!
    @Column(name="state", nullable=false)
    private String st;
    
    @Column(name="zip", nullable=false)
    private String zip;
    
    
    // Getters and Setters
    public long getOfficeId() {
        return officeId;
    }
    
    public void setOfficeId(long officeId) {
        this.officeId = officeId;
    }
    
    public String getStreet() {
        return street;
    }
    
    public void setStreet(String street) {
        this.street = street;
    }
    
    public String getCity() {
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
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
