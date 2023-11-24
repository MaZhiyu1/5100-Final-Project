/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital;

import Business.Class.Hospital.Medical.Doctor;
import Business.Class.Hospital.Medical.Patient;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author 15469
 */
public class Hospital {
    private String name;
    private String address;
    private ArrayList<Doctor> doctorList;
    private ArrayList<Patient> patients;
    private HospitalInventory hi;
    private HospitalAppoinment ha;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
        doctorList = new ArrayList<>();
        patients = new ArrayList<>();
        hi = new HospitalInventory();
        ha = new HospitalAppoinment();
    }
    
    public void addDoctor(Doctor e){
        doctorList.add(e);
    }
    
    public void addPatient(Patient e){
        patients.add(e);
    }
 

    
    

    
    
    
    
    
    
    
}
