
package labguide14_q2;


abstract class Product {

    protected int id;
    protected String pName;
    protected double price;

    public Product(int id, String pName, double price) {
        this.id = id;
        this.pName = pName;
        this.price = price;
    }

    abstract public double calculateCost();

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Product\n"
                + "Id: " + id
                + "\nProduct Name: " + pName
                + "\nPrice:" + price + "$";
    }

}
