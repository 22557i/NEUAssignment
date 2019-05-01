/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Customer.Customer;
import Business.Employee.Employee;

import java.util.ArrayList;

/**
 *
 * @author junxiang
 */
public class UserAccountDir {
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDir() {
        this.userAccountList = new ArrayList<>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList) {
        this.userAccountList = userAccountList;
    }
    
    //Method to check whether username and psw are right or not
    public UserAccount authenticateUser(String username, String password) {
        UserAccount account = null;
        for (UserAccount ua : userAccountList) {
            if (ua.getUsername().equalsIgnoreCase(username) && ua.getPassword().equals(password)) {
                account = ua;
            }
        }
        return account;
    }
    
//create customer account
    public CustomerAccount createCustomerAccount(String username, String password, Customer customer) {
        CustomerAccount ua = new CustomerAccount(username, password, customer);
        userAccountList.add(ua);
        return ua;
    }
  
    
//create employee account
    public EmployeeAccount createEmployeeAccount(String username, String password, Employee em) {
        EmployeeAccount ua = new EmployeeAccount(username, password, em);
        userAccountList.add(ua);
        return ua;
    }    
    
//create System Manager Account
    public SystemManagerAccount createSystemManagerAccount(String username, String password, Employee systemManager) {
        SystemManagerAccount sma = new SystemManagerAccount(username, password, systemManager);
        userAccountList.add(sma);
        return sma;
    }
    
//create driver account
    public DriverAccount createDriverAccount(String username, String password, Employee driver) {
        DriverAccount da = new DriverAccount(username, password, driver);
        userAccountList.add(da);
        return da;
    }
    
//create CargoDelivery Manager Account
   public CargoManagerAccount createCargoManagerAccount(String username, String password, Employee cargoManager) {
        CargoManagerAccount da = new CargoManagerAccount(username, password, cargoManager);
        userAccountList.add(da);
        return da;
    }

    public UserAccount createPickupManagerAccount(String username, String password, Employee pickupManager) {
        PickupManagerAccount da = new PickupManagerAccount(username, password, pickupManager);
        userAccountList.add(da);
        return da;
    }
    
    
    
}
