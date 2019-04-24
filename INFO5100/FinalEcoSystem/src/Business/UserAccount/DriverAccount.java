/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Employee.Employee;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author junxiang
 */
public class DriverAccount extends UserAccount {
    
    private Employee driver;
    private WorkQueue workQueue;
    public DriverAccount(String username, String password, Employee driver) {
        super(username, password);
        this.driver = driver;
        workQueue = new WorkQueue();
    }
     
    public Employee getDriver() {
        return driver;
    }
    
    public void setDriver(Employee driver) {
        this.driver = driver;
    } 

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
}
