/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author raunak
 */
public class WorkQueue {
    
    public LinkedList<WorkRequest> workRequestList;

    public WorkQueue() {
        workRequestList = new LinkedList<>();
    }

    public LinkedList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public OrderRequest getOderById(String id) {
        for (WorkRequest wr:this.workRequestList) {
            OrderRequest or = (OrderRequest)wr;
            if(or.getId().equals(id)) {
                return or;
            }
        }
        return null;
    }

    public void setWorkRequestList(LinkedList<WorkRequest> workRequestList) {
        this.workRequestList = workRequestList;
    }
    
}