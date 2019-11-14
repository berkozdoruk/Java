
package labguide12_q2;


public class Vertebrate extends Animal{
    private String nutrition;

    public Vertebrate(String nutrition, int id, int age, String gender, double weight) {
        super(id, age, gender, weight);
        this.nutrition = nutrition;
    }

    @Override
    public String toString() {
        return "\nVertebrate\n"+super.toString() +"Nutrition type: " + nutrition  ;
    }
    
    
    
    
}
