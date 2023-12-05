/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.BioTech;

import Business.Class.Hospital.Medical.Person;

import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class BioResearcher {
    private ArrayList<Lab> labs;
    private Person master;
    private String pwd;
    private String id;
    private String BioTech;
    int enable=0;
    
    
    public BioResearcher(Person person, String pwd, String id, String BioTech) {
        this.master = person;
        this.pwd = pwd;
        this.id = id;
        this.BioTech = BioTech;
        labs = new ArrayList<>();
    }

    public void addLab(Lab lab){
        labs.add(lab);
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    
    
    @Override
    public String toString() {
        return id ;
    }
    
    public void deleteLab(Lab b){
        labs.remove(b);
    }
    
    public ArrayList<Lab> getLabs() {
        return labs;
    }

    public void setLabs(ArrayList<Lab> labs) {
        this.labs = labs;
    }

    public Person getMaster() {
        return master;
    }

    public void setMaster(Person master) {
        this.master = master;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBioTech() {
        return BioTech;
    }

    public void setBioTech(String BioTech) {
        this.BioTech = BioTech;
    }
    
    
    
}
