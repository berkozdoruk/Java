
package labguide14_q2;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double cost;
        Technology tech = new Technology(111, "Iphone6s", 4245, "IOS");
        Food food = new Food(112, "Bread", 2, true);
        Textile textile = new Textile(113, "Pillow", 150, false);

        ProductSys.addProduct(tech);
        ProductSys.addProduct(food);
        ProductSys.addProduct(textile);
        System.out.println(ProductSys.displayWithCost());
    }
}
