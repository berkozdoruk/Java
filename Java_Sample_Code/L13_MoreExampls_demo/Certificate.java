
package labguide13_q1;

import java.util.Scanner;


public class Certificate {

    private int certificateId;
    private String certificateName;

    public Certificate() {
        this.certificateId = 0;
        this.certificateName = "No Certificate";
    }

    public void getInput() {
        Scanner sc1 = new Scanner(System.in);

        System.out.println("Enter certificate Id: ");
        certificateId = sc1.nextInt();
        sc1.skip("\n");
        System.out.println("Enter certificate name: ");
        certificateName = sc1.nextLine();

    }

    public int getCertificateId() {
        return certificateId;
    }

    @Override
    public String toString() {
        return "Certificate\n"
                + "Certificate Id: " + certificateId
                + "\nCertificate Name: " + certificateName;
    }

}
