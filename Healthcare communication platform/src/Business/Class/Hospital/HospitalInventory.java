/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital;

import Business.Class.Equipment;
import Business.Class.EquipmentDirectory;
import Business.Class.Medicine;
import Business.Class.MedicineDirectory;
import Business.Class.Vaccine;
import Business.Class.VaccineDirectory;
import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class HospitalInventory {
    MedicineDirectory md;
    EquipmentDirectory ed;
    VaccineDirectory vd;
    
    
    
    
    public HospitalInventory() {
        md = new MedicineDirectory();
        ed = new EquipmentDirectory();
        vd = new VaccineDirectory();
    }

    public EquipmentDirectory getEd() {
        return ed;
    }

    public void setEd(ArrayList<Equipment> e) {
        ed.setEquipments(e);
    }

    public VaccineDirectory getVd() {
        return vd;
    }

    public void setVd(ArrayList<Vaccine> vaccine) {
        vd.setVaccines(vaccine);
    }

    public void addVaccine(Vaccine e){
        for(Vaccine m : vd.getVaccines()){
            if(m.getId()==e.getId()&&m.getType().equals(e.getType())){
                m.setQuantity(m.getQuantity()+e.getQuantity());
                return;
            }
        }
        vd.addVaccine(e);
    }
    
    public void addMedicine(Medicine e){
        for(Medicine m : md.getDrugs()){
            if(m.getId()==e.getId()&&m.getType().equals(e.getType())){
                m.setQuantity(m.getQuality()+e.getQuality());
                return;
            }
        }
        md.addDrugs(e);
    }
    
    public void addEquipment(Equipment e){
        for(Equipment m : ed.getEquipments()){
            if(m.getId()==e.getId()&&m.getType().equals(e.getType())){
                return;
            }
        }
        ed.addEquipment(e);
        
    }
    
    
    public int deleteVaccine(Vaccine e){
        for(Vaccine m : vd.getVaccines()){
            if(m.getId()==e.getId()&&m.getType().equals(e.getType())){
                if(m.getQuantity()-e.getQuantity()<0) return -1;
                m.setQuantity(m.getQuantity()-e.getQuantity());
                return 1;
            }
        }
        return 0;  //no in the hospital
    }
    
    public int deleteMedicine(Medicine e){
        for(Medicine m : md.getDrugs()){
            if(m.getId()==e.getId()&&m.getType().equals(e.getType())){
                 if(m.getQuantity()-e.getQuantity()<0) return -1;
                m.setQuantity(m.getQuality()-e.getQuality());
                return 1;
            }
        }
        return 0;  //no in the hospital
    }
    
    
    
    
    public MedicineDirectory getMd() {
        return md;
    }

    public void setMd(ArrayList<Medicine> medicines) {
        md.setDrugs(medicines);
    }

    
    
    
}
