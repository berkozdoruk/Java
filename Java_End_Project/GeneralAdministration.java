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

public class GeneralAdministration extends Administration{
    
    private String position;

    public GeneralAdministration(String position, String FullName, int appointyear) {
        super(FullName, appointyear);
        this.position = position;
    }

     public void ShowSystemRegistrationDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); //2018/12/12 12:08:43
    }
    
    @Override
    public String toString() {
        return "GeneralAdministration{" + "position=" + position + '}';
    }

    public String getPosition() {
        return position;
    }

    

   

    
    
    
}
