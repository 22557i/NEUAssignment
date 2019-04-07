/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;
import java.util.*;
/**
 *
 * @author mr.wu
 */
public class OrderDirectory {
   private ArrayList<Order> orderList ;

    public OrderDirectory() {
        this.orderList = new ArrayList<>();
    }
    public ArrayList<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(ArrayList<Order> orderList) {
        this.orderList = orderList;
    } 
}
