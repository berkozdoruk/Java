
package labguide12_q2;

import java.util.Scanner;

public class AnimalMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mammal mammal;
        Reptile reptile;
        Mollusc mollusc;
        int age, id;
        double weight;
        String gender, habitat, nutrition, bloodType;
        boolean fryCare, chitin;
        Scanner inputStr = new Scanner(System.in);

        String animalType;

        do {
            System.out.println("Which type of animal do you want to add?(Write Stop to Stop)");
            System.out.println("(Vertebrates - Invertebrates)");
            animalType = inputStr.next();
            if (!animalType.equalsIgnoreCase("stop")) {
                if (animalType.equalsIgnoreCase("Vertebrates")) {
                    System.out.print("Which type of animal do you want to add?\n (Mammal / Reptile)");
                    String typ = inputStr.next();
                    switch (typ) {
                        case "Mammal":
                            System.out.println("\n***Enter the Info of a Mammal*** ");
                            System.out.print("Enter ID: ");
                            id = inputStr.nextInt();
                            System.out.print("Enter age: ");
                            age = inputStr.nextInt();
                            System.out.print("Enter the gender of Mammal(Female/Male): ");
                            gender = inputStr.next();
                            System.out.print("Enter the weight:");
                            weight = inputStr.nextDouble();
                            System.out.print("Enter nutrition type(Carnivorous/Herbivorous): ");
                            nutrition = inputStr.next();
                            System.out.print("Does the animal have fryCare: ");
                            fryCare = inputStr.nextBoolean();

                            mammal = new Mammal(fryCare, nutrition, id, age, gender, weight);
                            AnimalList.addAnimal((Animal)mammal);
                            System.out.println("Mammal is Added");
                            break;
                        case "Reptile":
                            System.out.println("\n***Enter the Info of Reptile*** ");
                            System.out.print("Enter ID: ");
                            id = inputStr.nextInt();
                            System.out.print("Enter age: ");
                            age = inputStr.nextInt();
                            System.out.print("Enter the gender of Reptile(Female/Male): ");
                            gender = inputStr.next();
                            System.out.print("Enter the weight: ");
                            weight = inputStr.nextDouble();
                            System.out.print("Enter nutrition type(Carnivorous/Herbivorous): ");
                            nutrition = inputStr.next();
                            System.out.print("What is the blood type(warm/cold blooded): ");
                            bloodType = inputStr.next();

                            reptile = new Reptile(bloodType, nutrition, id, age, gender, weight);
                            AnimalList.addAnimal(reptile);
                            System.out.println("Reptile is Added");
                            break;
                    }

                } else if (animalType.equalsIgnoreCase("Invertebrates")) {
                    System.out.println("\n***Enter the Info of Mollusc*** ");
                    System.out.print("Enter ID: ");
                    id = inputStr.nextInt();
                    System.out.print("Enter age: ");
                    age = inputStr.nextInt();
                    System.out.print("Enter the gender of Mollusc:(Female/Male/Hermaphrodite)");
                    gender = inputStr.next();
                    System.out.println("Enter the weight: ");
                    weight = inputStr.nextDouble();
                    System.out.println("Does the animal has chitin: ");
                    chitin = inputStr.nextBoolean();
                    System.out.println("Enter the habitat: ");
                    habitat = inputStr.next();
                    mollusc = new Mollusc(habitat, chitin, id, age, gender, weight);
                    AnimalList.addAnimal(mollusc);
                    System.out.println("Mollusc is Added");
                } 
            }
        } while (!animalType.equalsIgnoreCase("stop"));

        //Display animals
        System.out.println("  Vertebrate / Invertebrate / All\nEnter your choice to see");
        String displayTyp = inputStr.next();
        switch (displayTyp) {
            case "Vertebrate":
                System.out.println("Vertebrates");
                System.out.println(AnimalList.getAllVertebrates().toString());
                break;
            case "Invertebrate":
                System.out.println("Invertebrates");
                System.out.println(AnimalList.getAllInvertebrates().toString());
            case "All":
                System.out.println("All Animals");
                System.out.println(AnimalList.getAllAnimals().toString());
        }

        //remove
        System.out.println("\n\nEnter the ID of the object to REMOVE.......");
        System.out.print("Remove by ID: ");
        id = inputStr.nextInt();

        if (AnimalList.removeAnimal(id)) {
            System.out.println("The object that matches the criteria were successfully removed from the list.");
        } else {
            System.out.println("Error: No such object was in the list.");
        }

        //search
        System.out.println("\n\nEnter the ID of the objects to SEARCH.......");
        System.out.print("search by ID: ");
        id = inputStr.nextInt();

        if (AnimalList.searchAnimal(id) == null) {
            System.out.println("There is no such ID in the list..!");
        } else {
            AnimalList.searchAnimal(id).getClass();
            System.out.println("The ID number: " + id + " has been found in the list.\nLooking for:"
                    + AnimalList.searchAnimal(id).toString());
        }

        //Display all animals
        System.out.println("Animlas in the ArrayList:");
        for (int j = 0; j < AnimalList.getAllAnimals().size(); j++) {
            System.out.println(AnimalList.getAllAnimals().get(j).toString());
        }

    }

}
