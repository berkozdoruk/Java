
package labguide12.q1;


public class Duck extends Animal{
    private String beakColor;

    public Duck(String beakColor, int id, int age, String gender, double weight) {
        super(id, age, gender, weight);
        this.beakColor = beakColor;
    }

    


    @Override
    public String toString() {
        return "Duck information"+super.toString()+"\nBeak Color:" +beakColor  ;
    }
    
    
    
}
