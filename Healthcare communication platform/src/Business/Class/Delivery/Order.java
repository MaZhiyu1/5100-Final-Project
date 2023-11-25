/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Delivery;

import Business.Class.Equipment;
import Business.Class.Medicine;
import Business.Class.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class Order {
    String id;
    String location;
    String address;
    String status;
    ArrayList<Medicine> medicines;
    ArrayList<Equipment> equipments;
    ArrayList<Vaccine> vaccines;

    public Order(String id, String location, String address, String status) {
        this.id = id;
        this.location = location;
        this.address = address;
        this.status = status;
        medicines = new ArrayList<>();
        equipments = new ArrayList<>();
        vaccines = new ArrayList<>();
    }

    public void addMedicine(Medicine e){
        medicines.add(e);
    }
    
    public void addEquipment(Equipment e){
        equipments.add(e);
    }
    
    public void addVaccine(Vaccine e){
        vaccines.add(e);
    }
    
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
