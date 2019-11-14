
package labguide11_q1;

import java.util.Scanner;

public class LabGuide11_Q1 {

    public static void main(String[] args) {

        Item i;
        Scanner inp = new Scanner(System.in);
        String name, category;
        int answer, id;
        double price;
        ItemSys.menu();
        System.out.print("Enter your choice: ");
        answer = inp.nextInt();
        while (answer != 6) {
            switch (answer) {
                case 1:
                    inp.skip("\n");
                    System.out.print("Enter Item Name: ");
                    name = inp.nextLine();
                    System.out.print("Enter Item Category: ");
                    category = inp.nextLine();
                    System.out.print("Enter the price of item: ");
                    price = inp.nextDouble();
                    i = new Item(name, category, price);
                    ItemSys.addItem(i);
                    break;
                case 2:
                    System.out.println("Items in Store:");
                    System.out.println(ItemSys.display());
                    System.out.print("Enter the id of item to be removed: ");
                    id = inp.nextInt();
                    i = ItemSys.removeItem(id);
                    if (i == null) {
                        System.out.println("Item could not be removed!!");
                    } else {
                        System.out.println(i.getItemName()+" is removed!!");
                    }
                    break;
                case 3:
                    System.out.print("Enter the item name: ");
                    inp.skip("\n");
                    name = inp.nextLine();
                    i = ItemSys.SearchItem(name);
                    System.out.println("Item you looking for: \n" + i.toString());
                    break;
                case 4:
                    System.out.println("Maximum Priced Item: \n" + ItemSys.getMaximumPricedItem().toString());
                    break;
                case 5:
                    System.out.println(ItemSys.display());

            }
            ItemSys.menu();
            System.out.print("Enter your choice: ");
            answer = inp.nextInt();
            if (answer == 6) {
                System.out.println("Operations are done!!\nHave a nice day!!");
            }
        }

    }

}
