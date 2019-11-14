/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labguide5_q2;

/**
 *
 * @author Levent
 * 
 */
public class PatientMain {

    public static void main(String[] args) {
        Patient p1 = new Patient();
        Patient p2 = new Patient("Jane Doe", 25, "Stomach");
        Patient p3 = new Patient("George Brown");
        Patient p4 = new Patient("Joe Black", 45);

        p1.display();
        p2.display();
        p3.display();
        p4.display();
    }
}
