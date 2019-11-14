
package labguide15_q1;


abstract class Product implements IProducts{
    /*calculateCost() must be implemented for all subclassed.
    we specify that all the Products has findCost()*/
    protected int id;
    protected String pName;
    protected double price;

    public Product(int id, String pName, double price) {
        this.id = id;
        this.pName = pName;
        this.price = price;
    }

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
