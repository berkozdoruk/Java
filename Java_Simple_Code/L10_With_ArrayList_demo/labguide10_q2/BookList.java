package labguide10_q2;

import java.util.ArrayList;


public class BookList {

    public static final int MAX_SIZE = 5;
    public static ArrayList<Book> myBooks = new ArrayList();
    private static int count = 0;

    public static boolean addBook(Book b) {

        if (getBook(b.getName()) == null) {
            count++;
            myBooks.add(b);
            return true;
        } else {
            return false;
        }
    }

    public static boolean removeBook(String str) {
        int id = Integer.parseInt(str);
        boolean value = true;

        for (int i = 0; i < myBooks.size(); i++) {
            Book temp = myBooks.get(i);
            if (temp.getId() == id) {
                value = myBooks.remove(temp);
            }
        }
        count--;
        return value;

    }

    public static Book getBook(String name) {
        for (int i = 0; i < myBooks.size(); i++) {
            Book temp = myBooks.get(i);
            if (temp.getName().equals(name)) {
                return temp;
            }
        }
        return null;

    }

    public static ArrayList getAll() {
        return myBooks;
    }

    public static Book getMaximumPriceBook() {

        Book max = myBooks.get(0);
        for (int i = 1; i < myBooks.size(); i++) {
            Book temp = myBooks.get(i);
            if (temp.getPrice() > max.getPrice()) {
                max = temp;
            }
        }
        return max;
    }

    public static String display() {
        String output = "\nBook List\n\n";
        for (int i = 0; i < count; i++) {
            output += myBooks.get(i);
        }

        return output;

    }

    @Override
    public String toString() {
        String output = "\nBook List\n\n";
        for (int i = 0; i < count; i++) {
            output += "" + myBooks.get(i);

        }
        return output;
    }

}
