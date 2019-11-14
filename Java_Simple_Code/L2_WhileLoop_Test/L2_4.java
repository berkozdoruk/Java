/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L2_4;

import java.util.Scanner;

/**
 *
 * @author Levent
 */
public class L2_4 {

  
    public static void main(String[] args) {
        int num,max,min;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a number or -1 to stop:");
        num = sc.nextInt();
        max = num;
        min = num;
        while(num != -1)
        {
            if(num > max)
                max = num;
            
            if(num < min)
                min = num;
            
            num = sc.nextInt();
            
        }
        
        System.out.println("Maximum of these numbers: "+max);
        System.out.println("Minimum of these numbers: "+min);    
    }
    
}
