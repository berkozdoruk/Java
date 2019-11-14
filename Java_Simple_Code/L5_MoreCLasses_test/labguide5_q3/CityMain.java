/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labguide5_q3;

/**
 *
 * @author Levent
 */
public class CityMain {

    public static void main(String[] args) {
        City c1 = new City("Ankara", "Anatolia", 544500000);
        City c2 = new City("İstanbul", "Asia", 153000000);
        // City c3 = new City ();
        City c4 = new City("İzmir", 563444000);

        c1.display();
        c2.display();
        c4.display();
    }
}
