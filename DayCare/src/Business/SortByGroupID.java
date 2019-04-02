/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Comparator;

/**
 *
 * @author mr.wu
 */
public class SortByGroupID implements Comparator<Student> {

    public SortByGroupID() {
        super();
    }
    @Override
    public int compare(Student o1, Student o2) {
        return Integer.valueOf(o1.getGroupincluing().getGroupID()).compareTo(Integer.valueOf(o2.getGroupincluing().getGroupID()));
        
    }
    
    
}
