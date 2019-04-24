/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.CargoDelivery;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import java.util.ArrayList;

/**
 *
 * @author junxiang
 */
public class CargoDelivery extends Enterprise{
    private String id;
    private static int counter = 0;
    private String description;//XJ
    
//    private ArrayList<CargoCartype> cargoCarList;//XJ
    

    public CargoDelivery(String companyName, String address, String phone) {
        super(companyName, address, phone);
        this.id = "CargoDelivery" + counter;
        counter++;
     
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
        for (CargoCartype item : this.getItemsDirectory()) {
            CargoCartype dash = (CargoCartype) item;
            result.add(dash);
        }
        return result;
    }
    
   

//    public CargoCartype addCarToList(String carType, double price, CargoDelivery cargoDelivery) {
//        CargoCartype cgcar =  new CargoCartype(carType, price, cargoDelivery);
//        cargoCarList.add(cgcar);
//        return cgcar;       
//    }
    
    

    

    
    
}
