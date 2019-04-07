/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Agency;

import Business.Customer.GoodsOrder;
import Business.Customer.Order;
import Business.Customer.PersonOrder;
import Business.Driver.Driver;
import Business.Employee.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author mr.wu
 */
public class Agency {
    private List<Driver> DriverList;
    private String agencyName;
    private List<Employee> employeeList;
    private List orderList;
    private boolean wayofdelivery;
    
    public Agency(String agencyName, boolean choice){
        this.DriverList = new ArrayList<>();
        this.employeeList = new ArrayList<>();
        this.agencyName = agencyName;
        if(choice==true){
            this.orderList = new ArrayList<PersonOrder>();
        }else{
            this.orderList = new ArrayList<GoodsOrder>();
        }
    }
    
}
