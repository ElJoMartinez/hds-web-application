/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.business;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author toillezenitram
 */
@Entity
public class SalesRecord implements Serializable {
    @Id //primary key
    @Column(name = "SaleID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long saleId;
    
    @Column(name = "SaleDate", nullable = false)
    private String saleDate;
    
    @Column(name = "ProductID", nullable = false)
    private long productId;
    
    @Column(name = "CustomerID", nullable = false)
    private long customerId;
    
    @Column(name = "Quantity", nullable = false)
    private int quantity;
    
    @Column(name = "TotalCost", nullable = false)
    private double totalCost;
    
    public long getSaleId() {
        return saleId;
    }
    
    public void setSaleId(long saleId) {
        this.saleId = saleId;
    }
    
    public String getSaleDate() {
        return saleDate;
    }
    
    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }
    
    public long getProductId() {
        return productId;
    }
    
    public void setProductId(long productId) {
        this.productId = productId;
    }
    public long getCustomerId() {
        return customerId;
    }
    
    public void setCustomerId(long customerId) {
        this.customerId = customerId;
    }
    
    public int getQuantity() {
        return quantity;
    }
    
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    public double getTotalCost() {
        return totalCost;
    }
    
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
    
}
