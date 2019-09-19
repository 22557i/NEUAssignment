/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Driver;

import Business.WorkQueue.DriveRequest;
import java.awt.List;

/**
 *
 * @author mr.wu
 */
public class Driver {
    private String username;
    private String name;
    private String address;
    private String phone;
    private String email;
    private DriverLicense driverLicense;
    private Car vehicle;
    
    
   
    public Driver(){
        
    }
    public Driver(String name, String phone, String email){
        this.name = name;
        this.phone = phone;
        this.email = email;
        
    }
    
    public Driver(String username, String name, String phone, String email) {
        this.username = username;
        this.name = name;
      
        this.phone = phone;
        this.email = email;
        
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    

    public DriverLicense getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(DriverLicense driverLicense) {
        this.driverLicense = driverLicense;
    }

    public Car getVehicle() {
        return vehicle;
    }

    public void setVehicle(Car vehicle) {
        this.vehicle = vehicle;
    }

   
    
    
}
