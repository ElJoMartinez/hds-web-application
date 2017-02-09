
package home.business;

/**
 *
 * @author toillezenitram
 * changelog: 2/8/2017
 *            added initial skeleton
 */

import java.io.Serializable;
import java.text.NumberFormat;
import javax.persistence.*;

public class Product implements Serializable {
    
    @Id // primary key
    @Column(name = "MODELID", nullable = false)
    private String modelId;
    
    @Column(name = "SERIALID", nullable = false)
    private String serialId;
    
    @Column(name = "BRAND", nullable = false)
    private String brand;
    
    @Column(name = "DESCRIPTION", nullable = false)
    private String description; 
    
    @Column(name = "COST", nullable = false)
    private double cost;
    
    @Column(name = "LISTPRICE", nullable = false)
    private double listPrice;
    
    public String getModelId() {
        return modelId;
    }
    
    public void setModelId(String modelId) {
        this.modelId = modelId;
    }
    
    public String getSerialId() {
        return serialId;
    }
    
    public void setSerialId(String serialId) {
        this.serialId = serialId;
    }
    
    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public double getCost() {
        return cost;
    }
    
    public void setCost(double cost) {
        this.cost = cost;
    }
    
    public double getListPrice() {
        return listPrice;
    }
    
    public void setListPrice(double listPrice) {
        this.listPrice = listPrice;
    }
    
    public String getListPriceCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(listPrice);
    }
    public String getCostCurrencyFormat() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(cost);
    }
}
