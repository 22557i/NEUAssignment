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
//service {"Next Day Air","2nd Day Air","Ground","Same-day Delivery","One-hour Delivery"}
//car type {9' cargo van, 10' truck, 15' truck, 17' truck}
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

}
