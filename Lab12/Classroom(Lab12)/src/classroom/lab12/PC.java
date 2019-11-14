/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom.lab12;
import java.util.Scanner;
/**
 *
 * @author cemha
 */
public class PC {
    private int number;
    private String brand;

    public PC() {
    }

    public PC(int number, String brand) {
        this.number = number;
        this.brand = brand;
    }
    public void getInput(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter pc info:");
        System.out.println("Enter pc number:");
        number=input.nextInt();
        System.out.println("Enter pc brand:");
        brand=input.next();
        
        
    
    
    
    
    }
    
    

    @Override
    public String toString() {
        return "PC{" + "number=" + number + ", brand=" + brand + '}';
    }
    
}
