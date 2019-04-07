/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

/**
 *
 * @author mr.wu
 */
public class PersonOrder extends Order{
    private Customer passenger;
    public PersonOrder(Customer customer) {
        super();
        this.passenger = customer;
    }

    public Customer getPassenger() {
        return passenger;
    }

    public void setPassenger(Customer passenger) {
        this.passenger = passenger;
    }
    
    
}
