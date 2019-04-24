/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise.PickupService;

import Business.Enterprise.Enterprise;

/**
 *
 * @author junxiang
 */
public class PickupService extends Enterprise{
    private String id;
    private static int counter = 0;
    private String description;//XJ
    
    public PickupService(String companyName, String address, String phone) {
        super(companyName, address, phone);
        this.id = "PickupService" + counter;
        counter++;
    }
    
    public String getDescription() {//XJ
        return description;
    }
     
     public void setDescription(String description) {//XJ
        this.description = description;
    }
}
