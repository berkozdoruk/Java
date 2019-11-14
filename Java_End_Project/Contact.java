/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprocjt;

/**
 *
 * @author Levent Durdali
 * @author Tunjay Taghiyev
 */

public class Contact {
    
    private String email;
    private String phoneNumber;
    private boolean isStudent;
    private String officeNumber;

    public Contact(String email, String phoneNumber, boolean isStudent, String officeNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.isStudent = isStudent;
        this.officeNumber = officeNumber;
    }

    @Override
    public String toString() {
        if (isStudent) {
            return "Contact{" + "email=" + email + ", phoneNumber=" + phoneNumber;
        }
        else {
        return "Contact{" + "email=" + email + ", phoneNumber=" + phoneNumber + 
                    "OfficeNumber=" + officeNumber + '}';
        }
        
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isIsStudent() {
        return isStudent;
    }

    public String getOfficeNumber() {
        return officeNumber;
    }
    
         
    
    
}
