/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Driver;

/**
 *
 * @author mr.wu
 */
public class Driver {
    private String Name;
    private int Age;
    private DriverLicense driverLicense;
    private Car vehicle;
    
    public Driver(){
        
    }
    
    public Driver(String Name, int Age, DriverLicense driverLicense, Car vehicle) {
        this.Name = Name;
        this.Age = Age;
        this.driverLicense = driverLicense;
        this.vehicle = vehicle;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
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
