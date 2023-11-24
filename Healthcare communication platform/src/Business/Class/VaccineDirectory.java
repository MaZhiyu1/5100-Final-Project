/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class VaccineDirectory {
    
    ArrayList<Vaccine> vaccines;

    public VaccineDirectory() {
        vaccines = new ArrayList<>();
    }

    public void addVaccine(Vaccine e){
        vaccines.add(e);
    }
    
    public ArrayList<Vaccine> getVaccines() {
        return vaccines;
    }

    public void setVaccines(ArrayList<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }
}
