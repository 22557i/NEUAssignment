/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;


import Business.Driver.Driver;
import Business.Enterprise.Enterprise;

/**
 *
 * @author mr.wu
 */
public class Order {

    private String orderID;
    private String orderDate;
    private String orderStatus;
    private Enterprise enterprise;
    private Driver driver;
    private double distance;
    private double totalPrice;
    private String time;
    private String location;
    private String destination;
    public Order(){
        
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    public Order(String orderID, String orderDate, String orderStatus, Driver driver, String time, String location, String destination) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.driver = driver;
        this.time = time;
        this.location = location;
        this.destination = destination;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

   

  
    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

   

    public Order(String orderID, String orderDate, String orderStatus, Enterprise enterprise, Driver driver, double distance, double totalPrice, String time, String location, String destination) {
        this.orderID = orderID;
        this.orderDate = orderDate;
        this.orderStatus = orderStatus;
        this.enterprise = enterprise;
        this.driver = driver;
        this.distance = distance;
        this.totalPrice = totalPrice;
        this.time = time;
        this.location = location;
        this.destination = destination;
    }

}
