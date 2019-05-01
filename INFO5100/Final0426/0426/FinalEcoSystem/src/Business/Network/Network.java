/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.AbstractAPI;
import Business.Employee.EmployeeDir;
import Business.Enterprise.CargoDelivery.CargoDelivery;
import Business.Enterprise.EnterpriseDir;
import Business.Enterprise.PickupService.PickupService;
import Business.UserAccount.UserAccountDir;

/**
 *
 * @author junxiang
 */
public class Network extends AbstractAPI{
    private String id;
    private String city;     
    private EnterpriseDir enterpriseDir;
    private EmployeeDir employeeDir;
    private UserAccountDir userAccounts;
    
    private static int counter = 0;
    
    
    
    public Network(String city) {
        enterpriseDir = new EnterpriseDir();
        this.city = city;
        this.id = "Network" + counter;
        counter++;
        this.employeeDir = new EmployeeDir();
        this.userAccounts = new UserAccountDir();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public EnterpriseDir getEnterpriseDir() {
        return enterpriseDir;
    }

    @Override
    public UserAccountDir getUserAccountDirectory() {
         return userAccounts;
    }
    
    @Override
    public EmployeeDir getEmployeeDirectory() {
        return employeeDir;
    }

    public CargoDelivery createCargoDelivery(String companyName, String address, String phone) {
        CargoDelivery cargo = new CargoDelivery(companyName, address, phone);
        this.enterpriseDir.getEnterpriseList().add(cargo);
        return cargo;
    }
    
    public PickupService createPickupService(String companyName, String address, String phone) {
        PickupService pickup = new PickupService(companyName, address, phone);
        this.enterpriseDir.getEnterpriseList().add(pickup);
        return pickup;
    }  
    @Override
    public String toString(){
        return city;
    }
}
