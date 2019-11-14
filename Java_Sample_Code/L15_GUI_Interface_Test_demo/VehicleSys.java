
package labguide15_q2;

import java.util.ArrayList;


public class VehicleSys {

    public static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

    public static boolean addVheicle(Vehicle v) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId() == v.getId()) {
                return false;
            }
        }
        vehicles.add(v);
        return true;
    }

    public static boolean removeVehicle(int id) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId() == id) {
                vehicles.remove(i);
            }
            return true;
        }
        return false;
    }

    public static Vehicle searchVehicle(int id) {
        for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).getId() == id) {
                return vehicles.get(i);
            }
        }
        return null;
    }

    public static String getAllVehicle() {
        String res = "";
        for (Vehicle v : vehicles) {
            res += v.toString();
        }
        return res;
    }

    public static String getSelectedVehicle(String type) {
        String res = "";

        switch (type) {
            case "Car":
                for (Vehicle v : vehicles) {
                    if (v instanceof Car) {
                        res += v.toString();
                    }
                }
                break;
            case "Helicopter":
                for (Vehicle v : vehicles) {
                    if (v instanceof Helicopter) {
                        res += v.toString();
                    }
                }
                break;
            case "Ship":
                for (Vehicle v : vehicles) {
                    if (v instanceof Ship) {
                        res += v.toString();
                    }
                }
                break;
        }
        return res;
    }
}
