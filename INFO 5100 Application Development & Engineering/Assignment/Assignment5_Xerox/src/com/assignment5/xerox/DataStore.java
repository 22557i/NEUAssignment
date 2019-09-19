package com.assignment5.xerox;

import com.assignment5.entities.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: Hui Huang
 * @Date: 2019/3/5 11:43
 * @Copyright (C):, 2019, Hui Huang, All Rights Reserved.
 */

public class DataStore {
    static DataStore dataStore;

    Map<Integer, Customer> customers;
    Map<Integer, Order> orders;
    Map<Integer, Item> items;
    Map<Integer, Product> products;
    Map<Integer, SalesPerson> salesPeople;

    DataStore() {
        customers = new HashMap<>();
        orders = new HashMap<>();
        items = new HashMap<>();
        products = new HashMap<>();
        salesPeople = new HashMap<>();
    }

    public static DataStore getInstance() {
        if (dataStore == null) {
            dataStore = new DataStore();
        }
        return dataStore;
    }

    public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }

    public Map<Integer, Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(Map<Integer, Customer> customers) {
        this.customers = customers;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    public Map<Integer, Item> getItems() {
        return items;
    }

    public void setItems(Map<Integer, Item> items) {
        this.items = items;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, SalesPerson> getSalesPeople() {
        return salesPeople;
    }

    public void setSalesPeople(Map<Integer, SalesPerson> salesPeople) {
        this.salesPeople = salesPeople;
    }
}
