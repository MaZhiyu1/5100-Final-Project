/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.BioTech;

import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class BioResaercher {
    private ArrayList<Lab> labs;
    private String name;
    private String pwd;
    private String id;
    private String BioTech;

    public BioResaercher(String name, String pwd, String id, String BioTech) {
        this.name = name;
        this.pwd = pwd;
        this.id = id;
        this.BioTech = BioTech;
        labs = new ArrayList<>();
    }

    public void addLab(Lab lab){
        labs.add(lab);
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
