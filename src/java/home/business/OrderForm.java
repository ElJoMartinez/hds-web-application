/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home.business;

/**
 *
 * @author toillezenitram
 */
import java.util.*;
import java.io.Serializable;

public class OrderForm implements Serializable {

    private List<LineItem> items;

    public OrderForm() {
        items = new ArrayList<>();
    }

    public void setItems(List<LineItem> lineItems) {
        items = lineItems;
    }

    public List<LineItem> getItems() {
        return items;
    }

    public int getCount() {
        return items.size();
    }

    public void addItem(LineItem item) {
        //If the item already exists in the cart, only the quantity is changed.
        String code = item.getProduct().getSerialId();
        int quantity = item.getQuantity();
        for (int i = 0; i < items.size(); i++) {
            LineItem lineItem = items.get(i);
            if (lineItem.getProduct().getSerialId().equals(code)) {
                lineItem.setQuantity(quantity);
                return;
            }
        }
        items.add(item);
    }

    public void removeItem(LineItem item) {
        String code = item.getProduct().getSerialId();
        for (int i = 0; i < items.size(); i++) {
            LineItem lineItem = items.get(i);
            if (lineItem.getProduct().getSerialId().equals(code)) {
                items.remove(i);
                return;
            }
        }
    }
}
