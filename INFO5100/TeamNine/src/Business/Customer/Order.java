/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;

import Business.Agency.Agency;
import Business.Driver.Driver;

/**
 *
 * @author mr.wu
 */
public class Order {

    private String orderID;
    private String orderDateString;
    private String orderStatusString;
    private Agency agency;
    private Driver driver;
    private double distance;
    private double totalPrice;
    private String appointTime;
    private String startingLocation;
    private String destinationLocation;
    public Order(){
        
    }
    public Order(String orderID, String orderDateString, String orderStatusString, Driver driver, String appointTime, String startingLocation, String destinationLocation) {
        this.orderID = orderID;
        this.orderDateString = orderDateString;
        this.orderStatusString = orderStatusString;
        this.driver = driver;
        this.appointTime = appointTime;
        this.startingLocation = startingLocation;
        this.destinationLocation = destinationLocation;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getOrderDateString() {
        return orderDateString;
    }

    public void setOrderDateString(String orderDateString) {
        this.orderDateString = orderDateString;
    }

    public String getOrderStatusString() {
        return orderStatusString;
    }

    public void setOrderStatusString(String orderStatusString) {
        this.orderStatusString = orderStatusString;
    }

    public Agency getAgency() {
        return agency;
    }

    public void setAgency(Agency agency) {
        this.agency = agency;
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

    public String getAppointTime() {
        return appointTime;
    }

    public void setAppointTime(String appointTime) {
        this.appointTime = appointTime;
    }

    public String getStartingLocation() {
        return startingLocation;
    }

    public void setStartingLocation(String startingLocation) {
        this.startingLocation = startingLocation;
    }

    public String getDestinationLocation() {
        return destinationLocation;
    }

    public void setDestinationLocation(String destinationLocation) {
        this.destinationLocation = destinationLocation;
    }

    public Order(String orderID, String orderDateString, String orderStatusString, Agency agency, Driver driver, double distance, double totalPrice, String appointTime, String startingLocation, String destinationLocation) {
        this.orderID = orderID;
        this.orderDateString = orderDateString;
        this.orderStatusString = orderStatusString;
        this.agency = agency;
        this.driver = driver;
        this.distance = distance;
        this.totalPrice = totalPrice;
        this.appointTime = appointTime;
        this.startingLocation = startingLocation;
        this.destinationLocation = destinationLocation;
    }

}
