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
public class LabGuide3_Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Initialization
        double flowers[] = {3.94, 2.50, 12.98, 1.49, 8.87};
        double totals[] = new double[5];

        int floid, quantity;
        System.out.println("Enter the flower number (or 0 to stop):");
        floid = sc.nextInt();

        //prdno 0 to stop while loop
        while (floid != 0) {
            System.out.println("Enter the quantity for flower " + floid + ":");
            quantity = sc.nextInt();

            totals[floid - 1] = flowers[floid - 1] * quantity;

            System.out.println("Enter the flower number (or 0 to stop):");
            floid = sc.nextInt();

        }

        //Print the total of all products
        String output = " \nTotal of all flowers are;\n";
        for (int i = 0; i < 5; i++) {
            output += "Flower " + (i + 1) + " : " + totals[i] + "\n";
        }
        System.out.println(output);
    }

}
