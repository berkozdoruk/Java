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
public class Probiotics {
    protected String name;
    protected String benefits;
    protected String risks;
    protected String type;

    public Probiotics() {
    }

    public Probiotics(String name, String benefits, String risks, String type) {
        this.name = name;
        this.benefits = benefits;
        this.risks = risks;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Probiotics{" + "name=" + name + ", benefits=" + benefits + ", risks=" + risks + ", type=" + type + '}';
    }
    public void getInput(){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter name:");
        name=input.nextLine();
        
        System.out.println("Enter Benefits:");
        benefits=input.nextLine();
        
        System.out.println("Enter Risks:");
        risks=input.nextLine();
        
        System.out.println("Enter Type:");
        type=input.nextLine();
        
        
        
        
    
    
    
    }
    
}
