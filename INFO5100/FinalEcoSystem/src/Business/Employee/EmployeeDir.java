/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Network.Network;
import java.util.ArrayList;

/**
 *
 * @author junxiang
 */
public class EmployeeDir {
     private ArrayList<Employee> employeeList;

    public EmployeeDir() {
        employeeList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public Employee createEmployee(String firstName, String lastName, String phone, String email) {
        Employee employee = new Employee(firstName, lastName, phone, email);
        employeeList.add(employee);
        return employee;
    }
    
    public Employee createDriver(String firstName, String lastName, String phone, String email, Network network) {
        Employee driver = new Employee(firstName, lastName, phone, email);
        driver.setNetwork(network);
        employeeList.add(driver);
        return driver;
    }
}
