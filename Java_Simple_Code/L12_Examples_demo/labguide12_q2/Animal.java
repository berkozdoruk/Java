
package labguide12_q2;


public class Animal {
    protected int id;
    protected int age;
    protected String gender;
    protected double weight;

    public Animal(int id, int age, String gender, double weight) {
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
    }

    public int getId() {
        return id;
    }

  

    @Override
    public String toString() {
        return "Animal\n" + "Age: " + age 
                + "\nGender: " + gender + 
                "\nWeight: " + weight;
    }
    
    
}
