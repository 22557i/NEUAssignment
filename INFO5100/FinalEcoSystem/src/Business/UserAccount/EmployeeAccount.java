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
public class EmployeeAccount extends UserAccount{
    
    private Employee employee;
    private WorkQueue workQueue;

    EmployeeAccount(String username, String password, Employee em) {
        super(username, password);
        this.employee = em;
        workQueue = new WorkQueue();
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    
    
}
