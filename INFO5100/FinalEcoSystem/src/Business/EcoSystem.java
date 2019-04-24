/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDir;
import Business.Employee.EmployeeDir;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDir;
import java.util.ArrayList;

/**
 *
 * @author junxiang
 */
public class EcoSystem  {
    private static EcoSystem ecoSystem;
    private ArrayList<Network> networkList;
    private CustomerDir customers;
    private UserAccountDir userAccounts;
    private EmployeeDir employees;
    
    public static EcoSystem getInstance() {
        if (ecoSystem == null) {
            ecoSystem = new EcoSystem();
        }
        return ecoSystem;
    }
    
    public EcoSystem() {
        this.networkList = new ArrayList<>();
        this.customers = new CustomerDir();
        this.userAccounts = new UserAccountDir();
        this.employees = new EmployeeDir();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public CustomerDir getCustomers() {
        return customers;
    }

    public void setCustomers(CustomerDir customers) {
        this.customers = customers;
    }
    
    public Network createNetwork(String city) {
        Network network = new Network(city);
        this.networkList.add(network);
        return network;
    }

  
    public UserAccountDir getUserAccountDirectory() {
         return userAccounts;
    }

   
    public EmployeeDir getEmployeeDirectory() {
        return employees;
    }
    public Network getNetworkByCity(String city) {
        for (Network net : this.networkList) {
            if (net.getCity().equals(city)) {
                return net;
            }
        }
        return null;
    }
    public boolean isUserNameAvaliable(String username) {
       for(UserAccount usa:userAccounts.getUserAccountList()){
           if(usa.getUsername().equalsIgnoreCase(username))return false;   
        }
           return true;
   }
}
