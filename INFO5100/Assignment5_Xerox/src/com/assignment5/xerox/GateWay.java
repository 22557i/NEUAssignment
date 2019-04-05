/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment5.xerox;

import com.assignment5.entities.Customer;
import com.assignment5.entities.Item;
import com.assignment5.entities.Order;
import com.assignment5.entities.Product;
import com.assignment5.entities.SalesPerson;
import com.sun.org.apache.xpath.internal.operations.Or;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;

/**
 *
 * @author kasai
 */
public class GateWay {

    DataReader orderReader3;
    DataReader productReader3;

    public static void main(String args[]) throws IOException{

        GateWay gw = new GateWay();
        gw.readData();
        gw.fiveMostPopularProducts();
        gw.topCustomersInCertainMarkets();

//        DataGenerator generator = DataGenerator.getInstance();
        
        //Below is the sample for how you can use reader. you might wanna 
        //delete it once you understood.
        
        DataReader orderReader = new DataReader("./SalesData.csv");
        DataReader orderReader1 = new DataReader("./SalesData.csv");
        String[] orderRow;
        String[] orderRow1;
        DataReader productReader = new DataReader("./ProductCatalogue.csv");
        String[] prodRow;
       // printRow(orderReader.getFileHeader());
        Map<Integer,Integer>Order_Item;
        Map<Integer,Integer>Order_Product;
        Map<Integer,Integer>Order_Quantity;
        TreeMap<String, Object>TotalRevenueByMarkets=null;
        int TotalRevenue =0;
        int TRretail =0;
        int TRpharmaceutical=0;
        int TRrealestate =0;
        int TRfinancial=0;
        int TRsoftware=0;
        int TReducation=0;


           /*
    3.Our 5 best customers
    totalSalesPriceByCustomersPerCT -> map<customerID: totalSalesPriceByCustomersPerCT>
    totalTargetPriceByCustomersPerCT -> map<customerID: totalTargetPriceByCustomersPerCT>
    */
       
        List<Customer> customerlist = new ArrayList<Customer>();
        List<Product> productlist = new ArrayList<Product>();
        
        Map<Integer, Integer> CustomerTotalSalesPrice = new HashMap<>();
        Map<Integer, Integer> CustomerTargetSalesPrice = new HashMap<>();
        Map<Integer, Integer> CustomerDiffr = new HashMap<>();
        // maps and list in requirement 4.Our top 3 best sales people 
        Map<Integer, Integer> SalesTotalSalesPrice = new HashMap<>();
        Map<Integer, Integer> SalesTargetSalesPrice = new HashMap<>();
        Map<Integer, Integer> SalesDiffr = new HashMap<>();
        List<SalesPerson> saleslist = new ArrayList<SalesPerson>();
        
        //read data
        while((orderRow = orderReader.getNextRow()) != null){
            Customer customer = new Customer(Integer.valueOf(orderRow[5]),Integer.valueOf(orderRow[0]),Integer.valueOf(orderRow[2]),Integer.valueOf(orderRow[3]),Integer.valueOf(orderRow[6]));
            customerlist.add(customer);
            SalesPerson sales = new SalesPerson(Integer.valueOf(orderRow[4]),Integer.valueOf(orderRow[0]),Integer.valueOf(orderRow[2]),Integer.valueOf(orderRow[3]),Integer.valueOf(orderRow[6]));
            saleslist.add(sales);

        }
             int flag =0;
        int []minprice = new int[5];
        while((prodRow = productReader.getNextRow()) != null){
            Product product = new Product(Integer.valueOf(prodRow[0]),Integer.valueOf(prodRow[1]),Integer.valueOf(prodRow[2]),Integer.valueOf(prodRow[3]));
            productlist.add(product);
            minprice[flag]=Integer.valueOf(prodRow[1]);
            flag++;
        }
        
        //calculate total price
        int totalSalesPriceByCustomer = 0;
        int totalTargetPriceByCustomer = 0;
        for(Customer c:customerlist){
            int targetPrice = 0; 
            if(CustomerTotalSalesPrice.containsKey(c.getCustomerId())){
                totalSalesPriceByCustomer = CustomerTotalSalesPrice.get(c.getCustomerId()) + (c.getSalesPrice() * c.getQuantity());
                
                
                for(Product p:productlist){                    
                    if(p.getProductId() == c.getProductId()){
                        targetPrice = p.getTargetPrice();
                    }
                }
                totalTargetPriceByCustomer = CustomerTargetSalesPrice.get(c.getCustomerId()) + (targetPrice * c.getQuantity()); 
                
                
            }
            else{
                totalSalesPriceByCustomer = c.getSalesPrice() * c.getQuantity();
     
                for(Product p:productlist){                   
                    if(p.getProductId() == c.getProductId()){
                        targetPrice = p.getTargetPrice();
                    }                    
                }
                totalTargetPriceByCustomer = targetPrice * c.getQuantity(); 
            } 
                        
            CustomerTotalSalesPrice.put(c.getCustomerId(), totalSalesPriceByCustomer);
            CustomerTargetSalesPrice.put(c.getCustomerId(), totalTargetPriceByCustomer);    
            
        }
        
        //difference = totalSalesPriceByCustomer - totalTargetPriceByCustomer         
        for(int id : CustomerTotalSalesPrice.keySet()){
            int difference = CustomerTotalSalesPrice.get(id) - CustomerTargetSalesPrice.get(id);
            CustomerDiffr.put(id, difference);            
        }
               
        //descending ranking by difference, and print five best customers
       CustomerDiffr = sortByValueDescending(CustomerDiffr);
       System.out.println("--------------------------------3. Our 5 best customers : "+"--------------------------------------------------------------------------------------");
       int i = 0;       
       for (Map.Entry<Integer, Integer> entry : CustomerDiffr.entrySet()) {                        
            if(i>4){
                break;
            }
            System.out.println("CustomerID = " + entry.getKey() + ", TotalDifference = " + entry.getValue()); 
            i++;
        }

       
             /*
    4.Our top 3 best sales people
   totalSalesPriceByCustomersPerCT -> map<SalesID: totalSalesPriceByCustomersPerCT>
   totalTargetPriceByCustomersPerCT -> map<SalesID: totalTargetPriceByCustomersPerCT>
    */        

       //calculate total price
        int totalSalesPriceBySalesPerson = 0;
        int totalTargetPriceBySalesPerson = 0;
        for(SalesPerson s:saleslist){
            int targetPrice = 0; 
            if(SalesTotalSalesPrice.containsKey(s.getSalesId())){
                totalSalesPriceBySalesPerson = SalesTotalSalesPrice.get(s.getSalesId()) + (s.getSalesPrice() * s.getQuantity());
                
                
                for(Product p:productlist){                    
                    if(p.getProductId() == s.getProductId()){
                        targetPrice = p.getTargetPrice();
                    }
                }
                totalTargetPriceBySalesPerson = SalesTargetSalesPrice.get(s.getSalesId()) + (targetPrice * s.getQuantity()); 
                
                
            }
            else{
                totalSalesPriceBySalesPerson = s.getSalesPrice() * s.getQuantity();
     
                for(Product p:productlist){                   
                    if(p.getProductId() == s.getProductId()){
                        targetPrice = p.getTargetPrice();
                    }                    
                }
                totalTargetPriceBySalesPerson = targetPrice * s.getQuantity(); 
            } 
                        
            SalesTotalSalesPrice.put(s.getSalesId(), totalSalesPriceBySalesPerson);
            SalesTargetSalesPrice.put(s.getSalesId(), totalTargetPriceBySalesPerson);    
            
        }
        
        //difference = totalSalesPriceByCustomer - totalTargetPriceByCustomer         
        for(int id : SalesTotalSalesPrice.keySet()){
            int differenceSales = SalesTotalSalesPrice.get(id) - SalesTargetSalesPrice.get(id);
            SalesDiffr.put(id, differenceSales);            
        }
               
        //descending ranking by difference, and print three best sales persons
       SalesDiffr = sortByValueDescending(SalesDiffr);
System.out.println("--------------------------------4. Our top 3 best sales people : "+"--------------------------------------------------------------------------------------");
       int j = 0;       
       for (Map.Entry<Integer, Integer> entry : SalesDiffr.entrySet()) {                        
            if(j>2){
                break;
            }
            System.out.println("SalesPersonID = " + entry.getKey() + ", TotalDifference = " + entry.getValue()); 
            j++;
        }
        
        
        while((orderRow1 = orderReader1.getNextRow()) != null){
            Item item = new Item(Integer.valueOf(orderRow1[2]),Integer.valueOf( orderRow1[6]),Integer.valueOf( orderRow1[3]),Integer.valueOf(orderRow1[1]));
           Order order = new Order(Integer.valueOf(orderRow1[0]),Integer.valueOf( orderRow1[4]), Integer.valueOf(orderRow1[5]), item, orderRow1[7]);
          //这是读取数据 可以把相应的数据通过循环加到你想要的图里
           
           TotalRevenue += (Integer.valueOf( orderRow1[6])-minprice[Integer.valueOf(orderRow1[2])]) *Integer.valueOf(orderRow1[3]);//Requirment5
          //Requirement 6
           switch(orderRow1[7]){
               case "retail":
                 
                   TRretail+= (Integer.valueOf( orderRow1[6])-minprice[Integer.valueOf(orderRow1[2])]) *Integer.valueOf(orderRow1[3]);
                   break;
               case "pharmaceutical":
                   TRpharmaceutical+=(Integer.valueOf( orderRow1[6])-minprice[Integer.valueOf(orderRow1[2])]) *Integer.valueOf(orderRow1[3]);
                   break;
               case "realestate":
                   TRrealestate+=(Integer.valueOf( orderRow1[6])-minprice[Integer.valueOf(orderRow1[2])]) *Integer.valueOf(orderRow1[3]);
                   break;
               case "financial" :
                   TRfinancial+=(Integer.valueOf( orderRow1[6])-minprice[Integer.valueOf(orderRow1[2])]) *Integer.valueOf(orderRow1[3]);
                   break;
               case "software":
                   TRsoftware+=(Integer.valueOf( orderRow1[6])-minprice[Integer.valueOf(orderRow1[2])]) *Integer.valueOf(orderRow1[3]);
                   break;
               case "education":
                   TReducation+=(Integer.valueOf( orderRow1[6])-minprice[Integer.valueOf(orderRow1[2])]) *Integer.valueOf(orderRow1[3]);
                   break;
                                  
           }
          
            // printRow(orderRow);
            //System.out.println(item);
            //System.out.println(order);
        }
         /*  TotalRevenueByMarkets.put("retail", TRretail);
           TotalRevenueByMarkets.put("pharmaceutical", TRpharmaceutical);
           TotalRevenueByMarkets.put("realestate",TRrealestate);
           TotalRevenueByMarkets.put("financial",TRfinancial);
           TotalRevenueByMarkets.put("software",TRsoftware);
           TotalRevenueByMarkets.put("education",TReducation);
        for(String key :TotalRevenueByMarkets.keySet()){
            System.out.println("The total revenue of "+key+" is "+TotalRevenueByMarkets.get(key));
        }  */
        System.out.println("--------------------------------5.The Total Revenue in this year is " +TotalRevenue+" U.S.D--------------------------------------------------------------------------------------");
        System.out.println("--------------------------------6.The Total Revenue of Each Market is:--------------------------------------------------------------");
        System.out.println("Retail:---------"+TRretail);
        System.out.println("Financial:---------"+TRfinancial);
        System.out.println("Pharmaceutical:---------"+TRpharmaceutical);
        System.out.println("Realestate :---------"+TRrealestate);
        System.out.println("Software :---------"+TRsoftware);
        System.out.println("Education :---------"+TReducation);
        //Requirment6End;
        
       
       // printRow(productReader.getFileHeader());
        while((prodRow = productReader.getNextRow()) != null){
            printRow(prodRow);
        }


    }
    
    public static void printRow(String[] row){
        for (String row1 : row) {
            System.out.print(row1 + ", ");
        }
        System.out.println("");
    }
    
    //descending ranking of map
    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValueDescending(Map<K, V> map)
    {
        List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<K, V>>()
        {
            @Override
            public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2)
            {
                int compare = (o1.getValue()).compareTo(o2.getValue());
                return -compare;
            }
        });

        Map<K, V> result = new LinkedHashMap<K, V>();
        for (Map.Entry<K, V> entry : list) {
            result.put(entry.getKey(), entry.getValue());
        }
        return result;
    }

    GateWay() throws IOException {
//        DataGenerator generator = DataGenerator.getInstance();
        orderReader3 = new DataReader("./SalesData.csv");
        productReader3 = new DataReader("./ProductCatalogue.csv");
    }

    private void readData() throws IOException {
        String[] row;
        while ((row = orderReader3.getNextRow()) != null) {
            generateItem(row);
            generateOrder(row);
        }
    }

    // 0 - Order-Id
    // 4 - Sales-Id
    // 5 - Customer-Id
    // 7 - Market-Segment
    private void generateOrder(String[] row) {
        int orderId = Integer.valueOf(row[0]);
        int salesId = Integer.valueOf(row[4]);
        int customerId = Integer.valueOf(row[5]);
        String market = row[7];

        int itemId = Integer.valueOf(row[1]);
        int productId = Integer.valueOf(row[2]);
        int quantity = Integer.valueOf(row[3]);
        int price = Integer.valueOf(row[6]);

        Item item = new Item(productId, price, quantity, itemId);
        Order order = new Order(orderId, salesId, customerId, item, market);
        DataStore.getInstance().getOrders().put(orderId, order);
    }

    // 1 - Item-id
    // 2 - Product-Id
    // 3 - Quantity
    // 6 - Sales-Price-Per-Prod
    private void generateItem(String[] row) {
        int itemId = Integer.valueOf(row[1]);
        int productId = Integer.valueOf(row[2]);
        int quantity = Integer.valueOf(row[3]);
        int price = Integer.valueOf(row[6]);

        Item item = new Item(productId, price, quantity, itemId);

        DataStore.getInstance().getItems().put(itemId, item);
    }

    // 1. Our top 5 most popular product sorted from high to low.
    private void fiveMostPopularProducts() {
        Map<Integer, Order> orderMap = DataStore.getInstance().getOrders();
        Map<Integer, Integer> countPop = new HashMap<>();

        for (Order order : orderMap.values()) {
            int quantity = order.getItem().getQuantity();
            int price = order.getItem().getSalesPrice();
            int productId = order.getItem().getProductId();

            countPop.put(productId, countPop.getOrDefault(productId, 0) + quantity * price);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        return o2.getValue() - o1.getValue();
                    }
                }
        );

        pq.addAll(countPop.entrySet());
        System.out.println("--------------------------------1. top 5 most popular product: --------------------------------------------------------------------------------------");
        for (int i = 0; i< 5; i++) {
            Map.Entry<Integer, Integer> entry = pq.poll();
            System.out.println("productId: " + entry.getKey() + " revenue: " + entry.getValue());
        }
    }

    // 2. Our top customers in certain markets (e.g., education market, financial market, retail, etc.)
    private void topCustomersInCertainMarkets() {
        Map<Integer, Order> orderMap = DataStore.getInstance().getOrders();
        Map<Map<Integer, String>, Integer> countSalesByMarket = new HashMap<>();

        for (Order order : orderMap.values()) {
            int customerId = order.getCustomerId();
            String market = order.getMarket();
            int quantity = order.getItem().getQuantity();
            int price = order.getItem().getSalesPrice();

            HashMap<Integer, String> map = new HashMap<>();
            map.put(customerId, market);
            countSalesByMarket.put(map, countSalesByMarket.getOrDefault(map, 0) + quantity * price);
        }

        Queue<Map.Entry<Map<Integer, String>, Integer>> pq = new PriorityQueue<>(
                new Comparator<Map.Entry<Map<Integer, String>, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Map<Integer, String>, Integer> o1, Map.Entry<Map<Integer, String>, Integer> o2) {
                        return o2.getValue() - o1.getValue();
                    }
                }
        );

        pq.addAll(countSalesByMarket.entrySet());

        HashSet<String> set = new HashSet<>();
        System.out.println("--------------------------------2. top customers in certain markets --------------------------------------------------------------------------------------");
        while (!pq.isEmpty()) {
            Map.Entry<Map<Integer, String>, Integer> entrys = pq.poll();
            for (Map.Entry<Integer, String> entry : entrys.getKey().entrySet()) {
                if(!set.contains(entry.getValue())) {
                    System.out.println("CustomerId: " + entry.getKey() + " Market: " + entry.getValue() + " Revenue: " + entrys.getValue());
                    set.add(entry.getValue());
                }
            }

        }
    }
}
/*
New Product Catalogue Created
New Orders File Created
--------------------------------1. top 5 most popular product: --------------------------------------------------------------------------------------
productId: 17 revenue: 308927
productId: 1 revenue: 290724
productId: 14 revenue: 282927
productId: 2 revenue: 271396
productId: 15 revenue: 262768
--------------------------------2. top customers in certain markets --------------------------------------------------------------------------------------
CustomerId: 8 Market: pharmaceutical Revenue: 44792
CustomerId: 12 Market: realestate Revenue: 44412
CustomerId: 19 Market: retail Revenue: 42770
CustomerId: 27 Market: education Revenue: 40324
CustomerId: 17 Market: software Revenue: 38464
CustomerId: 10 Market: financial Revenue: 36946
--------------------------------3. Our 5 best customers : --------------------------------------------------------------------------------------
CustomerID = 11, TotalDifference = 5015
CustomerID = 23, TotalDifference = 4957
CustomerID = 26, TotalDifference = 3648
CustomerID = 18, TotalDifference = 2322
CustomerID = 10, TotalDifference = 2282
--------------------------------4. Our top 3 best sales people : --------------------------------------------------------------------------------------
SalesPersonID = 7, TotalDifference = 4515
SalesPersonID = 6, TotalDifference = 2578
SalesPersonID = 4, TotalDifference = 788
--------------------------------5.The Total Revenue in this year is 267543 U.S.D--------------------------------------------------------------------------------------
--------------------------------6.The Total Revenue of Each Market is:--------------------------------------------------------------
Retail:---------47173
Financial:---------39341
Pharmaceutical:---------45043
Realestate :---------46510
Software :---------45389
Education :---------44087
*/