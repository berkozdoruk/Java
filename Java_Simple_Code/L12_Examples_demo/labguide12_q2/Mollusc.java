
package labguide12_q2;


public class Mollusc extends Invertebrate{
     private String habitat;

    public Mollusc(String habitat, boolean chitin, int id, int age, String gender, double weight) {
        super(chitin, id, age, gender, weight);
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Mollusc\n" + super.toString() +"Habitat: " + habitat;
    }
     
     

    
}
