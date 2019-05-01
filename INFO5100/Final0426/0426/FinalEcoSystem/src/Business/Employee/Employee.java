/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Network.Network;

/**
 *
 * @author junxiang
 */
public class Employee {
     private int id;
    private String firstName;
    private String lastName;    
    private String phone;
    private String email;
    private static int count = 0;
    private String Address;
    
    private Network network;
    
    public Employee(String firstName, String lastName, String phone, String email) {
        this.firstName = firstName;
        this.lastName = lastName;       
        this.phone = phone;
        this.email = email;
        id = count;
        count++;
    }
    
    public Employee(String firstName, String lastName, String phone, String email, Network network) {
        this.firstName = firstName;
        this.lastName = lastName;       
        this.phone = phone;
        this.email = email;
        this.network = network;
        id = count;
        count++;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getId() {
        return id;
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

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }
    
    public String toString(){
        return this.firstName+" "+this.lastName;
    }
    
}
