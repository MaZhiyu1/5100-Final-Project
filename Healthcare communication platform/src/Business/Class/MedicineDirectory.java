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
public class MedicineDirectory {
    
    ArrayList<Medicine> medicines;

    public MedicineDirectory() {
        this.medicines = new ArrayList<>();
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }
    
    public void addMedicine(Medicine e){
        medicines.add(e);
    }
    
}
