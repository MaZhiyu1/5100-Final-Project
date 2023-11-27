/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Medical;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author 15469
 */
public class Patient extends Person{
    
    ImageIcon logoImage;
    MedicalHistoryList mhl;
    ArrayList<Appointment> appointmentList;
    ArrayList<Prescription> prescriptionList;
    int enabled;

    private String insurance;
    private String allergy;

    public Patient(int id, String name, String pwd) {
        enabled=0;
        this.id = id;
        this.name = name;
        this.pwd = pwd;
        mhl=new MedicalHistoryList(id,name);
        appointmentList = new ArrayList<>();
        prescriptionList = new ArrayList<>();
    }

    public Appointment makeAppoinment(Doctor doctor){
        Appointment ap = new Appointment(this, doctor);
        appointmentList.add(ap);
        doctor.getAppointmentList().add(ap);
        return ap;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public ImageIcon getLogoImage() {
        return logoImage;
    }

    public void setLogoImage(ImageIcon logoImage) {
        this.logoImage = logoImage;
    }

    public MedicalHistoryList getMhl() {
        return mhl;
    }

    public void setMhl(MedicalHistoryList mhl) {
        this.mhl = mhl;
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
}
