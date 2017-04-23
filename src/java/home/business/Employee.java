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
   @Column(name="EmployeeID", nullable = false)
   @GeneratedValue(strategy = GenerationType.AUTO)
   private long employeeId;
   
   @Column(name = "FirstName", nullable = false)
   private String firstName;
   
   @Column(name = "LastName", nullable = false)
   private String lastName;
   
   @Column(name = "Title", nullable = false)
   private String jobTitle;
   
   @Column(name = "Street", nullable = false)
   private String street;
   
   @Column(name = "City", nullable = false)
   private String city;
   
   @Column(name = "St", nullable = false)
   private String st;
   
   @Column(name = "Zip", nullable = false)
   private String zip;
   
   @Column(name = "PayRate", nullable = false)
   private double payRate;
   
   @Column(name = "Phone", nullable = false)
   private String phone;
   
   @Column(name = "Email", nullable = false)
   private String email;
   
   @Column(name = "OfficeID", nullable = false)
   private long officeId;
   
   @Column(name = "JobID", nullable = false)
   private long jobId;
   
   @Column(name = "BeginDate", nullable = false)
   private String beginDate;
   
   @Column(name = "EndDate", nullable = false)
   private String endDate;
   
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
   
   public String getStreet() {
       return street;
   }
   
   public void setStreet(String street) {
       this.street = street;
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
   public long getOfficeId() {
       return officeId;
   }
   
   public void setOfficeId(long officeId) {
       this.officeId = officeId;
   }
   public long getJobId() {
       return jobId;
   }
   
   public void setJobId(long jobId) {
       this.jobId = jobId;
   }
   
   public String getBeginDate() {
       return beginDate;
   }
   
   public void setEndDate(String endDate) {
       this.endDate = endDate;
   }
   
  
}
