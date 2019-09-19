/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;


import Business.Enterprise.CarGoAgency;
import Business.Enterprise.CargoDeliveryCompany.CargoDelivery;
import Business.Enterprise.PickUpAgency;
import Business.Enterprise.PickupServiceCompany.PickupService;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDir;

import java.util.ArrayList;

/**
 *
 * @author 
 */
public class Network {

    private String id;
    private EnterpriseDir enterpriseDir;
    private String city;
    private ArrayList<CargoDelivery> cargodeliveryList;
    private ArrayList<PickupService> pickupServicesList;
    
    
    private static int counter = 0;
    
    public Network(String city) {
        enterpriseDir = new EnterpriseDir();
        this.city = city;
        this.id = "Network" + counter;
        counter++;
        this.setCargodeliveryList( new ArrayList<CargoDelivery>());
        this.setPickupServicesList(  new ArrayList<PickupService>());
    }

    public ArrayList<CargoDelivery> getCargodeliveryList() {
        return cargodeliveryList;
    }

    public void setCargodeliveryList(ArrayList<CargoDelivery> cargodeliveryList) {
        this.cargodeliveryList = cargodeliveryList;
    }

    public ArrayList<PickupService> getPickupServicesList() {
        return pickupServicesList;
    }

    public void setPickupServicesList(ArrayList<PickupService> pickupServicesList) {
        this.pickupServicesList = pickupServicesList;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setId(String id) {
        this.id = id;
    }

    public EnterpriseDir getEnterpriseDirectory() {
        return enterpriseDir;
    }
     
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getCity() {
        return this.city;
    }   
    
    public CargoDelivery createCargoDelivery(String name, String address, String phone) {
        CargoDelivery enter = new CargoDelivery(name, address, phone);
        enter.createOrganizations();
        this.cargodeliveryList.add(enter);
        return enter;
    }
    public PickupService createPickupService(String name, String address, String phone) {
        PickupService enter = new PickupService(name, address, phone);
        enter.createOrganizations();
        this.pickupServicesList.add(enter);
        return enter;
    }
    @Override   
    public String toString(){
        return city;
    }
    /*
    public Restaurant createRestaurant(String name, String address, String phone) {
        Restaurant res = new Restaurant(name, address, phone);
        res.createOrganizations();
        this.enterpriseDir.getEnterpriseList().add(res);
        return res;
    }
    
    public Store createStore(String name, String address, String phone) {
        Store store = new Store(name, address, phone);
        store.createOrganizations();
        this.enterpriseDir.getEnterpriseList().add(store);
        return store;
    }
    
    public ArrayList<Store> getStoreList() {
        ArrayList<Store> result = new ArrayList<>();
        for (Enterprise en:this.enterpriseDir.getEnterpriseList()) {
            if (en instanceof Store) {
                Store store = (Store) en;
                result.add(store);
            }
        }
        return result;
    }
    
    public ArrayList<Restaurant> getRestaurantList() {
        ArrayList<Restaurant> result = new ArrayList<>();
        for (Enterprise en:this.enterpriseDir.getEnterpriseList()) {
            if (en instanceof Restaurant) {
                Restaurant res = (Restaurant) en;
                result.add(res);
            }
        }
        return result;
    }
    
    public ArrayList<DeliveryCompany> getDeliveryCompanyList() {
        ArrayList<DeliveryCompany> result = new ArrayList<>();
        for (Enterprise en:this.enterpriseDir.getEnterpriseList()) {
            if (en instanceof DeliveryCompany) {
                DeliveryCompany del = (DeliveryCompany) en;
                result.add(del);
            }
        }
        return result;
    }
    
//    public ArrayList<DeliveryCompany> getDeliveryCompanyListByCity(String city) {
//        ArrayList<DeliveryCompany> result = new ArrayList<>();
//        for (DeliveryCompany del : this.getDeliveryCompanyList()) {
//            if (del.getCity().equalsIgnoreCase(city)) {
//                result.add(del);
//            }
//        }
//        return result;
//    }
//    
//    public ArrayList<Restaurant> getRestaurantListByCity(String city) {
//        ArrayList<Restaurant> result = new ArrayList<>();
//        for (Restaurant res : this.getRestaurantList()) {
//            if (res.getCity().equalsIgnoreCase(city)) {
//                result.add(res);
//            }
//        }
//        return result;
//    }
}
*/
}