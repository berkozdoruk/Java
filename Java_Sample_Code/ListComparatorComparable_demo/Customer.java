
public class Customer implements Comparable<Customer> {

    private String name;
    private int id;
    private int debt;

    public Customer(String name, int id, int debt) {
        super();
        this.name = name;
        this.id = id;
        this.debt = debt;
    }

    @Override
    public int compareTo(Customer o) {
        return debt - o.debt;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", id=" + id + ", debt=" + debt + "]";
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getDebt() {
        return debt;
    }
 }
