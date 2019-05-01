/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Customer.Customer;
import Business.WorkQueue.OrderRequest;
import java.util.ArrayList;
import java.util.LinkedList;


/**
 *
 * @author junxiang
 */
public class CustomerAccount extends UserAccount {
    
     private Customer customer;
    private ArrayList<OrderRequest> orderDirectory;
    public LinkedList<OrderRequest>finishedOrder;
    
    public CustomerAccount(String username, String password, Customer customer) {
        super(username, password);
        this.customer = customer;
        this.orderDirectory = new ArrayList<>();
        this.finishedOrder = new LinkedList<>();
        this.finishedOrder.add(new OrderRequest());
    }

    public LinkedList<OrderRequest> getFinishedOrder() {
        return finishedOrder;
    }

    public void setFinishedOrder(LinkedList<OrderRequest> finishedOrder) {
        this.finishedOrder = finishedOrder;
    }

    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<OrderRequest> getOrderDirectory() {
        return orderDirectory;
    }

    public void setOrderDirectory(ArrayList<OrderRequest> orderDirectory) {
        this.orderDirectory = orderDirectory;
    }
   
    
}
