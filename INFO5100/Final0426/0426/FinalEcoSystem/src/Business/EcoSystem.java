/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Customer.CustomerDir;
import Business.Employee.EmployeeDir;
import Business.Enterprise.CargoDelivery.CargoCartype;
import Business.Enterprise.CargoDelivery.CargoDelivery;
import Business.Enterprise.Enterprise;
import Business.Enterprise.PickupService.PickupCartype;
import Business.Enterprise.PickupService.PickupService;
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
     private ArrayList<CargoCartype> cargoCartypeList;
    private ArrayList<PickupCartype> pickupServiceList;
    
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
     public void setcargo(CargoDelivery cargoDelivery){
        ArrayList <CargoCartype> al = new ArrayList<>();
        al.add( new CargoCartype("Enconomy for 4 people",4.2, cargoDelivery));
        al.add(new CargoCartype("Extra seats", 20.5, cargoDelivery));
        al.add(new CargoCartype("Luxury",23.2, cargoDelivery));
        this.cargoCartypeList = al;
    }
    public void setpickup(PickupService pickupService){
        ArrayList<PickupCartype> al = new ArrayList<>();
        al.add(new PickupCartype("Next Day Air", 50, pickupService));
        al.add(new PickupCartype("2nd Day Air", 30, pickupService));
        al.add(new PickupCartype("Ground", 0, pickupService));
        this.pickupServiceList =al;
    }

    public static EcoSystem getEcoSystem() {
        return ecoSystem;
    }

    public static void setEcoSystem(EcoSystem ecoSystem) {
        EcoSystem.ecoSystem = ecoSystem;
    }

    public ArrayList<CargoCartype> getCargoCartypeList() {
        return cargoCartypeList;
    }

    public void setCargoCartypeList(ArrayList<CargoCartype> cargoCartypeList) {
        this.cargoCartypeList = cargoCartypeList;
    }

    public ArrayList<PickupCartype> getPickupServiceList() {
        return pickupServiceList;
    }

    public void setPickupServiceList(ArrayList<PickupCartype> pickupServiceList) {
        this.pickupServiceList = pickupServiceList;
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
