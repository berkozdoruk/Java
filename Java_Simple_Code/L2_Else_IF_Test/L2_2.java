/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2_2;

import java.util.Scanner;

/**
 *
 * @author Levent
 */
public class L2_2 {

  
    public static void main(String[] args) {
        double hw1,hw2,quiz1,quiz2,midterm,final_grd,avg;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter two assignments:");
      hw1 = sc.nextInt();
      hw2 = sc.nextInt();
      
      System.out.println("Enter two quiz grades:");
      quiz1 = sc.nextInt();
      quiz2 = sc.nextInt();
      
      System.out.println("Enter midterm:");
      midterm = sc.nextInt();
      
      System.out.println("Enter final:");
      final_grd = sc.nextInt();
      
      avg = (hw1+hw2)/2*0.10 + (quiz1+quiz2)/2*0.2 + midterm*0.25 + final_grd*0.45;

      System.out.println("\nAverage is "+avg+" letter grade is ");
	
	if(avg>=80)
		System.out.println("A");
	else if(avg>=70)
		System.out.println("B");
	else if(avg>=60)
		System.out.println("C");
	else if(avg>=50)
		System.out.println("D");
	else
		System.out.println("F");
      
    
    }
    
}
