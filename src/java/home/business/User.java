// Author: Elliot Martinez
// File: User.java
// Create Date: Monday, January 23, 2017
package home.business;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String street;
    private String city;
    private String st;
    private String zip;

    public User() {
        firstName = "";
        lastName = "";
        email = "";
        street = "";
        city = "";
        st = "";
        zip = "";
    }
    
    public Long getId() {
        return userId;
    }

    public void setId(Long userId) {
        this.userId = userId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }
    public String getEmail() {
        return email;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    // State is a reserved SQL word, so the field is called "st" instead.
    public void setState(String state) {
        st = state;
    }

    public String getState() {
        return st;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getZip() {
        return zip;
    }

}