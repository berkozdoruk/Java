
package labguide11_q1;

public class Item {

    private int id;
    private String itemName;
    private String itemCategory;
    private double price;
    private static int lastUsedId = 99;

    public Item(String itemName, String itemCategory, double price) {
        this.id = ++lastUsedId;
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.price = price;
    }

    public boolean findID(int id) {
        if (this.id == id) {
            return true;
        } else {
            return false;
        }
    }

    public int getId() {
        return id;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item:\n---------\n"
                + "Id: " + id
                + "\nItemName: " + itemName
                + "\nItemCategory: " + itemCategory
                + "\nPrice: " + price + "$";
    }

}
