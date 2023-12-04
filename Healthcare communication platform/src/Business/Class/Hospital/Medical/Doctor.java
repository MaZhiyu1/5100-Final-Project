/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Medical;

import Business.Class.BioTech.Lab;
import Business.Class.Hospital.Hospital;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.swing.ImageIcon;

/**
 *
 * @author 15469
 */
public class Doctor extends Person{

    String type;
    Hospital hospital;
    int avail;
    ImageIcon logoImage;
    ArrayList<Appointment> appointmentList;

    int enabled;
    String contact;
    String department;
    String specialty;
    String eductionBackground;
//    private HashMap<Lab,String> labs;
    private List<Lab> labs;

    public Doctor(int id, String name, String pwd, String gender,Hospital hospital) {
        super(id, name, pwd, gender);
        enabled=0;
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.hospital = hospital;
        appointmentList = new ArrayList<>();
        labs = new ArrayList<>();
    }

    @Override
    public String toString() {
        return getId() + " ";
    }

    public List<Lab> getLabs() {
        return labs;
    }
    
    public void addLab(Lab lab){
        labs.add(lab);
    }
    
    public void deleteLab(Lab lab){
        labs.remove(lab);
    }
    
    
//
//    public void addLab(Lab lab){
//        labs.put(lab, "Processing");
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }



    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public void setAppointmentList(ArrayList<Appointment> appointmentList) {
        this.appointmentList = appointmentList;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getEductionBackground() {
        return eductionBackground;
    }

    public void setEductionBackground(String eductionBackground) {
        this.eductionBackground = eductionBackground;
    }
    
    

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
    
    
    
    
    
    
    
    
    
}
