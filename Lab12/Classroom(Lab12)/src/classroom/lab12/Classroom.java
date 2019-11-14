/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classroom.lab12;

/**
 *
 * @author cemha
 */
public class Classroom {
    protected String name;
    protected int capacity;



    public Classroom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return "Classroom{" + "name=" + name + ", capacity=" + capacity + '}';
    }
    
}
