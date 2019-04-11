/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Customer.Order;
import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author ranranhe
 */
public class OrderRequest extends WorkRequest {

    private String orderID;
    private Date orderDate;
    private StatusEnum status;
    private String time;
    private String location;
    private String destination;
    private String distance;
    
    private String customerName;
    private String customerPhone;
    private String remark;
    
  
    
    
    private ReviewRequest review;

    // generate order number
    public static String genId() {
        String orderId
                = (System.currentTimeMillis() + "").substring(1)
                + (System.nanoTime() + "").substring(7, 10);
        return orderId;
    }

    public OrderRequest(Enterprise enterprise, UserAccount account, ArrayList<Order> dashes) {
        super(enterprise, account);
       
        this.review = null;
    }

    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
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

    public String getDistance() {
        return distance;
    }

    public void setDistance(String distance) {
        this.distance = distance;
    }

    
    
    
    
    
    
    
    
    
    
    
    public enum ReviewStatus {

        NA("N/A"),
        reviewed("Reviewed"),
        not("Not Reviewed");

        private String value;

        private ReviewStatus(String value) {
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

    
   

    public boolean isReviewed() {
        if (this.review == null) {
            return false;
        } else {
            if (this.review.getRate() == -1) {
                return false;
            }
        }
        return true;
    }

    public void setReview(ReviewRequest review) {
        this.review = review;
    }

    public ReviewRequest getReview() {
        return this.review;
    }

    public boolean eligableToBeReviewed() {
        if (this.review != null) {
            if (this.review.getRate() == -1) {
                return true;
            }
        }
        return false;
    }
    
    public ReviewStatus getReviewStatus() {
        if(eligableToBeReviewed()) {
            return ReviewStatus.not;
        }
        if (isReviewed()) {
            return ReviewStatus.reviewed;
        } else {
            return ReviewStatus.NA;
        }
    }
}
