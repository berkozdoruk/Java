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
public class City {

    private String name;
    private String region;
    private int population;

    public City(String name, String region, int population) {
        this.name = name;
        this.population = population;
        this.region = region;
    }

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public City(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("***************\n Cities' Information\n");
        System.out.println(name + ", " + region + ", " + population);
    }

}
