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
public class SystemManagerAccount extends UserAccount {
    private Employee systemManager;

    public SystemManagerAccount(String username, String password, Employee systemManager) {
        super(username, password);
        this.systemManager = systemManager;
      
    }

    public Employee getSystemManager() {
        return systemManager;
    }

    public void setSystemManager(Employee systemManager) {
        this.systemManager = systemManager;
    }
    
    
    
}
