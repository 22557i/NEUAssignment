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
public class PickupManagerAccount extends UserAccount{
    private Employee pickupManager;

    public PickupManagerAccount(String username, String password, Employee pickupManager) {
        super(username, password);
        this.pickupManager = pickupManager;
    }

    public Employee getPickupManager() {
        return pickupManager;
    }

    public void setPickupManager(Employee pickupManager) {
        this.pickupManager = pickupManager;
    }
    
    
    
}
