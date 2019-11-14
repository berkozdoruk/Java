package labguide11_q2;

public class Car {
    
    private int id;
    private String brand;
    private String model;
    private double price;
    private static int beginId = 100;
    private static int numOfCar = 0;

    public Car() {
    numOfCar++;
    }

    public boolean findID(int id) {
        if (this.id==id) {
            return true;
        } else {
            return false;
        }
    }
    public Car(String brand, String model, double price) {
        this();
        this.id = beginId++;
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getBeginId() {
        return beginId;
    }

    public static void setBeginId(int beginId) {
        Car.beginId = beginId;
    }

    public static int getNumOfCar() {
        return numOfCar;
    }

    public static void setNumOfCar(int numOfCar) {
        Car.numOfCar = numOfCar;
    }
    
     @Override
    public String toString() {
        return "Car:\n" + 
                "Id: " + id +
                "\nBrand: " + brand +
                "\nModel: " + model +
                "\nPrice: " + price + "$\n";
    }
}
