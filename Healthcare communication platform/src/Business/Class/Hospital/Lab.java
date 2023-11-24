/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital;

import Business.Class.Medicine;
import Business.Class.MedicineDirectory;
import Business.Class.Hospital.Medical.Doctor;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 15469
 */
public class Lab {
    private String id;
    private String name;
    private String address;
    private String type;
    private ArrayList<Doctor> member;
    private String project;
    private String status;
    private String group;
    private String instruction;
    private String company;

    public Lab(String id, String name, String type, String project, String status, String instruction, String company) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.project = project;
        this.status = status;
        this.instruction = instruction;
        this.company = company;
        member = new ArrayList<>();
    }

    public ArrayList<Doctor> getMember() {
        return member;
    }

    public void setMember(ArrayList<Doctor> member) {
        this.member = member;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
