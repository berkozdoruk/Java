
package labguide12_q2;

public class Mammal extends Vertebrate {
    private boolean fryCare;

    public Mammal(boolean fryCare, String nutrition, int id, int age, String gender, double weight) {
        super(nutrition, id, age, gender, weight);
        this.fryCare = fryCare;
    }

    @Override
    public String toString() {
        return "Mammal\n" +super.toString()+ "Child Care: " + fryCare ;
    }
    
    

 
    
    
}
