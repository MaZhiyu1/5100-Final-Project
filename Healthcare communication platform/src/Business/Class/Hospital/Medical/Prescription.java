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
import java.util.UUID;

/**
 *
 * @author dell
 */
public class Prescription {
    
    private String id;
    private String name;

    private Patient patient;

    private List<Drug> drugList;

    private Doctor doctor;

    public Prescription(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        drugList = new ArrayList<>();
    }

    public Prescription(String name,List<Drug> drugList) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.drugList = drugList;
    }

    @Override
    public String toString() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public void setDrugList(List<Drug> drugList) {
        this.drugList = drugList;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
