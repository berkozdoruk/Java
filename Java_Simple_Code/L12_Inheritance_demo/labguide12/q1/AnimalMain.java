
package labguide12.q1;

import java.util.Scanner;


public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Duck duck;
        Zebra zebra;
        int age, id, stripeCount;
        String gender, beakColor;
        double weight;

        Scanner input = new Scanner(System.in);
        String animalType;

        do {
            System.out.println("Which animal do you want to add?(Write Stop to Stop)");
            System.out.println("(Duck - Zebra)");
            animalType = input.next();
            //input.skip("\n");
            if (!animalType.equalsIgnoreCase("stop")) {
                if (animalType.equalsIgnoreCase("duck")) {
                    System.out.println("\n***Enter the Info of Duck*** ");
                    System.out.print("Enter ID: ");
                    id = input.nextInt();
                    System.out.print("Enter age: ");
                    age = input.nextInt();
                    System.out.print("Enter the gender of duck:(Female/Male)");
                    gender = input.next();
                    input.skip("\n");
                    System.out.print("Enter the weight: ");
                    weight = input.nextDouble();
                    System.out.print("Enter beak color: ");
                    beakColor = input.next();
                    duck = new Duck(beakColor, id, age, gender, weight);
                    AnimalList.addAnimal(duck);

                } else if (animalType.equalsIgnoreCase("zebra")) {
                    System.out.println("\n***Enter the Info of Zebra*** ");
                    System.out.print("Enter ID: ");
                    id = input.nextInt();
                    System.out.print("Enter age: ");
                    age = input.nextInt();
                    System.out.print("Enter the gender of zebra:(Female/Male)");
                    gender = input.next();
                    System.out.print("Enter the weight: ");
                    weight = input.nextDouble();
                    System.out.print("Enter stripe count: ");
                    stripeCount = input.nextInt();
                    zebra = new Zebra(stripeCount, id, age, gender, weight);
                    AnimalList.addAnimal(zebra);
                }
            }
        } while (!animalType.equalsIgnoreCase("stop"));
        //Display all animals
        for (int j = 0; j < AnimalList.getAllAnimals().size(); j++) {
            System.out.println(AnimalList.getAllAnimals().get(j).toString());
        }

        //remove
        System.out.println("\n\nEnter the ID of the animal to REMOVE.......");
        System.out.print("Remove by ID: ");
        id = input.nextInt();

        if (AnimalList.removeAnimal(id)) {
            System.out.println("The object that matches the criteria were successfully removed from the list.");
        } else {
            System.out.println("Error: No such object was in the list.");
        }

        //search
        System.out.println("\n\nEnter the ID of the objects to SEARCH.......");
        System.out.print("Search by ID: ");
        id = input.nextInt();

        if (AnimalList.searchAnimal(id) == null) {
            System.out.println("There is no such ID in the list..!");
        } else {
            AnimalList.searchAnimal(id).getClass();
            System.out.println("The ID number: " + id + " has been found in the list.");
        }

        //Display all animals
        for (int j = 0; j < AnimalList.getAllAnimals().size(); j++) {
            System.out.println(AnimalList.getAllAnimals().get(j).toString());
        }

    }
}
