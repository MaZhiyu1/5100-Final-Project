/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital;

import Business.Class.Equipment;
import Business.Class.Medicine;
import Business.Class.Vaccine;

import java.util.UUID;

/**
 *
 * @author 15469
 */
public class Request {
    String id;
    String name;

    String instruction;
    String status;
    Medicine medicine;
    Equipment equipment;
    Vaccine vaccines;
    String type;

    String tips;

    int quantity;

    public Request(String name,String type,String tips) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
        this.status = "Processing";
        this.type = type;
        this.tips= tips;
    }

    public Request(String type,String tips, int quantity) {
        this.name = "";
        this.id = UUID.randomUUID().toString();
        this.status = "Processing";
        this.type = type;
        this.tips= tips;
        this.quantity = quantity;
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

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicines) {
        this.medicine = medicines;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipments) {
        this.equipment = equipments;
    }

    public Vaccine getVaccines() {
        return vaccines;
    }

    public void setVaccines(Vaccine vaccines) {
        this.vaccines = vaccines;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTips() {
        return tips;
    }

    public void setTips(String tips) {
        this.tips = tips;
    }
}
