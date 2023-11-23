/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Invention;

import Business.Class.Drug;
import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class HResearch {
    String name;
    String pwd;
    String hospital;
    int id;
    ArrayList<Drug> drugs;

    int enabled;

    public HResearch(String name, String pwd, String hospital, int id) {
        this.name = name;
        this.pwd = pwd;
        this.hospital = hospital;
        this.id = id;
        enabled=0;
        drugs = new ArrayList<>();
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

    public ArrayList<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(ArrayList<Drug> drugs) {
        this.drugs = drugs;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled() {
        this.enabled = 1;
    }
    
    
    
    
    
    
    
    
    
}
