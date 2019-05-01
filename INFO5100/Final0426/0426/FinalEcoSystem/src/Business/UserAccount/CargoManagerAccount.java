/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;

/**
 *
 * @author junxiang
 */
public class CargoManagerAccount extends UserAccount{
    private Employee cargoManager;

    public CargoManagerAccount(String username, String password, Employee cargoManager) {
        super(username, password);
        this.cargoManager = cargoManager;
    }

    public Employee getCargoManager() {
        return cargoManager;
    }

    public void setCargoManager(Employee cargoManager) {
        this.cargoManager = cargoManager;
    }
    
    
    
}
