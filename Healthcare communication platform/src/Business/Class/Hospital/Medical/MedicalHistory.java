/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Medical;

/**
 *
 * @author 15469
 */
public class MedicalHistory {
    String id;
    String name;

    String symptom;
    String instruction;
    String status;

    //医生
    private Doctor doctor;

    //病人
    private Patient patient;

    //处方
    private Prescription prescription;

    public MedicalHistory(String symptom, String instruction) {
        this.symptom = symptom;
        this.instruction = instruction;
        status="processing";
    }

    public MedicalHistory(Patient patient, Doctor doctor, String symptom, String instruction) {
        this.doctor = doctor;
        this.patient = patient;
        this.symptom = symptom;
        this.instruction = instruction;
        status="processing";
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = "completed";
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }
}
