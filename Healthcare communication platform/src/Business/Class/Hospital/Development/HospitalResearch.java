/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Development;

import Business.Class.Medicine;
import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class HospitalResearch {
    String name;
    String pwd;
    String hospital;
    int id;
    ArrayList<Medicine> medicines;

    int enabled;

    public HospitalResearch(String name, String pwd, String hospital, int id) {
        this.name = name;
        this.pwd = pwd;
        this.hospital = hospital;
        this.id = id;
        enabled=0;
        medicines = new ArrayList<>();
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

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setDrugs(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled() {
        this.enabled = 1;
    }
    
    
    
    
    
    
    
    
    
}
