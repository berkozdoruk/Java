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
public class Cheese  extends Probiotics{
    private int numofvitamins;
    private int numofminerals;
    private double milkpercentage;
    private double calsium;

    public Cheese(int numofvitamins, int numofminerals, double milkpercentage, double calsium, String name, String benefits, String risks, String type) {
        super(name, benefits, risks, type);
        this.numofvitamins = numofvitamins;
        this.numofminerals = numofminerals;
        this.milkpercentage = milkpercentage;
        this.calsium = calsium;
    }

    public void getInput(){
    super.getInput();
    Scanner input=new Scanner(System.in);
        System.out.println("Enter number of Vitamins:");
        numofvitamins=input.nextInt();
        System.out.println("Enter number of Minerals:");
        numofminerals=input.nextInt();
        System.out.println("Enter milk Percentage:");
        milkpercentage=input.nextInt();
        
        
                
                
                
        
        
    
    } 
    
}
