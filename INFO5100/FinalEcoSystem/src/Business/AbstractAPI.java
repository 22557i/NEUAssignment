/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.EmployeeDir;
import Business.UserAccount.UserAccountDir;

/**
 *
 * @author junxiang
 */
public abstract class AbstractAPI {
     public abstract UserAccountDir getUserAccountDirectory();
     public abstract EmployeeDir getEmployeeDirectory();
}