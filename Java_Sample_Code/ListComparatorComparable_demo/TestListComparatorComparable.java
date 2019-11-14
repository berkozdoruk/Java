
import java.util.ArrayList;
import java.util.Collections;


public class TestListComparatorComparable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Customer> al = new ArrayList<Customer>();
        al.add(new Customer("wow ", 458, 200));
        al.add(new Customer("Zeynep", 645, 300));
        al.add(new Customer("Mehmet", 234, 500));

        System.out.println("Before sort: " + al);

        Customer cmax1 = Collections.max(al, new MyCustomerComparator());
        System.out.println(cmax1);
        Customer cmax2 = Collections.max(al);
        System.out.println(cmax2);
        System.out.println(cmax1);
        
        MyCustomerComparator2 mc2 = new MyCustomerComparator2(10);
        Customer cmax3 = Collections.max(al, mc2);

        Collections.sort(al); //debt
        System.out.println(al.toString());
        Collections.sort(al, new MyCustomerComparator());//id
        System.out.println(al.toString());
        Collections.sort(al, mc2);//name
        System.out.println(al.toString());

    }

}
