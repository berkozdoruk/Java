
package labguide11_q2;


import java.util.Scanner;

public class Vehicle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        VehicleSys.addVehicle(new Car("Ford", "Focus", 32000));
        VehicleSys.addVehicle(new Truck("Volvo", "Ferrymasters", 50000));
        VehicleSys.addVehicle(new Truck("Scania", "Peeters", 30000));
        VehicleSys.addVehicle(new Car("Toyota", "Corolla", 25000));
        System.out.println("4 vehicle is added to array list\n");
        System.out.println("ArrayList Content:\n");

        System.out.println(VehicleSys.getAllList());

        Scanner s = new Scanner(System.in);
        String brand, model;
        double price;
        System.out.print("How many vehicle you are going to enter?");
        int numVehicle = s.nextInt();
        for (int j = 0; j < numVehicle; j++) {
            s.skip("\n");
            System.out.print("Type of vehicle Car/Truck? ");
            String type = s.nextLine();

            System.out.println("Enter brand: ");
            brand = s.next();
            System.out.println("Enter model: ");
            model = s.next();
            System.out.println("Enter price: ");
            price = s.nextDouble();
            if (type.equalsIgnoreCase("car")) {
                VehicleSys.addVehicle(new Car(brand, model, price));
            } else {
                VehicleSys.addVehicle(new Truck(brand, model, price));
            }
        }

        System.out.println("\nGet the counts of objects inside of The ArrayList");
        int count_c = Integer.parseInt(VehicleSys.showTotalCar());
        int count_t = Integer.parseInt(VehicleSys.showTotalTruck());
        System.out.println("Number of car objects: " + count_c);
        System.out.println("Number of truck objects: " + count_t);
        
        System.out.println("\nRemove truck");
        System.out.println("Enter the id to remove Truck");
        int deletedId = s.nextInt();
        Truck t = VehicleSys.removeTruck(deletedId);
        String out = t.getBrand()+" truck is removed!!";
        if (t == null) {
            out = "Could not remove the truck\n";
        }
        System.out.println(out);
        
        System.out.println("Search Car");
        System.out.println("Enter the id of searched car");
        int searchedId = s.nextInt();
        out = "";
        Car c = VehicleSys.searchCar(searchedId);
        out += "Searched Car's info:\n" + c.toString();
        if (c == null) {
            out = "Could not find the car you looking!!";
        }

        System.out.println(out + "\n\n");
        
        System.out.println("Car arraylist: \n" + VehicleSys.getCarList().toString());
    }

}
