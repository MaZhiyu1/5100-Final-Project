/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital;

import Business.Class.Equipment;
import Business.Class.Medicine;
import Business.Class.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class Request {
    String id;
    String instruction;
    String status;
    ArrayList<Medicine> medicines;
    ArrayList<Equipment> equipments;
    ArrayList<Vaccine> vaccines;

    public Request(String id) {
        this.id = id;
        this.status = "Processing";
        medicines = new ArrayList<>();
        equipments = new ArrayList<>();
        vaccines = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(ArrayList<Medicine> medicines) {
        this.medicines = medicines;
    }

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(ArrayList<Equipment> equipments) {
        this.equipments = equipments;
    }

    public ArrayList<Vaccine> getVaccines() {
        return vaccines;
    }

    public void setVaccines(ArrayList<Vaccine> vaccines) {
        this.vaccines = vaccines;
    }
    
    
    
    
    
    
}
