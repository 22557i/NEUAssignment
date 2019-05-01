/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.PickupService;



/**
 *
 * @author junxiang
 */
public class PickupCartype{
    
    private String carType;
    private double price;
    
    private PickupService pickupService;

    public PickupCartype(String carType, double price, PickupService pickupService) {
        this.carType = carType;
        this.price = price;
        this.pickupService = pickupService;
    }
    
    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public PickupService getPickupService(){
        return this.pickupService;
    }
}
