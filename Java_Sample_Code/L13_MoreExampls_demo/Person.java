
package labguide13_q1;

//
public class Person {
    protected int personId;
    protected String nameSurname;
    protected String gender;
    protected int age;

    public Person(int personId, String nameSurname, String gender, int age) {
        this.personId = personId;
        this.nameSurname = nameSurname;
        this.gender = gender;
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person\n"  
                +"Person Id:"+personId
                +"\nName and Surname:"  + nameSurname 
                +"\nGender: " + gender 
                +"\nAge: " + age ;
    }
    
    
    
}
