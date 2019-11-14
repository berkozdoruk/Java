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
public class Patient {

    private String name;
    private int age;
    private String complaint;

    public Patient() {
        name = "No Name";
        age = 0;
        complaint = "No Complaint";
    }

    public Patient(String name, int age, String complaint) {
        this.name = name;
        this.age = age;
        this.complaint = complaint;
    }

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Patient(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name + ", " + age + ", " + complaint);
    }
}
