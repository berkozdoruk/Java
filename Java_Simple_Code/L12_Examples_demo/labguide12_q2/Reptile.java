
package labguide12_q2;


public class Reptile extends Vertebrate{
    private String bloodType ;

    public Reptile(String bloodType, String nutrition, int id, int age, String gender, double weight) {
        super(nutrition, id, age, gender, weight);
        this.bloodType = bloodType;
    }

    @Override
    public String toString() {
        return "Reptile\n" +super.toString() + "Blood Type: " + bloodType;
    }
    
    

   
    
}
