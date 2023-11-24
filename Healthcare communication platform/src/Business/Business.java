/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Class.Hospital.Hospital;
import Business.Class.Hospital.Medical.Doctor;
import Business.Class.Hospital.Medical.Patient;

/**
 *
 * @author 15469
 */
public class Business {
    private Hospital h1;

    public Business() {
        h1 = new Hospital("Boston Rehabilitation Center","");
        
        Doctor doctor1 = new Doctor(1,"Jim","Aa12345678", "Boston Rehabilitation Center");
        doctor1.setSpecialty("Surgery");
        Doctor doctor2 = new Doctor(2,"Alex","Aa12345678", "Boston Rehabilitation Center");
        doctor2.setSpecialty("Pediatrics");
        Doctor doctor3 = new Doctor(3,"Frank","Aa12345678", "Boston Rehabilitation Center");
        doctor3.setSpecialty("Internal Medicine");
        
        
        Patient patient1 = new Patient(1, "Oliver", "Aa12345678");
        patient1.setAge("12");

        Patient patient2 = new Patient(2, "Jam", "Aa12345678");
        patient2.setAge("22");
        
        Patient patient3 = new Patient(3, "Lex", "Aa12345678");
        patient3.setAge("42");
        
        h1.addDoctor(doctor1);
        h1.addDoctor(doctor2);
        h1.addDoctor(doctor3);
        h1.addPatient(patient1);
        h1.addPatient(patient2);
        h1.addPatient(patient3);
    }
    
    
    
}
