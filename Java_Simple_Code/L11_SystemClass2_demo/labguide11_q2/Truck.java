package labguide11_q2;

public class Truck {

    private int id;
    private String brand;
    private String model;
    private double price;
    private static int beginId = 100;
    private static int numOfTruck = 0;

    public Truck() {
        numOfTruck++;
    }

    public boolean findID(int id) {
        if (this.id == id) {
            return true;
        } else {
            return false;
        }
    }

    public Truck(String brand, String model, double price) {
        this();
        this.id = beginId++;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setBeginId(int beginId) {
        Truck.beginId = beginId;
    }

    public static void setNumOfTruck(int numOfTruck) {
        Truck.numOfTruck = numOfTruck;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public static int getBeginId() {
        return beginId;
    }

    public static int getNumOfTruck() {
        return numOfTruck;
    }

    @Override
    public String toString() {
        return "Truck:\n"
                + "Id: " + id
                + "\nBrand: " + brand
                + "\nModel: " + model
                + "\nPrice: " + price + "$";
    }

}
