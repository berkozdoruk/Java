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
public abstract class AcademicUnits  implements Binterface{
    
    protected String FullName;
    protected String deapertmentName;
    protected int idNumber;
   

    public AcademicUnits(String FullName, String deapertmentName, int idNumber) {
        this.FullName = FullName;
        this.deapertmentName = deapertmentName;
        this.idNumber = idNumber;
     
    }

    

    public String getFullName() {
        return FullName;
    }

    public String getDeapertmentName() {
        return deapertmentName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    @Override
    public String toString() {
        return "Name and Surname" + FullName + "Deapertment Name:" + deapertmentName + 
                "Id Number:" + idNumber;
    }
    
    
    
    
    
    
    
    
}
