/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Driver;

import Business.Customer.Customer;
import java.util.ArrayList;

/**
 *
 * @author mr.wu
 */
public class DriverDirectory {
    private ArrayList<Driver> DriverDir ;

    public DriverDirectory(ArrayList<Driver> DriverDir) {
        this.DriverDir = DriverDir;
    }

    public DriverDirectory() {
        DriverDir = new ArrayList<>();
    }

    public ArrayList<Driver> getDriverDir() {
        return DriverDir;
    }

    public void setDriverDir(ArrayList<Driver> DriverDir) {
        this.DriverDir = DriverDir;
    }
    
    public void addDriver(String name, String email, String phone){
        Driver driver =  new Driver(name, email, phone); 
        driver.setName(name);
        driver.setEmail(email);
        driver.setPhone(phone);
        DriverDir.add(driver);
    }

    public Driver createDriver(String name, String email, String phone) {
        Driver driver =  new Driver(name, email, phone);        
        this.DriverDir.add(driver);
        return driver;
    }

    
    
}
