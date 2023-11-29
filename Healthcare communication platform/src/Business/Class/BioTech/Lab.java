/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.BioTech;

import Business.Class.Hospital.Medical.Doctor;
import Business.Class.Medicine;
import Business.Class.Vaccine;
import java.util.ArrayList;
import java.util.UUID;

/**
 *
 * @author 15469
 */
public class Lab {

    private String id;
    private String name;
//    private String pwd;
    private String department;
    private String instruction;
    private Doctor doctor;
    private Medicine medicine;
    private Vaccine vaccine;
    private String projectName;
    private int progress;
    private String status;
    private String type;

    private String company;

    
    public Lab(String name, String group, String projectName,Medicine medicine, Vaccine vaccine) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
//        this.pwd = pwd;
        this.department = group;
        this.medicine = medicine;
        this.vaccine = vaccine;
        this.projectName = projectName;
        progress=0;
        this.status = "Processing";
     }
    
    
    public Lab(String name, String group, String projectName,String type,String instruction) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
//        this.pwd = pwd;
        this.department = group;
        this.projectName = projectName;
        progress=0;
        this.type=type;
        this.instruction = instruction;
        this.status = "Processing";
     }

    public String getName() {
        return name;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    
    
    
    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getPwd() {
//        return pwd;
//    }
//
//    public void setPwd(String pwd) {
//        this.pwd = pwd;
//    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public Vaccine getVaccine() {
        return vaccine;
    }

    public void setVaccine(Vaccine vaccine) {
        this.vaccine = vaccine;
    }


    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
