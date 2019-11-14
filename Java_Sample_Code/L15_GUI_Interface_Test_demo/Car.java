
package labguide15_q2;


public class Car extends Vehicle {

    private String transmissionType;
    private String fuelType;
    private double coefficient;
    private double power;
    private double area;

    public Car(int id, String brand, String model, double basePrice, int year, String transmissionType, String fuelType, double coefficient, double power, double area) {
        super(id, brand, model, basePrice, year);
        this.transmissionType = transmissionType;
        this.fuelType = fuelType;
        this.coefficient = coefficient;
        this.power = power;
        this.area = area;
    }

    public double calculateCost() {
        double cost = basePrice;
        if (transmissionType.equalsIgnoreCase("Automatic")) {
            cost += 10000;
        }
        if (fuelType.equalsIgnoreCase("Diesel")) {
            cost += 20000;
        }
        return cost;
    }

    public double calculateMaxSpeed() {
       
        return (2 * coefficient / (power * 1.25 * area));
    }

  
    public String toString() {
        return "Car\n"
                + super.toString()
                + "\nTransmission Type: " + transmissionType
                + "\nFuel Type: " + fuelType
                + "\nCoefficient: " + coefficient
                + "\nPower: " + power
                + "\nArea:" + area
                + "\nMax speed: " + calculateMaxSpeed()
                + "\nCost: " + calculateCost();
    }

}
