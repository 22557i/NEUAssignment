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
public class SortByAge implements  Comparator<Student>{
     public SortByAge() {
        super();
    }
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
        
    }
}
