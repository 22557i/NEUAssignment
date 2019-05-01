/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;


import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Jun Xiang
 */
public class OrderRequest extends WorkRequest {

    

    private String id;
    private Date   orderDate;
    private String DateString;
    private String time;
    private String location;
    private String destination;
    private double distance;
    private double totalPrice;  
    private String carType;
    private String customerName;
    private String customerPhone;
    private String remark;
    private String deliveryName;
    private String deliveryAddress;
    private String deliveryPhone;
    private StatusEnum status;
    private UserAccount userAccount;
    private Enterprise enterprise;
    // generate order number
    
    private ReviewRequest review;
    public static String genId() {
        String orderId
                = (System.currentTimeMillis() + "").substring(1)
                + (System.nanoTime() + "").substring(7, 10);//用于计算时间差
        return orderId;
    }

    public OrderRequest(Enterprise enterprise, UserAccount account,String location,String destination,double distance,double totalprice,String ct ) {
        super(enterprise, account);
        this.id = genId();
        this.review = new ReviewRequest(enterprise, account);
        this.location = location;
        this.destination = destination;
        this.distance = distance;
        this.totalPrice = totalprice;
        this.status = StatusEnum.valueOf("Processing");
        //SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        this.orderDate = new Date();
         SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
         this.DateString = sdf.format(orderDate);
        this.carType = ct;
        
    }
    public OrderRequest(){
        super(null, null);
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

   

    public void setOrderDate(Date orderDate) {
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

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public UserAccount getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(UserAccount userAccount) {
        this.userAccount = userAccount;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }
    public String getDateString() {
        return DateString;
    }

    public void setDateString(String DateString) {
        this.DateString = DateString;
    }
    @Override
    public String toString()
    {
        return id;
    }
}