
package labguide15_q2;

public abstract class Vehicle implements VehicleInterface {
    protected int id;
    protected String brand;
    protected String model;
    protected double basePrice;
    protected int year;

    public Vehicle(int id, String brand, String model, double basePrice, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.basePrice = basePrice;
        this.year = year;
    }

    public int getId() {
        return id;
    }

   public abstract double calculateCost();
   
    public String toString() {
        return "Vehicle\n" + 
                "Id: " + id +
                "Brand=: " + brand +
                "Model: " + model +
                "Base Price=: " + basePrice + "$"+
                "Year: " + year;
    }
    
    
  
    
    
}
