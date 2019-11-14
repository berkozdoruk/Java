
package labguide14_q2;

public class Food extends Product {

    private boolean diabetic;

    public Food(int id, String pName, double price, boolean diabetic) {
        super(id, pName, price);
        this.diabetic = diabetic;
    }

    @Override
    public double calculateCost() {
        if (diabetic) {
            return price*2;
        }
        else
            return price;
    }

    @Override
    public String toString() {
        return "Food "
                + super.toString()
                + "\nDiabetic:" + diabetic;

    }

}
