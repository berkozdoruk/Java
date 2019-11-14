
package labguide13_q1;

import java.util.ArrayList;

//
public class Manager extends Person {

    private String department;
    private double salary;
    private ArrayList<Certificate> certificates = new ArrayList<Certificate>();

    public Manager(int personId, String nameSurname, String gender, int age, String department, double salary) {
        super(personId, nameSurname, gender, age);
        this.department = department;
        this.salary = salary;
    }


    public boolean addCertificate(Certificate c) {
       
        for (int i = 0; i < certificates.size(); i++) {
            if (certificates.get(i).getCertificateId() == c.getCertificateId()) {
                System.out.println( "Enter different Certificate Id!" );
                return false;
            }
        }
        certificates.add(c);
        return true;
    }

    @Override
    public String toString() {
        return "Manager\n"
                + super.toString()
                + "\nDepartment: " + department
                + "\nSalary: " + salary
                + "$\nCertificates: \n" + certificates.toString();
    }

}
