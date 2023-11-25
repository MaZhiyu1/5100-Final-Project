/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Medical;

import Business.Class.BioTech.Lab;
import Business.Class.Medicine;

import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.ImageIcon;

/**
 *
 * @author 15469
 */
public class Doctor extends Person{

    String type;
    String hospital;
    int avail;
    ImageIcon logoImage;
    ArrayList<Appointment> appointmentList;

    int enabled;
    String contact;
    String department;
    String specialty;
    String eductionBackground;
    private HashMap<Lab,String> lab;
    
    public Doctor(int id, String name, String pwd, String hospital) {
        enabled=0;
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        this.hospital = hospital;
        appointmentList = new ArrayList<>();
        lab = new HashMap<Lab,String>();
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getPwd() {
//        return pwd;
//    }
//
//    public void setPwd(String pwd) {
//        this.pwd = pwd;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public void setAge(String age) {
//        this.age = age;
//    }
//
//    public String getGender() {
//        return gender;
//    }
//
//    public void setGender(String gender) {
//        this.gender = gender;
//    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
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

//    public ArrayList<Patient> getPatients() {
//        return patients;
//    }
//
//    public void setPatients(ArrayList<Patient> patients) {
//        this.patients = patients;
//    }

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
