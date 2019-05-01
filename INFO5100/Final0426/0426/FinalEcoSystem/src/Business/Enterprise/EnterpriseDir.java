/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Employee.Employee;
import java.util.ArrayList;

/**
 *
 * @author junxiang
 */
public class EnterpriseDir {
    
    private ArrayList<Enterprise> enterpriseList;

    public EnterpriseDir() {
        enterpriseList = new ArrayList<>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
     public void remove(Enterprise enterprise){
        enterpriseList.remove(enterprise);
    }
}
