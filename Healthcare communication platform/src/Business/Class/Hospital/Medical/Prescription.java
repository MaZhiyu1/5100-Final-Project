/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Medical;

import Business.Class.Drug;
import Business.Class.Medicine;
import Business.Class.Vaccine;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dell
 */
public class Prescription {
    
    private int id;

    private Patient patient;

    private ArrayList<Drug> drugList;
    
    
    private Doctor doctor;
    
    private String hospital;

    private String pathema;

    public Prescription(int id, Patient patient, Doctor doctor, String hospital, String pathema) {
        this.id = id;
        this.patient = patient;
        this.doctor = doctor;
        this.hospital = hospital;
        this.pathema = pathema;
        drugList = new ArrayList<>();
    }


    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public List<Drug> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Drug> drugList) {
        this.drugList = drugList;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getPathema() {
        return pathema;
    }

    public void setPathema(String pathema) {
        this.pathema = pathema;
    }

    
}
