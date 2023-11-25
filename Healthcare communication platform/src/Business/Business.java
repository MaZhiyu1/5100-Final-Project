/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Class.Equipment;
import Business.Class.Hospital.Hospital;
import Business.Class.Hospital.Medical.Appointment;
import Business.Class.Hospital.Medical.Doctor;
import Business.Class.Hospital.Medical.MedicalHistory;
import Business.Class.Hospital.Medical.MedicalHistoryList;
import Business.Class.Hospital.Medical.Patient;
import Business.Class.Medicine;
import Business.Class.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class Business {
    
    private Hospital h1;
    private Hospital h2;
    private Hospital h3;
    private ArrayList<Hospital> hospital;
    private ArrayList<Patient> patients;
    
    public Business() {
        hospital = new ArrayList<>();
        patients = new ArrayList<>();
        Hospital1();
        hospital.add(h1);
        
    }

    public ArrayList<Hospital> getHospital() {
        return hospital;
    }

    public void setHospital(ArrayList<Hospital> hospital) {
        this.hospital = hospital;
    }

    
    
    public Hospital getH1() {
        return h1;
    }

    public void setH1(Hospital h1) {
        this.h1 = h1;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }
    
    
    
    public void Hospital1() {
        h1 = new Hospital("Boston Rehabilitation Center","");
        
        Doctor doctor1 = new Doctor(1,"Jim","Aa12345678", "Boston Rehabilitation Center");
        doctor1.setEnabled(1);
        doctor1.setSpecialty("Surgery");
        
        Doctor doctor2 = new Doctor(2,"Alex","Aa12345678", "Boston Rehabilitation Center");
        doctor2.setEnabled(1);
        doctor2.setSpecialty("Pediatrics");
        
        Doctor doctor3 = new Doctor(3,"Frank","Aa12345678", "Boston Rehabilitation Center");
        doctor3.setEnabled(1);
        doctor3.setSpecialty("Internal Medicine");
        
        MedicalHistory mh1 = new MedicalHistory("Had server fever","keep warm. Don't eat spicy food");
        MedicalHistory mh2 = new MedicalHistory("Had server headache","keep warm. Don't eat spicy food");
        MedicalHistoryList mhl1 = new MedicalHistoryList(1,"Oliver");
        mhl1.addHistory(mh2);
        mhl1.addHistory(mh1);
        
        Patient patient1 = new Patient(1, "Oliver", "Aa12345678");
        patient1.setMhl(mhl1);
        patient1.setEnabled(1);
        patient1.setAge("12");

        Patient patient2 = new Patient(2, "Jam", "Aa12345678");
        patient2.setEnabled(1);
        patient2.setAge("22");
        
        Patient patient3 = new Patient(3, "Lex", "Aa12345678");
        patient3.setEnabled(1);
        patient3.setAge("42");
        
        
        Appointment a = new Appointment(1,patient1,doctor1);
        Appointment a1 = new Appointment(1,patient2,doctor2);
        Appointment a2 = new Appointment(1,patient3,doctor3);
        ArrayList<Appointment> APPO = new ArrayList<>();
        APPO.add(a);
        APPO.add(a1);
        APPO.add(a2);
        
        patient1.makeAppoinment(doctor1);
        patient2.makeAppoinment(doctor2);
        patient3.makeAppoinment(doctor3);
        
        Medicine m = new Medicine("A1", "1", "For Child", "Pediatrics");
        m.setQuality(10);
        Medicine m1 = new Medicine("B1", "2", "For Internal", "Internal Medicine");
        m1.setQuality(10);
        Medicine m2 = new Medicine("C1", "3", "Surgery", "Surgery");
        m2.setQuality(10);
        ArrayList<Medicine> M = new ArrayList<>();
        
        M.add(m);
        M.add(m1);
        M.add(m2);
        
        Vaccine v = new Vaccine("A1", "1", "For Child", "Pediatrics");
        v.setQuantity(10);
        Vaccine v1 = new Vaccine("B1", "2", "For Internal", "Internal Medicine");
        v1.setQuantity(10);
        Vaccine v2 = new Vaccine("C1", "3", "Surgery", "Surgery");
        v2.setQuantity(10);
        ArrayList<Vaccine> V = new ArrayList<>();
        
        V.add(v);
        V.add(v1);
        V.add(v2);
        
        Equipment e = new Equipment("A1", "1", "For Child", "Pediatrics");
        e.setQuantity(10);
        Equipment e1 = new Equipment("B1", "2", "For Internal", "Internal Medicine");
        e1.setQuantity(10);
        Equipment e2 = new Equipment("C1", "3", "Surgery", "Surgery");
        e2.setQuantity(10);
        ArrayList<Equipment> E = new ArrayList<>();
        
        E.add(e);
        E.add(e1);
        E.add(e2);
        

        h1.addDoctor(doctor1);
        h1.addDoctor(doctor2);
        h1.addDoctor(doctor3);
        
        h1.addPatient(patient1);
        h1.addPatient(patient2);
        h1.addPatient(patient3);
        
        h1.getHa().setAppointments(APPO);
        h1.getHi().setMd(M);
        h1.getHi().setVd(V);
        h1.getHi().setEd(E);
        
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
    }
    
    
    
}
