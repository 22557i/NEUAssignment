/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.PickupService;

import Business.Enterprise.Enterprise;
import Business.WorkQueue.OrderRequest;
import java.util.LinkedList;

/**
 *
 * @author junxiang
 */
public class PickupService extends Enterprise{
    private String id;
    private static int counter = 0;
    private String description;//XJ
    public LinkedList<OrderRequest>orderList;
    public OrderRequest processingOrderRequest;
    public LinkedList<OrderRequest> finishedOrder;

    public LinkedList<OrderRequest> getFinishedOrder() {
        return finishedOrder;
    }

    public void setFinishedOrder(LinkedList<OrderRequest> finishedOrder) {
        this.finishedOrder = finishedOrder;
    }
    public PickupService(String companyName, String address, String phone) {
        super(companyName, address, phone);
        this.id = "PickupService" + counter;
        counter++;
        this.orderList = new LinkedList<>();
    }
    
    public String getDescription() {//XJ
        return description;
    }
     
     public void setDescription(String description) {//XJ
        this.description = description;
    }

    public LinkedList<OrderRequest> getOrderList() {
        return orderList;
    }

    public void setOrderList(LinkedList<OrderRequest> orderList) {
        this.orderList = orderList;
    }

    public OrderRequest getProcessingOrderRequest() {
        return processingOrderRequest;
    }

    public void setProcessingOrderRequest(OrderRequest processingOrderRequest) {
        this.processingOrderRequest = processingOrderRequest;
    }

    
    
}
