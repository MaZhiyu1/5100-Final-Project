/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.MedicalSupplier;

import Business.Class.BioTech.BioSupplier;
import Business.Class.Equipment;
import Business.Class.Hospital.Request;
import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class MedicalSupplier {
    String name;
    private ArrayList<Equipment> equipments;
    ArrayList<BioSupplier> bs;
    ArrayList<Request> request;

    public MedicalSupplier(String name) {
        this.name = name;
        equipments = new ArrayList<>();
        bs = new ArrayList<>();
        request = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(ArrayList<Equipment> equipments) {
        this.equipments = equipments;
    }

    public ArrayList<BioSupplier> getBs() {
        return bs;
    }

    public void setBs(ArrayList<BioSupplier> bs) {
        this.bs = bs;
    }
    
    public void addEquipment(Equipment e){
        equipments.add(e);
    }
    
    public void addBioSupplier(BioSupplier e){
        bs.add(e);
    }

    public ArrayList<Request> getRequest() {
        return request;
    }

    public void setRequest(ArrayList<Request> request) {
        this.request = request;
    }
    
    
    
}
