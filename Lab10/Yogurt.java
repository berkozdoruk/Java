/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10q3;
import java.util.Scanner;

/**
 *
 * @author berkoz
 */
public class Yogurt  extends Probiotics{
    private String brand;
    private int numofbacteria;

    public Yogurt() {
    }



    public Yogurt(String brand, int numofbacteria, String name, String benefits, String risks, String type) {
        super(name, benefits, risks, type);
        this.brand = brand;
        this.numofbacteria = numofbacteria;
    }
    public void getInput(){
    super.getInput();
    Scanner input=new Scanner(System.in);
        System.out.println("Enter yogurt Brand:");
        brand=input.nextLine();
        System.out.println("Enter Number Of Bacteria:");
        numofbacteria=input.nextInt();
    
    }

    @Override
    public String toString() {
        return "Yogurt{" +super.toString()+ "brand=" + brand + ", numofbacteria=" + numofbacteria + '}';
    }
    
    
}
