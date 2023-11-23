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
    String type;
    int enabled;

    public HResearch(String name, String pwd, String hospital, int id) {
        this.name = name;
        this.pwd = pwd;
        this.hospital = hospital;
        this.id = id;
        enabled=0;
        drugs = new ArrayList<>();
    }
    
    
    
    
}
