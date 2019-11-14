package getacar;

import java.util.ArrayList;

public class VehicleSys {
    
    private static ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
    
        public static boolean addVehicle (Vehicle v) 
        {
         for (Vehicle i : vehicles)
         {
                if ((i.getLicensePlate().equals(v.getLicensePlate())))
                {
                    return false;
                }
         }
         vehicles.add(v);
         return true;
        }
    
    public static boolean removeVehicle (String licensePlate)
    {
         for (int i = 0; i < vehicles.size(); i++) {
            if (vehicles.get(i).licensePlate.equals(licensePlate)) {
                return vehicles.remove(vehicles.get(i));
            }
        }
        return false;       
    }
    
    public static Vehicle searchVehicle (String licensePlate)
    {
        for (int i = 0; i < vehicles.size(); i++) 
            if ((vehicles.get(i).licensePlate.equals(licensePlate)))
                return vehicles.get(i);
        return null;
        
    }
    
    public static String getAllVehicles()
    {
        String res = "";
        for (Vehicle i : vehicles)
            res += i.toString() + "\n";
        return res;
    }
    
    public static String getAllBuses()
    {
        String res = "";
        for (Vehicle i : vehicles)
            if (i instanceof Bus)
                res += i.toString() + "\n";
        return res;
    }
    
    
    public static String getAllCars()
    {
        String res = "";
        for (Vehicle i : vehicles)
            if (i instanceof Car)
                res += i.toString() + "\n";
        return res;
    }
    
    public static String getAllMotorcycles()
    {
        String res = "";
        for (Vehicle i : vehicles)
            if (i instanceof Motorcycle)
                res += i.toString() + "\n";
        return res;
    }
        
        
       
}
