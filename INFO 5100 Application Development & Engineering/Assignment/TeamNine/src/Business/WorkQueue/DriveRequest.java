package Business.WorkQueue;


import Business.Driver.Driver;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderRequest;
import Business.WorkQueue.WorkRequest;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hui Huang
 */
public class DriveRequest extends WorkRequest{
    private StatusEnum status;
    private OrderRequest orderRequest;
    private Date acceptTime;
    private Date atWorkTime;
    private Date finishedTime;
    private Driver driver;
    
    public DriveRequest(Enterprise enterprise, UserAccount account, OrderRequest orderRequest, Driver driver) {
        super(enterprise, account);
        this.orderRequest = orderRequest;
        this.driver = driver;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
    
    

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Date getAcceptTime() {
        return acceptTime;
    }

    public void setAcceptTime(Date acceptTime) {
        this.acceptTime = acceptTime;
    }

    public Date getAtWorkTime() {
        return atWorkTime;
    }

    public void setAtWorkTime(Date atWorkTime) {
        this.atWorkTime = atWorkTime;
    }

    public Date getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Date finishedTime) {
        this.finishedTime = finishedTime;
    }

    public OrderRequest getOrderRequest() {
        return orderRequest;
    }
    
    public String getOrderID() {
        return this.orderRequest.getId();
    }
    
    
    @Override
    public String toString() {
        return this.orderRequest.getRequestDate();
    }

   
    
}
