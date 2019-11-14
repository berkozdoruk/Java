
package labguide12.q1;


public class Zebra  extends Animal{
       private int stripeCount;

    public Zebra(int stripeCount, int id, int age, String gender, double weight) {
        super(id, age, gender, weight);
        this.stripeCount = stripeCount;
    }

 
    @Override
    public String toString() {
        return "Zebra information"+super.toString()+"\nStripe Count:" + stripeCount ;
    }
}
