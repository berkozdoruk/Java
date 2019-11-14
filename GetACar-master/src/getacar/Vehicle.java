package getacar;

import javax.swing.JOptionPane;

abstract class Vehicle implements Transaction {
    
    protected String brand;
    protected String model;
    protected String color;
    protected int topSpeed;
    protected int year;
    protected int kilometres;
    protected double price;
    protected boolean isRented;
    protected String licensePlate;
    
    public Vehicle(String brand, String model, String color, int topSpeed, int year, int kilometres, double price, boolean isRented) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;
        this.year = year;
        this.kilometres = kilometres;
        this.price = price;
        this.isRented = isRented;
        licensePlate = "000";
        numOfVehicles++;
    }
    
    public abstract String licensePlate();
    
    protected static int numOfVehicles = 0;
    
    public static int getVehicleNum()
    {
        return numOfVehicles;
    }
    
    @Override
    public String toString()
    {
        return("Brand: " + brand + "\nModel: " + model + "\nColor: " + color + "\nTop Speed: " + topSpeed + "\nYear: " + year + "\nKilometres: " + kilometres + "\nPrice: " + price + "\nRented: " + (isRented ? "Yes": "No") + "\n");
    }
    
    @Override
    public void buy(Vehicle v)
    {
        JOptionPane.showMessageDialog(null, "Vehicle with license plate " + v.getLicensePlate() + " bought.");
    }
    
    @Override
    public void sell(Vehicle v)
    {
        JOptionPane.showMessageDialog(null, "Vehicle with license plate " + v.getLicensePlate() + " sold.");
    }

    public String getLicensePlate() {
        return licensePlate;
    }
    
    
}
