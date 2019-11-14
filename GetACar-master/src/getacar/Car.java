package getacar;

import java.util.Random;

public class Car extends Vehicle {
    
    public String type;
    
    public Car(String brand, String model, String color, int topSpeed, int year, int kilometres, double price, boolean isRented, String type)
    {
        super(brand, model, color, topSpeed, year, kilometres, price, isRented);
        this.type = type;
        licensePlate = licensePlate();
    }
    
    @Override
    public String licensePlate()
    {
        StringBuilder s = new StringBuilder();
        Random r = new Random();
        for (int i = 0; i < 3; i++) {
            char ch = (char)(r.nextInt(25) + 1 + 'A');
            s.append(ch);
    }
    
        for (int i = 0; i < 4; i++) {
            int digit = r.nextInt(9) + 1;
            s.append(digit);
    }
        return s.toString();
    }
    
    @Override
    public String toString()
    {
        return(super.toString() + "Car Type: " + type  + "\nLicense Plate: " + licensePlate + "\n");
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    
    
    
}
