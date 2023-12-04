/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Medical;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;

/**
 *
 * @author 15469
 */
public class Patient extends Person{
    
    ImageIcon logoImage;
    MedicalHistoryDirectory medicalHistoryDirectory;
    ArrayList<Appointment> appointmentList;
    int enabled;

    private String insurance;
    private String allergy;

    public Patient(int id, String name, String pwd) {
        enabled=0;
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        medicalHistoryDirectory = new MedicalHistoryDirectory(id,name);
        appointmentList = new ArrayList<>();
    }

    public Appointment makeAppoinment(Doctor doctor){
        Appointment ap = new Appointment(this, doctor);
        return ap;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    public MedicalHistoryDirectory getMedicalHistoryDirectory() {
        return medicalHistoryDirectory;
    }

    public void setMedicalHistoryDirectory(MedicalHistoryDirectory medicalHistoryDirectory) {
        this.medicalHistoryDirectory = medicalHistoryDirectory;
        medicalHistoryDirectory.getMh().forEach(md -> md.setPatient(this));
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public String getInsurance() {
        return insurance;
    }

    public void setInsurance(String insurance) {
        this.insurance = insurance;
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy;
    }

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(ArrayList<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public List<Prescription> getPrescriptionList() {
        return this.getMedicalHistoryDirectory().getMh().stream().map(MedicalHistory::getPrescription).collect(Collectors.toList());
    }


}
