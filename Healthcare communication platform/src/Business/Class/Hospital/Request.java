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
    Medicine medicines;
    Equipment equipments;
    Vaccine vaccines;
    String type;
    public Request(String id,String type,String instruction) {
        this.id = id;
        this.status = "Processing";
        this.type=type;
        this.instruction= instruction;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return id ;
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

    public Medicine getMedicines() {
        return medicines;
    }

    public void setMedicines(Medicine medicines) {
        this.medicines = medicines;
    }

    public Equipment getEquipments() {
        return equipments;
    }

    public void setEquipments(Equipment equipments) {
        this.equipments = equipments;
    }

    public Vaccine getVaccines() {
        return vaccines;
    }

    public void setVaccines(Vaccine vaccines) {
        this.vaccines = vaccines;
    }

    
    
    
    
    
    
    
}
