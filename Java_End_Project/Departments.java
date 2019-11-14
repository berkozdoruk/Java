/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprocjt;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Levent Durdali
 * @author Tunjay Taghiyev
 */

public class Departments extends Administration{
    private boolean chair;
    private boolean deputy;

    public Departments(boolean chair, boolean deputy, String FullName, int appointyear) {
        super(FullName, appointyear);
        this.chair = chair;
        this.deputy = deputy;
    }

     public void ShowSystemRegistrationDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); //2018/12/12 12:08:43
    }
    
    @Override
    public String toString() {
        return "Departments{" + "chair=" + chair + ", deputy=" + deputy + '}';
    }

    public boolean isChair() {
        return chair;
    }

    public boolean isDeputy() {
        return deputy;
    }

   

    
    
}
