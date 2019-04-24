/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.Enterprise.CargoDelivery.CargoDelivery;
import Business.Enterprise.Enterprise;

/**
 *
 * @author junxiang
 */
public class CargoManagerAccount extends UserAccount{
    private Employee cargoManager;
    private CargoDelivery enterprise;
    public CargoManagerAccount(String username, String password, Employee cargoManager,CargoDelivery enterprise) {
        super(username, password);
        this.cargoManager = cargoManager;
        this.enterprise = enterprise;
    }

    public CargoDelivery getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(CargoDelivery enterprise) {
        this.enterprise = enterprise;
    }

    public Employee getCargoManager() {
        return cargoManager;
    }

    public void setCargoManager(Employee cargoManager) {
        this.cargoManager = cargoManager;
    }
    
    
    
}
