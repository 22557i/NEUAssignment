/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Driver.Driver;
import Business.Role.Role;

/**
 *
 * @author Hui Huang
 */
public class DriverAccount extends UserAccount{
    private Driver driver;

    public DriverAccount(String username, String password, Role role, Driver driver) {
        super(username, password, role);
        this.driver = driver;
        this.setRole(new Business.Role.Driver());
    }
    
    public Driver getDriver() {
        return this.driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    
    
}
