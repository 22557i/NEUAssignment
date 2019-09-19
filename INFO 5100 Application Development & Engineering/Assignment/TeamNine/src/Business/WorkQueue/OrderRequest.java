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

/**
 *
 * @author ranranhe
 */
public class OrderRequest extends WorkRequest {

    private String id;
    private StatusEnum status;
    private String deliveryName;
    private String deliveryAddress;
    private String deliveryPhone;
    private double amount;
    private ArrayList<Order> dashes;
    private ReviewRequest review;
    private String customerName;
    private String customerPhone;
    private String remark;
    
    

    // generate order number
    public static String genId() {
        String orderId
                = (System.currentTimeMillis() + "").substring(1)
                + (System.nanoTime() + "").substring(7, 10);
        return orderId;
    }

    public OrderRequest(Enterprise enterprise, UserAccount account, ArrayList<Order> dashes) {
        super(enterprise, account);
        this.dashes = dashes;
        this.id = genId();
        this.review = null;
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

    public String getId() {
        return this.id;
    }

    public String getDeliveryName() {
        return this.deliveryName;
    }

    public void setDeliveryName(String name) {
        this.deliveryName = name;
    }

    public String getDeliveryAddress() {
        return this.deliveryAddress;
    }

    public void setDeliveryAddress(String address) {
        this.deliveryAddress = address;
    }

    public String getDeliveryPhone() {
        return this.deliveryPhone;
    }

    public void setDeliveryPhone(String phone) {
        this.deliveryPhone = phone;
    }

    public ArrayList<Order> getItems() {
        return this.dashes;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return this.amount;
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
