/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.Customer;
import Business.Employee.Employee;
import Business.Enterprise.CargoDelivery.CargoCartype;
import Business.Enterprise.CargoDelivery.CargoDelivery;
import Business.Enterprise.PickupService.PickupService;
import Business.Network.Network;
import Business.UserAccount.UserAccount;

/**
 *
 * @author junxiang
 */
public class ConfigureASystem {

    public static EcoSystem configure() {
        EcoSystem system = EcoSystem.getInstance();//The singleton pattern单实例模式 实例化一个class ecosystem
        
        //create user account
        // System manager, belongs to SYSTEM
        Employee sysadminEm = system.getEmployeeDirectory().createEmployee("Nine", "Team", "212212", "TeamNine@demo.com");
        UserAccount uas1 = system.getUserAccountDirectory().createSystemManagerAccount("sysadmin", "sysadmin", sysadminEm);
        
        //create customer, belongs to system
        Customer c1 = system.getCustomers().createCustomer("c1", "c1", "Eileen@husky.neu.edu", "1231231234");
        UserAccount uac1 = system.getUserAccountDirectory().createCustomerAccount("c1", "c1", c1);
        
         //create network
        Network network1 = system.createNetwork("Boston");
        Network network2 = system.createNetwork("New York");
        Network network3 = system.createNetwork("Seattle");
        
        
        //Boston Driver
        Employee driver1 = network1.getEmployeeDirectory().createDriver("Driver1", "Driver1", "21121", "driver@demo.com", network1);       
        UserAccount uad1 = network1.getUserAccountDirectory().createDriverAccount("d1", "d1", driver1);
        
        //Boston CargoDelivery Company List
        
        CargoDelivery cargo1 = network1.createCargoDelivery("Boston Cargo Agency", "1 Pleasant Street, Boston, MA 02125", "(617) 553-5900");
        cargo1.setDescription("This is a Cargo Agency.");//XJ
        CargoCartype cgtype1 =  new CargoCartype("9' cargo van", 10.00, cargo1);
        cargo1.addCgToList(cgtype1);
        
        Employee cargoManager =  cargo1.getEmployeeDirectory().createEmployee("cargo34", "Boss", "12344", "boss@cargo34.com");
        UserAccount uacg1 = cargo1.getUserAccountDirectory().createCargoManagerAccount("cargo1", "cargo1", cargoManager,cargo1);
        
        
        //-------------------------------------------------------------------------
        
        
        //Boston PickupService Company List
        PickupService pickup1 = network1.createPickupService("Boston PickUp Agency", "2 Pleasant Street, Boston, MA 02125", "(617) 123-3232");
       
        Employee pickupManager = pickup1.getEmployeeDirectory().createEmployee("pick34", "Boss", "726444", "boss@pick34.com");
        UserAccount uapk1 = pickup1.getUserAccountDirectory().createPickupManagerAccount("pk1", "pk1", pickupManager);      
                
        return system;
        
       
    }
    
}
