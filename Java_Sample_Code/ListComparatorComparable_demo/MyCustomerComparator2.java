
import java.util.Comparator;


public class MyCustomerComparator2 implements Comparator<Customer> {

    int num;
    public MyCustomerComparator2(int num)
    {
        this.num = num;
    }
    
    @Override
    public int compare(Customer o1, Customer o2) {
        if(o1.getId() > num)
        {}
        return o1.getName().compareTo(o2.getName());
    }
    
}
