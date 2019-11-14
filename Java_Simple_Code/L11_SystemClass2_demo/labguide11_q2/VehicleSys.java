
package labguide11_q2;

import java.util.ArrayList;

public class VehicleSys {

    public static ArrayList allVehicle = new ArrayList();

    public static boolean addVehicle(Object obj) {
        if (!(obj instanceof Car || obj instanceof Truck)) {
            return false;
        }

        allVehicle.add(obj);
        return true;
    }

    public static String getAllList() {
        String result = "All ArrayList\n";
        for (int i = 0; i < allVehicle.size(); i++) {
            result += allVehicle.get(i).toString();
        }
        return result;
    }

   
    public static Car searchCar(int item_id) {
        ArrayList<Car> allcars = getCarList();
        for (int i = 0; i < allcars.size(); i++) {
            Car tempCAR = allcars.get(i);
            if (tempCAR.findID(item_id)) {
                return tempCAR;
            }
        }
        return null;
    }

    public static ArrayList<Car> getCarList() {
        ArrayList<Car> cars = new ArrayList();

        for (int i = 0; i < allVehicle.size(); i++) {
            if (allVehicle.get(i) instanceof Car) {
                cars.add((Car) allVehicle.get(i));
            }
        }
        return cars;
    }



    public static Truck removeTruck(int id) {
        Truck truck=null;
        for (int i = 0; i < allVehicle.size(); i++) {
            if (allVehicle.get(i) instanceof Truck) {
                 truck = (Truck) allVehicle.get(i);
                if (truck.findID(id)) {
                    allVehicle.remove(i);
                    Truck.setNumOfTruck(Truck.getNumOfTruck() - 1);
                    return truck;
                }
                truck=null;
            }
        }
        return truck;
    }



    public static String showTotalTruck() {
        return "" + Truck.getNumOfTruck();
    }

    public static String showTotalCar() {
        return "" + Car.getNumOfCar();
    }
}
