
package labguide13_q1;

import java.util.Scanner;

public class LabGuide13_Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Manager m = new Manager(111, "Jane Doe", "F", 38, "Textile", 2500);
        String flag;
        Certificate c = new Certificate();
        c.getInput();
        m.addCertificate(c);
        System.out.println("Do you want to add another certificate? (Y/N) ");
        flag = sc.next();

        while (flag.equalsIgnoreCase("Y")) {
            c = new Certificate();
            c.getInput();
            m.addCertificate(c);

            System.out.println("Do you want to add another certificate? (Y/N) ");
            flag = sc.next();
        }

        System.out.println(m.toString());
    }

}
