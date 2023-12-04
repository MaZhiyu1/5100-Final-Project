/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Medical;

import java.util.Date;
import java.util.UUID;

/**
 *
 * @author 15469
 */
public class Appointment {
    private String id;
    Patient patient;
    Doctor doctor;
    private String allergy;
    private String symptom;

    private String instruction;
    private int status;

    private Prescription prescription;

    public Appointment(Patient patient, Doctor doctor) {
        this.id = UUID.randomUUID().toString();
        this.patient = patient;
        this.doctor = doctor;
        patient.getAppointmentList().add(this);
        doctor.getAppointmentList().add(this);
        status=0;
    }

    @Override
    public String toString() {
        return id ;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }


    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
}
