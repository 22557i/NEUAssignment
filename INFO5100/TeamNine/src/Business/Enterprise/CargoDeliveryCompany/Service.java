/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.CargoDeliveryCompany;

import Business.Enterprise.Item;

/**
 *
 * @author ranranhe
 */
public class Service extends Item {

    private CargoDelivery cargoDelivery;
//    private String name;
//    private double price;

    public Service(CargoDelivery cargoDelivery, String name, double price) {
        super(name, price);
        this.cargoDelivery = cargoDelivery;
    }

    public CargoDelivery getCargoDelivery() {
        return this.cargoDelivery;
    }

//    public String getName() {
//        return this.name;
//    }
//    
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPrice() {
//        return this.price;
//    }
//    
//    public void setPrice(double price) {
//        this.price = price;
//    }
//    
//    @Override
//    public String toString() {
//        return this.name;
//    }
}
