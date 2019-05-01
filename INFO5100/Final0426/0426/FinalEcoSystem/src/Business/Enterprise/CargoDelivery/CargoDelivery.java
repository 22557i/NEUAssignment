/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.CargoDelivery;

import Business.Enterprise.Enterprise;
import Business.WorkQueue.OrderRequest;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author junxiang
 */
public class CargoDelivery extends Enterprise{
    private String id;
    private static int counter = 0;
    private String description;//XJ
//    private ArrayList<CargoCartype> cargoCarList;//XJ
    public LinkedList<OrderRequest>orderList;
    public LinkedList<OrderRequest>finishedOrder;
    public OrderRequest processingOrderRequest;

    public OrderRequest getProcessingOrderRequest() {
        return processingOrderRequest;
    }

    public void setProcessingOrderRequest(OrderRequest processingOrderRequest) {
        this.processingOrderRequest = processingOrderRequest;
    }

    public String getId() {
        return id;
    }


    public LinkedList<OrderRequest> getOrderList() {
        return orderList;
    }

    public void setOrderList(LinkedList<OrderRequest> orderList) {
        this.orderList = orderList;
    }

    public CargoDelivery(String companyName, String address, String phone) {
        super(companyName, address, phone);
        this.orderList = new LinkedList<OrderRequest>();
        this.id = "CargoDelivery" + counter;
        counter++;
        double sum =0;
        int size=0;
        this.finishedOrder = new LinkedList<>();
        for(WorkRequest wr:this.getWorkQueue().getWorkRequestList()){
            if(wr instanceof OrderRequest){
                sum+=((OrderRequest) wr).getReview().getRate();
                size++;
            }
        }
        this.setOverallScore(sum/size);
    }

    public LinkedList<OrderRequest> getFinishedOrder() {
        return finishedOrder;
    }

    public void setFinishedOrder(LinkedList<OrderRequest> finishedOrder) {
        this.finishedOrder = finishedOrder;
    }
    
    public String getDescription() {//XJ
        return description;
    }

    public void setDescription(String description) {//XJ
        this.description = description;
    }
    
//XJ
//    public CargoCarDir getCargoCarDir() {
//        return cargoCarList;
//    }
    public ArrayList<CargoCartype> getCargoCarDir(){
        ArrayList<CargoCartype> result = new ArrayList<>();
        for (CargoCartype item : this.getItems()) {
            CargoCartype dash = (CargoCartype) item;
            result.add(dash);
        }
        return result;
    }
    
    public void addCgToList(CargoCartype dash) {
        this.getItems().add(dash);
    }

   
//    public CargoCartype addCarToList(String carType, double price, CargoDelivery cargoDelivery) {
//        CargoCartype cgcar =  new CargoCartype(carType, price, cargoDelivery);
//        cargoCarList.add(cgcar);
//        return cgcar;       
//    }
    
    

    

    
    
}
