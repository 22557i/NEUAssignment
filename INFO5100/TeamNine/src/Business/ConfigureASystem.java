package Business;

import Business.Customer.Customer;
import Business.Driver.Car;
import Business.Employee.Employee;
import Business.Enterprise.CarGoAgency;
import Business.Enterprise.CargoDeliveryCompany.CargoDelivery;
import Business.Enterprise.CargoDeliveryCompany.Service;
import Business.Enterprise.PickUpAgency;
import Business.Enterprise.PickupServiceCompany.*;
import Business.Network.Network;
import Business.Organization.PickUpOrganization;
import Business.Organization.Organization;
import Business.Organization.CarGoOrganization;
import Business.Organization.ManagerOrganization;
import Business.Role.BossRole;
import Business.Role.CargoManager;
import Business.Role.Driver;
import Business.Role.ManagerRole;
import Business.Role.PickUpManager;
import Business.Role.SystemManagerRole;
import Business.UserAccount.DriverAccount;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {

    public static EcoSystem configure() {

         EcoSystem system = EcoSystem.getInstance();
        
        // Create a system administrator UserAccount, belongs to SYSTEM
        Employee employee1 = system.getEmployeeDirectory().createEmployee("Harold", "Wu", "212212", "TeamNine@demo.com");
        UserAccount ua1 = system.getUserAccountDirectory().createEmployeeAccount("sysadmin", "sysadmin", new SystemManagerRole(), employee1);
        
        // Create Customer Account, belongs to SYSTEM
        Customer c1 = system.getCustomers().createCustomer("2",  "DrWu@husky.neu.edu", "1231231234");
        UserAccount ua2 = system.getUserAccountDirectory().createCustomerAccount("2", "2", c1);
        
        Customer c2 = system.getCustomers().createCustomer("1", "DrWu@husky.neu.edu", "1231231234");
        UserAccount ua3 = system.getUserAccountDirectory().createCustomerAccount("1", "1", c2);
        
        //Create Driver Account, belongs to SYSTEM
        Business.Driver.Driver d1 = system.getDrivers().createDriver("Driver1", "Driver1@demo.com", "1111");
        Car car1 = new Car("economy for 4 people", "BC678","black","Honda");
        d1.setVehicle(car1);
        UserAccount uad1 = system.getUserAccountDirectory().createDriverAccount("d1", "d1", d1);
        
        Business.Driver.Driver d2 = system.getDrivers().createDriver("Driver2", "Driver2@demo.com", "1111");
        Car car2 = new Car("9' cargo van", "BC278","white","U-Haul");
        d1.setVehicle(car2);
        UserAccount uad2 = system.getUserAccountDirectory().createDriverAccount("d2", "d2", d2);
        
        // Create Network, belongs to SYSTEM
        Network network1 = system.createNetwork("Boston");
        network1.setId("Boston");
        network1.setCargodeliveryList(new ArrayList<>());
        Network network2 = system.createNetwork("New York City");
        network2.setId("New York City");
        Network network3 = system.createNetwork("Los Angeles");
        network3.setId("Los Angeles");
        
        //!#harold wu new add
        //system.getNetworkList().add(network3);
        //system.getNetworkList().add(network2);
        //system.getNetworkList().add(network1);
        
        //Boston Enterprise with organiztions created
        
        /*CargoAgency NO.1 in Bostong*/
        CargoDelivery enter1 = network1.createCargoDelivery("Boston Cargo Agency", "1 Pleasant Street, Boston, MA 02125", "(617) 553-5900");
        network2.createCargoDelivery("Boston Cargo Agency", "1 Pleasant Street, Boston, MA 02125", "(617) 553-5900");
        network3.createCargoDelivery("Boston Cargo Agency", "1 Pleasant Street, Boston, MA 02125", "(617) 553-5900");
        enter1.setDescription("This is a CarGo Agency.");
        enter1.setId("Cargo");
        enter1.setPath("Images/DeliveryCompanyCut/default.png");//没用
        Service service1 = new Service(enter1, "9' cargo van", 10.00);
        Service service2 = new Service(enter1, "10' truck", 20.00);
        Service service3 = new Service(enter1, "15' truck", 30.00);
        enter1.addDashToMenu(service1);
        enter1.addDashToMenu(service2);
        enter1.addDashToMenu(service3);
        //create organiztions 
        //add boss role at CargoAgency 
        Employee b1 = enter1.getEmployeeDirectory().createEmployee("Row34", "Boss", "12344", "boss@row34.com");
        UserAccount ba1 = enter1.getUserAccountDirectory().createEmployeeAccount("row34", "row34", new BossRole(), b1);             
        //add Manager role at CargoAgency 
        ManagerOrganization mo2 = (ManagerOrganization) enter1.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Manager);
        Employee em1 = mo2.getEmployeeDirectory().createEmployee("Manager", "Manager", "111", "manager@demo.com");
        UserAccount ua6 = mo2.getUserAccountDirectory().createEmployeeAccount("rm", "rm", new ManagerRole(), em1);


          /*CargoAgency NO.2 in Bostong*/
        CargoDelivery enter2 = network1.createCargoDelivery("Star Cargo Delivery", "270 Northern Ave, Boston, MA 02210", "(617) 477-2900");
        enter2.setDescription("Lightning Quick，Star Service.");
        enter2.setId("Star Cargo");
        enter2.setPath("Images/DeliveryCompanyCut/default.png");//没用
        Service service21 = new Service(enter2, "17' truck", 50.00);
        Service service22 = new Service(enter2, "10' truck", 20.00);      
        enter2.addDashToMenu(service21);
        enter2.addDashToMenu(service22);  
        //create organiztions 
        //add boss role at CargoAgency 
        Employee b2 = enter2.getEmployeeDirectory().createEmployee("Legal", "Boss", "222", "boss@demo.com");
        UserAccount ba2 = enter2.getUserAccountDirectory().createEmployeeAccount("legal", "legal", new BossRole(), b2);             
        //add Manager role at CargoAgency 
        ManagerOrganization mo3 = (ManagerOrganization) enter2.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Manager);
        Employee em2 = mo3.getEmployeeDirectory().createEmployee("Manager", "Manager", "222", "manager@demo.com");
        UserAccount ua7 = mo3.getUserAccountDirectory().createEmployeeAccount("lm", "lm", new ManagerRole(), em2);

               
        /*PickUpAgency NO.1 in Bostong*/
        PickupService enter3 = network1.createPickupService("Boston PickUp Agency", "2 Pleasant Street, Boston, MA 02125", "(617) 123-3232");
        enter3.setDescription("ALL YOU WANT IS HERE ");
        enter3.setId("PickUp");
        enter3.setPath("Images/StoreCut/default.png");               
        CarLevel p1 = new CarLevel(enter3, "Enconomy", 4.2);//sedan for 4 people
        CarLevel p2 = new CarLevel(enter3, "Extra Seats", 20.5);//XL for 6 people
        CarLevel p3 = new CarLevel(enter3, "Luxury", 23.2);//Lux for 4 people
        enter3.addProductToList(p1);
        enter3.addProductToList(p2);
        enter3.addProductToList(p3);
        //create organiztions 
        //add boss role at PickUpAgency         
        Employee se1 = enter3.getEmployeeDirectory().createEmployee("Whole", "Foods", "222", "boss@demo.com");
        UserAccount sa1 = enter3.getUserAccountDirectory().createEmployeeAccount("whole", "whole", new BossRole(), se1);
        //add Manager role at PickUpAgency 
        ManagerOrganization mo4 = (ManagerOrganization) enter3.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Manager);
        Employee se2 = mo4.getEmployeeDirectory().createEmployee("Manager", "Manager", "222", "manager@demo.com");
        UserAccount sa2 = mo4.getUserAccountDirectory().createEmployeeAccount("wm", "wm", new ManagerRole(), em2);
        
        
        /*New York City CargoDelivery List*/
        CargoDelivery res = network2.createCargoDelivery("Home grown GA CargoDelivery", "968 Memorial Dr SE, Atlanta, GA 30316", "(404) 222-0455");
        res.setDescription("Laid-back eatery serving locally sourced breakfast & Southern fare in a retro country-diner setting.");
        res.setId("home");
        res.setPath("Images/CargoDeliveryCut/default.png");        
        Service da1 = new Service(res, "9' cargo van", 10);
        Service da2 = new Service(res, "10' truck", 14);
        Service da3 = new Service(res, "17' truc", 30.99);
        res.addDashToMenu(da1);
        res.addDashToMenu(da2);
        res.addDashToMenu(da3);
        //create organiztions 
        //add boss role at CargoAgency in New York
        Employee he = res.getEmployeeDirectory().createEmployee("Home Grown", "Boss", "222", "boss@demo.com");
        UserAccount hee = res.getUserAccountDirectory().createEmployeeAccount("home", "home", new BossRole(), he);
        //add Manager role at CargoAgency in New York
        ManagerOrganization hmo3 = (ManagerOrganization) res.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Manager);
        Employee hem2 = hmo3.getEmployeeDirectory().createEmployee("Manager", "Manager", "222", "manager@demo.com");
        UserAccount hua7 = hmo3.getUserAccountDirectory().createEmployeeAccount("hm", "hm", new ManagerRole(), hem2);
        
  
        /*
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        // System manager, belongs to SYSTEM
  
        
        // BOSTON Restaurant List
        Restaurant res1 = network1.createRestaurant("Row 34", "383 Congress St, Boston, MA 02210", "(617) 553-5900");
        res1.setCategory(Restaurant.RestaurantCategory.Seafood);
        res1.setId("Row");
        res1.setPath("Images/RestaurantCut/default.png");
        res1.setDescription("This stylish brick-&-wood eatery serves an extensive oyster menu plus fish entrees & craft beers.");
        Dash dash1 = new Dash(res1, "Dash1", 20);
        Dash dash2 = new Dash(res1, "Dash2", 30);
        Dash dash3 = new Dash(res1, "Dash3", 27.6);
        res1.addDashToMenu(dash1);
        res1.addDashToMenu(dash2);
        res1.addDashToMenu(dash3);
        
        Employee b1 = res1.getEmployeeDirectory().createEmployee("Row34", "Boss", "12344", "boss@row34.com");
        UserAccount ba1 = res1.getUserAccountDirectory().createEmployeeAccount("row34", "row34", new BossRole(), b1);
        
        PickUpOrganization mo2 = (PickUpOrganization) res1.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Manager);
        Employee em1 = mo2.getEmployeeDirectory().createEmployee("Manager", "Manager", "111", "manager@demo.com");
        UserAccount ua6 = mo2.getUserAccountDirectory().createEmployeeAccount("rm", "rm", new ManagerRole(), em1);

        Restaurant res2 = network1.createRestaurant("Legal Harborside", "270 Northern Ave, Boston, MA 02210", "(617) 477-2900");
        res2.setCategory(Restaurant.RestaurantCategory.Seafood);
        res2.setId("legal");
        res2.setPath("Images/RestaurantCut/default.png");
        res2.setDescription("Specializing in upmarket seafood, this contemporary chain also serves steaks & cocktails.");
        Dash d1 = new Dash(res1, "D1", 10);
        Dash d2 = new Dash(res1, "D2", 14);
        Dash d3 = new Dash(res1, "D3", 11.99);
        res2.addDashToMenu(d1);
        res2.addDashToMenu(d2);
        res2.addDashToMenu(d3);
        
        Employee e = res2.getEmployeeDirectory().createEmployee("Legal", "Boss", "222", "boss@demo.com");
        UserAccount ee = res2.getUserAccountDirectory().createEmployeeAccount("legal", "legal", new BossRole(), e);
        
        PickUpOrganization mo3 = (PickUpOrganization) res2.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Manager);
        Employee em2 = mo3.getEmployeeDirectory().createEmployee("Manager", "Manager", "222", "manager@demo.com");
        UserAccount ua7 = mo3.getUserAccountDirectory().createEmployeeAccount("lm", "lm", new ManagerRole(), em2);

        // Boston Store List
        Store store1 = network1.createStore("Whole Foods", "15 Westland Ave, Boston, MA 02115", "(617) 375-1010");
        store1.setId("whole");
        store1.setPath("Images/StoreCut/default.png");
        store1.setCategory(Store.StoreCategory.Organic);
        store1.setDescription("Eco-minded chain with natural & organic grocery items, housewares & other products.");
        Product p1 = new Product(store1, "Cookie", 2);
        Product p2 = new Product(store1, "Coke", 2.5);
        Product p3 = new Product(store1, "Water", 1);
        Product p4 = new Product(store1, "fork", 6);
        store1.addProductToList(p1);
        store1.addProductToList(p2);
        store1.addProductToList(p3);
        store1.addProductToList(p4);
        
        Employee se1 = store1.getEmployeeDirectory().createEmployee("Whole", "Foods", "222", "boss@demo.com");
        UserAccount sa1 = store1.getUserAccountDirectory().createEmployeeAccount("whole", "whole", new BossRole(), e);
        
        PickUpOrganization mo4 = (PickUpOrganization) store1.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Manager);
        Employee se2 = mo4.getEmployeeDirectory().createEmployee("Manager", "Manager", "222", "manager@demo.com");
        UserAccount sa2 = mo4.getUserAccountDirectory().createEmployeeAccount("wm", "wm", new ManagerRole(), em2);
        
        
        // Atlanta Restaurant List
        Restaurant res = network2.createRestaurant("Home grown GA Restaurant", "968 Memorial Dr SE, Atlanta, GA 30316", "(404) 222-0455");
        res.setCategory(Restaurant.RestaurantCategory.American);
        res.setId("home");
        res.setPath("Images/RestaurantCut/default.png");
        res.setDescription("Laid-back eatery serving locally sourced breakfast & Southern fare in a retro country-diner setting.");
        Dash da1 = new Dash(res, "D1", 10);
        Dash da2 = new Dash(res, "D2", 14);
        Dash da3 = new Dash(res, "D3", 11.99);
        res.addDashToMenu(da1);
        res.addDashToMenu(da2);
        res.addDashToMenu(da3);
        
        Employee he = res.getEmployeeDirectory().createEmployee("Home Grown", "Boss", "222", "boss@demo.com");
        UserAccount hee = res.getUserAccountDirectory().createEmployeeAccount("home", "home", new BossRole(), he);
        
        PickUpOrganization hmo3 = (PickUpOrganization) res.getOrganizationDirectory().getTypicalOrganization(Organization.Type.Manager);
        Employee hem2 = hmo3.getEmployeeDirectory().createEmployee("Manager", "Manager", "222", "manager@demo.com");
        UserAccount hua7 = hmo3.getUserAccountDirectory().createEmployeeAccount("hm", "hm", new ManagerRole(), hem2);
 */
        return system;
    }

}
