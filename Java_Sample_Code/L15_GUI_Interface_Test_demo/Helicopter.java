
package labguide15_q2;


public class Helicopter extends Vehicle {

    private int seatNum;
    private boolean autorotation;
    private double grossWeight;

    public Helicopter(int id, String brand, String model, double basePrice, int year, int seatNum, boolean autorotation, double grossWeight) {
        super(id, brand, model, basePrice, year);
        this.seatNum = seatNum;
        this.autorotation = autorotation;
        this.grossWeight = grossWeight;
    }

    public double calculateCost() {
        double cost = basePrice;
        if (autorotation) {
            cost += 3000;
        }

        if (seatNum <= 4) {
            cost += 500;
        } else if (seatNum <= 8) {
            cost += 1000;
        } else if (seatNum <= 12) {
            cost += 1500;
        } else {
            cost += 2000;
        }

        return cost;
    }

    public double calculateMaxSpeed() {
        double speed;

        if (grossWeight <= 2000) {
            speed = 180;
        } else if (grossWeight <= 2500) {
            speed = 120;
        } else {
            speed = 90;
        }

        return speed;
    }

    
    public String toString() {
        return "Helicopter"
                + super.toString()
                + "\nSeat Number: " + seatNum
                + "\nAutorotation: " + autorotation
                + "GrossWeight: " + grossWeight
                + "Max speed: " + calculateMaxSpeed()
                + "Cost: " + calculateCost();
    }

}
