/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L3;

import java.util.Scanner;

/**
 *
 * @author Levent
 */
public class LabGuide3_Q1 {

   public static void printDirection(int degree)
{
	System.out.println("degree: "+degree);
	if (degree > 315 || degree < 45)
		System.out.println("NORTH\n");
	else if (degree > 225)
		System.out.println("WEST\n");
	else if (degree > 135)
		System.out.println("SOUTH\n");
	else
		System.out.println("EAST\n");
}

    public static void main(String[] args) {
        int	degrees;
        Scanner sc=new Scanner(System.in);
	do
	{
		System.out.println("Compass Reading? ");
		degrees=sc.nextInt();;

		if (degrees > 0)
			printDirection(degrees % 360);
	} while (degrees >= 0);

    }
    
}
