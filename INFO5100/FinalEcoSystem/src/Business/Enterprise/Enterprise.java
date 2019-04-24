/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.AbstractAPI;
import Business.Employee.EmployeeDir;
import Business.Enterprise.CargoDelivery.CargoCartype;
import Business.UserAccount.UserAccountDir;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;
import javax.swing.Action;

/**
 *
 * @author junxiang
 */
public class Enterprise extends AbstractAPI{
     private String companyName;
     private String address;
     private String phone;
     private UserAccountDir userAccounts;
     private EmployeeDir employeeDir;
     private String Description;
     private WorkQueue workQueue;
     private ArrayList<CargoCartype> itemsDirectory;
    
    public Enterprise(String companyName, String address, String phone ) {
        this.companyName = companyName;
        this.address = address;
        this.phone = phone;
        this.userAccounts = new UserAccountDir();
        this.employeeDir = new EmployeeDir();
        this.workQueue = new WorkQueue();
        this.itemsDirectory = new ArrayList<>();
    }
     
    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ArrayList<CargoCartype> getItemsDirectory() {
        return itemsDirectory;
    }

    public void setItemsDirectory(ArrayList<CargoCartype> itemsDirectory) {
        this.itemsDirectory = itemsDirectory;
    }

    public UserAccountDir getUserAccounts() {
        return userAccounts;
    }

    public void setUserAccounts(UserAccountDir userAccounts) {
        this.userAccounts = userAccounts;
    }
            
    public EmployeeDir getEmployeeDir() {
        return employeeDir;
    }
    
    public void setEmployeeDir(EmployeeDir employeeDir) {
        this.employeeDir = employeeDir;
    }
    
    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
     
    public void addCgToList(CargoCartype dash) {
        this.itemsDirectory.add(dash);
   
    }
    
    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public UserAccountDir getUserAccountDirectory() {
        return userAccounts;
    }

    @Override
    public EmployeeDir getEmployeeDirectory() {
        return employeeDir;
    }
    @Override
    public String toString(){
        return companyName;
    }    
}
