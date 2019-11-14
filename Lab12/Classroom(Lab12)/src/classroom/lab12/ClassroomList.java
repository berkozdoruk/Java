/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom.lab12;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author cemha
 */
public class ClassroomList {
    public static ArrayList<Classroom> arr=new ArrayList();
    public static void addClassroom(){
        System.out.println("LAB/CLASSROOM/ROOMS:");
        Scanner input=new Scanner(System.in);
        String type=input.next();
       
        while(!type.equalsIgnoreCase("STOP"))
        {
        if(type.equalsIgnoreCase("CLASSROOM"))
        {
            System.out.println("Enter classroom name:");
            String classname=input.next();
            
            System.out.println("Enter classroom capacity:");
            int cap=input.nextInt();
            
            Classroom c1=new Classroom(classname,cap);
            arr.add(c1);
        
        }
        else if(type.equalsIgnoreCase("ROOMS")){
        
            System.out.println("Enter Room name:");
            String roomname=input.next();
            
            System.out.println("Enter Room Capacity:");
            int cap=input.nextInt();
            
            System.out.println("ROOM number of ınventory:");
            int numofınv=input.nextInt();
            
            Rooms c2=new Rooms(numofınv,roomname,cap);
            arr.add(c2);
        
        
        }
        else{
            System.out.println("Enter Lab name:");
            String name=input.next();
            
            System.out.println("Enter Lab capacity");
            int cap=input.nextInt();
            Lab temp=new Lab(name,cap);
            System.out.println("Enter number of pc do you want to add" +name);
            int n=input.nextInt();
            
            for(int i=0;i<n;i++){
            PC pc=new PC();
            pc.getInput();
            temp.addPc(pc);
            
            
            }
            arr.add(temp);
  
        
        }
         System.out.println("LAB/CLASSROOM/ROOMS:");
          type=input.next();
        
        }
        
        
    
    
    }
    public static boolean removeClassroom(String name){
       
        for (int i = 0; i < arr.size(); i++) {
            String tempname = arr.get(i).getName();
            if(tempname.equals(name))
            {
                arr.remove(i);  
                return true;
            }
        }
        return false;
       
        
        
    
    
    }
    public static Classroom searchClassroom(String name){
             for (int i = 0; i < arr.size(); i++) {
            String tempname = arr.get(i).getName();
            if(tempname.equals(name))
            {
               return arr.get(i);
            }
        }
        return null;
        
        
        
    
    
    }
    public static void getTotalCapacity(){
    
    
    
    }
    public static void display(){
    for(int i=0;i<arr.size();i++){
    
        System.out.println("Display"+arr.get(i).toString());
    
    
    }
    
    
    }
}
