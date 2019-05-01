/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import java.util.ArrayList;

/**
 *
 * @author junxiang
 */
public class CustomerDir {
    private ArrayList<Customer> customerList;
    
    public CustomerDir() {
        customerList = new ArrayList<>();
    }

    public ArrayList<Customer> getCustomerList() {
        return customerList;
    }
    public Customer createCustomer(String firstName, String lastName, String email, String phone) {
        Customer customer = new Customer(firstName, lastName, email, phone);
        this.customerList.add(customer);
        return customer;
    }
    
}
