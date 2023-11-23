/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class;

import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class DrugList {
    ArrayList<Drug> drugs;

    public DrugList() {
        this.drugs = new ArrayList<>();
    }

    public ArrayList<Drug> getDrugs() {
        return drugs;
    }

    public void setDrugs(ArrayList<Drug> drugs) {
        this.drugs = drugs;
    }
    
    public void addDrugs(Drug e){
        drugs.add(e);
    }
    
    
}
