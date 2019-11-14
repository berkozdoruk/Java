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
public class ClassroomMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        ClassroomList.addClassroom();
        System.out.println("Content of");
        ClassroomList.display();
        System.out.println("Enter Classroom Name to Delete:");
        String deleteclass=input.next();
        
        if(ClassroomList.removeClassroom(deleteclass)){
            System.out.println(deleteclass+ "is deleted");
        
        }
        else
            System.out.println(deleteclass+" could not found");
        
        System.out.println("Enter classroom name to search:");
        String searchname=input.next();
        
        System.out.println("Here is the classroom you search");
        
        Classroom room=ClassroomList.searchClassroom(searchname);
        System.out.println(room.toString());
        
        
    }
    
}

