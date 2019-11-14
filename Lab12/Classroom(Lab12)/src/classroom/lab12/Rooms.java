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
public class Rooms extends Classroom{
    private int numOfInventory;

    public Rooms(int numOfInventory, String name, int capacity) {
        super(name, capacity);
        this.numOfInventory = numOfInventory;
    }



    @Override
    public String toString() {
        return "Rooms{" +super.toString()+ "numOfInventory=" + numOfInventory + '}';
    }
    
    
}
