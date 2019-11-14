
package labguide15_q2;


public class Ship extends Vehicle {

    private double tonnage;
    private int passangerCount;
    private double length;

    public Ship(int id, String brand, String model, double basePrice, int year, double tonnage, int passangerCount, double length) {
        super(id, brand, model, basePrice, year);
        this.tonnage = tonnage;
        this.passangerCount = passangerCount;
        this.length = length;
    }

public double calculateCost() {
        double cost = basePrice;
        if (tonnage >12000) {
            cost += 1500;
        }

        if (passangerCount <= 20) {
            cost += 1000;
        } else if (passangerCount <= 40) {
            cost += 4000;
        } else  {
            cost += 8000;
        }

        return cost;
    }

    public double calculateMaxSpeed() {
        double speed;

        if (length <= 5) {
            speed = 30;
        } else if (length <= 10) {
            speed = 25;
        } else {
            speed = 18;
        }

        return speed;
    }
    public String toString() {
        return "Ship "
                + super.toString()
                + "\nTonnage" + tonnage
                + "\nPassanger Count: " + passangerCount
                + "\nLength: " + length
                + "Max speed: " + calculateMaxSpeed()
                + "Cost: " + calculateCost();
    }

}
