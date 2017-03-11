/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.business;

/**
 *
 * @author Elliot Martinez
 * Changelog - 3/11/17: Added Employee Business Class 
 */

import java.io.Serializable;
import java.text.NumberFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Employee implements Serializable {
    
   @Id // primary key
   @Column(name="EMPLOYEEID", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long employeeId;
   
   @Column(name = "FIRSTNAME", nullable = false)
   private String firstName;
   
   @Column(name = "LASTNAME", nullable = false)
   private String lastName;
   
   @Column(name = "JOBTITLE", nullable = false)
   private String jobTitle;
   
   @Column(name = "ADDRESS", nullable = false)
   private String address;
   
   @Column(name = "CITY", nullable = false)
   private String city;
   
   @Column(name = "ST", nullable = false)
   private String st;
   
   @Column(name = "ZIP", nullable = false)
   private String zip;
   
   @Column(name = "PAYRATE", nullable = false)
   private double payRate;
   
   @Column(name = "HIREDATE", nullable = false)
   private Date hireDate;
   
   // Getters and Setters
   
   public long getEmployeeId() {
    return employeeId;
   }
   
   public void setEmployeeId(long employeeId) {
       this.employeeId = employeeId;
   }
   
   public String getFirstName() {
       return firstName;
   }
   
   public void setFirstName(String firstName) {
       this.firstName = firstName;
   }
   
   public String getLastName() {
       return lastName;
   }
   
   public void setJobTitle(String jobTitle) {
       this.jobTitle = jobTitle;
   }
   
   public String getJobTitle(){
       return jobTitle;
   }
   
   public String getAddress() {
       return address;
   }
   
   public void setAddress(String address) {
       this.address = address;
   }
   
   public String getState() {
       return st;
   }
   
   public void setState() {
       this.st = st;
   }
   
   public String getCity() {
       return city;
   }
   
   public void setCity(String city) {
       this.city = city;
   }
   
   public String getZip() {
       return zip;
   }
   
   public void setZip(String zip) {
       this.zip = zip;
   }
   
   public double getPayRate() {
       return payRate;
   }
   
   public void setPayRate(double payRate) {
       this.payRate = payRate;
   }
   
   public Date getHireDate() {
       return hireDate;
   }
   
   public void setHireDate(Date hireDate) {
       this.hireDate = hireDate;
   }
   
  
}
