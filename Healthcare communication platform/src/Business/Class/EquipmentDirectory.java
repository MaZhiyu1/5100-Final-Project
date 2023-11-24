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
public class EquipmentDirectory {
    
    
    private ArrayList<Equipment> equipments;

    public EquipmentDirectory() {
        equipments=new ArrayList<>();
    }

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    public void addEquipment(Equipment e){
        equipments.add(e);
    }
    
    public void setEquipments(ArrayList<Equipment> equipments) {
        this.equipments = equipments;
    }
    
    
    
}
