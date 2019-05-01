/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author raunak
 */
public abstract class WorkRequest {

    private String message;//panel里怎么用？？
    //following attributes as message sending to next role
    private String orderDate;
    private String time;
    private String location;//From
    private String destination;//To
    private double distance;
    
    private Enterprise enterprise;
    private UserAccount account;
    private Date requestDate;
    private Date resolveDate;
    
   

    public enum StatusEnum {

        Processing("Processing"),
        Ready("Ready for pickup"),//not accept
        WaitForPickup("Waiting for pickup"),// has accepted and wait 
        OnTheWay("On the way"),
        Cancelled("Cancelled"),
        
        //没用
        Accepted("Accepted"),
        AtWork("AtWork"),
        Finished("Finished"),
        
        Completed("Completed");
        

        private String value;

        private StatusEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public WorkRequest(Enterprise enterprise, UserAccount account) {
        this.account = account;
        this.enterprise = enterprise;
        this.requestDate = new Date();
        this.message = "This is only Message";
    }
//没用
    public String getMessage() {
        return this.message;
    }
//没用
    public void setMessage(String mess) {
        this.message = mess;
    }

    public Enterprise getEnterprise() {
        return this.enterprise;
    }

    public void setEnterprise(Enterprise en) {
        this.enterprise = en;
    }

    public UserAccount getAccount() {
        return account;
    }

    public void setAccount(UserAccount account) {
        this.account = account;
    }

    public String getRequestDate() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = format.format(this.requestDate);
        return dateString;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
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

  
    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return this.getRequestDate();
    }
}
