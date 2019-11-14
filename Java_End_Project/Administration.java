/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprocjt;

/**
 *
 * @author Levent Durdali
 * @author Tunjay Taghiyev
 */
public abstract class Administration implements Binterface{
    
    private String FullName;
    private int appointyear;

    public Administration(String FullName, int appointyear) {
        this.FullName = FullName;
        this.appointyear = appointyear;
    }

    @Override
    public String toString() {
        return "Administration{" + "FullName=" + FullName + ", appointyear=" + appointyear + '}';
    }

    public String getFullName() {
        return FullName;
    }

    public int getAppointyear() {
        return appointyear;
    }

    
    
    
   

    
    
    
    
    
    
}
