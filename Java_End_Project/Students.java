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
public class Students extends AcademicUnits{
    
    private double cgpa;
    private String courses;
    private int gradyear;
    private static int numberofStu=0;

    public static int getNumberofStu() {
        return numberofStu;
    }

    public void ShowSystemRegistrationDate(){
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
	Date date = new Date();
	System.out.println(dateFormat.format(date)); //2018/12/12 12:08:43
    }
    
    public Students(double cgpa, String courses, int gradyear, String FullName, String deapertmentName, int idNumber) {
        super(FullName, deapertmentName, idNumber);
        this.cgpa = cgpa;
        this.courses = courses;
        this.gradyear = gradyear;
        numberofStu++;
    }

    @Override
    public String toString() {
        return "Students{" + "cgpa=" + cgpa + ", courses=" + courses + ", gradyear=" + gradyear + '}';
    }
    
    

    
    
    
    
}
