
package labguide12_q2;


public class Invertebrate extends Animal{
        private boolean chitin;

    public Invertebrate(boolean chitin, int id, int age, String gender, double weight) {
        super(id, age, gender, weight);
        this.chitin = chitin;
    }

    @Override
    public String toString() {
        return "\nInvertebrate\n" +super.toString()+"\nChitin= " + chitin  ;
    }
        
}
