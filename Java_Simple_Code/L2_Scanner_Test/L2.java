
package L2;

import java.util.Scanner;

/**
 *
 * @author Levent
 */
public class L2 {

    public static void main(String[] args) {
 int birth1,death1,birth2,death2,year1,year2;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the birth year of first person:");
        birth1 = sc.nextInt();
        
        System.out.println("Enter the death year of first person:");
        death1 = sc.nextInt();
        
        year1 = death1 - birth1;
        System.out.println("Enter the birth year of second person:");
        birth2 = sc.nextInt();
        
        System.out.println("Enter the death year of second person:");
        death2 = sc.nextInt();
        year2 = death2 - birth2;
        
        if(year1 > year2)
            System.out.println("First person is lived longer than second");
        else
            System.out.println("First person is lived shorter than second");    }
    
}
