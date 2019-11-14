
package labguide11_q1;

import java.util.ArrayList;

public class ItemSys {

    public static ArrayList<Item> myItems = new ArrayList();

    public static void addItem(Item i) {
        myItems.add(i);
    }

    public static void menu() {
        System.out.println("Menu\n********\n");
        System.out.println("1. Add an Item ");
        System.out.println("2. Remove an Item ");
        System.out.println("3. Search an Item ");
        System.out.println("4. Display Maximum Priced Item ");
        System.out.println("5. Display Items in Store ");
        System.out.println("6. Exit ");
    }

    public static Item removeItem(int item_id) {
        Item temp = null;

        for (int i = 0; i < myItems.size(); i++) {
            temp = myItems.get(i);
            if (temp.findID(item_id)) {
                myItems.remove(temp);
            }
        }
        return temp;
    }

    public static Item SearchItem(String item_id) {
        for (int i = 0; i < myItems.size(); i++) {
            Item temp = myItems.get(i);
            if (temp.findID(Integer.parseInt(item_id))) {
                return temp;
            }
        }
        return null;

    }

    public static Item getMaximumPricedItem() {

        Item max = myItems.get(0);
        for (int i = 1; i < myItems.size(); i++) {
            Item temp = myItems.get(i);
            if (temp.getPrice() > max.getPrice()) {
                max = temp;
            }
        }
        return max;
    }

    public static String display() {
        String output = "Store\n-----------\n";

        for (int i = 0; i < myItems.size(); i++) {
            output += myItems.get(i) + "\n**************\n";
        }
        return output;
    }

}
