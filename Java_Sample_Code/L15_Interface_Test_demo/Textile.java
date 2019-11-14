
package labguide15_q1;

public class Textile extends Product {

    private boolean allergicTest;

    public Textile(int id, String pName, double price, boolean allergicTest) {
        super(id, pName, price);
        this.allergicTest = allergicTest;
    }

    @Override
    public double calculateCost() {
        if (allergicTest) {
            return price * 3;
        }
        return price * 0.97;
    }

    @Override
    public String toString() {
        return "Textile "
                + super.toString()
                + "\nAllergic  Test: " + allergicTest;
    }
}
