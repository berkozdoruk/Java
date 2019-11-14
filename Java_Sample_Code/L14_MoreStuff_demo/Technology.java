
package labguide14_q2;

public class Technology extends Product {

    private String operatingSystem;

    public Technology(int id, String pName, double price,String operatingSystem) {
        super(id, pName, price);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public double calculateCost() {
        if (operatingSystem.equalsIgnoreCase("IOS")) {
            return price * 4;
        } else {
            return price;
        }
    }

    @Override
    public String toString() {
        return "Technologic " 
                +super.toString()
                + "\nOperating System: " + operatingSystem ;
    }
}
