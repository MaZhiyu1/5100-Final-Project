/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Medical;

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
    
    
    private int patientId;
    
    private ArrayList<Medicine> drugList;
    private ArrayList<Vaccine> vaccineList;
    
    
    private Doctor doctor;
    
    private String hospital;
    
    private String pathema;

    public Prescription(int id, int patientId, Doctor doctor, String hospital, String pathema) {
        this.id = id;
        this.patientId = patientId;
        this.doctor = doctor;
        this.hospital = hospital;
        this.pathema = pathema;
        drugList = new ArrayList<>();
        vaccineList = new ArrayList<>();
    }

    public ArrayList<Vaccine> getVaccineList() {
        return vaccineList;
    }

    public void setVaccineList(ArrayList<Vaccine> vaccineList) {
        this.vaccineList = vaccineList;
    }

    
    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getPatientId() {
        return patientId;
    }

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public List<Medicine> getDrugList() {
        return drugList;
    }

    public void setDrugList(ArrayList<Medicine> drugList) {
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
