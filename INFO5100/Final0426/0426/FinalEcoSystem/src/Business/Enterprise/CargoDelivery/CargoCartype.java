/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.CargoDelivery;



/**
 *
 * @author junxiang
 */
public class CargoCartype {
    private String carType;
    private double price;
    private CargoDelivery cargoDelivery;

    public CargoCartype(String carType, double price, CargoDelivery cargoDelivery) {
        this.carType = carType;
        this.price = price;
        this.cargoDelivery = cargoDelivery;
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
    
    public CargoDelivery getCargoDelivery()  {
        return this.cargoDelivery;        
    }

    @Override
    public String toString() {
        return  carType ;
    }
    
    
}
