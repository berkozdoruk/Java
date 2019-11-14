/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom.lab12;

import java.util.ArrayList;

/**
 *
 * @author cemha
 */
public class Lab extends Classroom {
    
    ArrayList <PC> arr=new ArrayList();

    public Lab(String name, int capacity) {
        super(name, capacity);
    }
    public void addPc(PC pc){
    
    arr.add(pc);
    
    }

    @Override
    public String toString() {
        return "Lab{" +super.toString()+ "arr=" + arr + '}';
    }
    
}
