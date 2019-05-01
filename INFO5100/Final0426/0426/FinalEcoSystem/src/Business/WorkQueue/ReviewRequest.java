/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.UserAccount.UserAccount;

/**
 *那就只有customer 给 company review
 * @author Jun Xiang
 */
public class ReviewRequest extends WorkRequest {
    private double rate;

    public ReviewRequest(Enterprise enterprise, UserAccount account) {
        super(enterprise, account);
        this.rate = -1;
    }
    
    public double getRate() {
        return this.rate;
    }
    
    public void setRate(double rate) {
        this.rate = rate;
    }
}