package labguide10_q2;

public class BookList {

   public static final int MAX_SIZE = 4;
    private static Book myBooks[] = new Book[MAX_SIZE];
    private static int count = 0;

    public static boolean addBook(Book b) {
 
            if (count < MAX_SIZE) {
                myBooks[count++] = b;
                return true;
            } else {
                return false;
            }
    }

    public static boolean removeBook(String str) {
        int id = Integer.parseInt(str);

        for (int i = 0; i < count; i++) {
            if (id == myBooks[i].getId()) {
                System.out.println(myBooks[i].getName() + " is removed.");
                myBooks[i] = myBooks[--count];
                return true;
            }
        }
        return false;
    }

    public static Book getBook(String name) {
        for (int i = 0; i < count; i++) {
            if (name.equalsIgnoreCase(myBooks[i].getName())) {
                return myBooks[i];
            }
        }
        return null;

    }
    public static Book[] getAll() {
        return myBooks;
    }

    public static Book getMaximumPriceBook() {
        int indexOfMax = 0;

        for (int i = 1; i < count; i++) {
            if (myBooks[i].getPrice() > myBooks[indexOfMax].getPrice()) {
                indexOfMax = i;
            }
        }
        return myBooks[indexOfMax];
    }

    public static String display() {
        String output = "\nBook List\n\n";

        for (int i = 0; i < count; i++) {
            output += myBooks[i].toString();

        }
        return output;

    }
}
