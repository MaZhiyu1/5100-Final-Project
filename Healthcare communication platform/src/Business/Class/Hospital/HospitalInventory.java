/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital;

import Business.Class.*;

import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class HospitalInventory {
    MedicineDirectory medicineDirectory;
    EquipmentDirectory equipmentDirectory;
    VaccineDirectory vaccineDirectory;

    OperationDirectory operationDirectory;

    TransferDirectory transferDirectory;
    
    public HospitalInventory() {
        medicineDirectory = new MedicineDirectory();
        equipmentDirectory = new EquipmentDirectory();
        vaccineDirectory = new VaccineDirectory();
        operationDirectory = new OperationDirectory();
        transferDirectory = new TransferDirectory();
        
    }

    public EquipmentDirectory getEquipmentDirectory() {
        return equipmentDirectory;
    }

    public void setEd(ArrayList<Equipment> e) {
        equipmentDirectory.setEquipments(e);
    }

    public VaccineDirectory getVaccineDirectory() {
        return vaccineDirectory;
    }

    public void setVaccineDirectory(ArrayList<Vaccine> vaccine) {
        vaccineDirectory.setVaccines(vaccine);
    }

    public void addVaccine(Vaccine e){
        for(Vaccine m : vaccineDirectory.getVaccines()){
            if(m.getId()==e.getId()&&m.getType().equals(e.getType())){
                m.setQuantity(m.getQuantity()+e.getQuantity());
                return;
            }
        }
        vaccineDirectory.addVaccine(e);
    }
    
    public void addMedicine(Medicine e){
        for(Medicine m : medicineDirectory.getDrugs()){
            if(m.getId().equals(e.getId()) && m.getType().equals(e.getType())){
                m.setQuantity(m.getQuantity() + e.getQuantity());
                return;
            }
        }
        medicineDirectory.addDrugs(e);
    }
    
    public void addEquipment(Equipment e){
        for(Equipment m : equipmentDirectory.getEquipments()){
            if(m.getId()==e.getId()&&m.getType().equals(e.getType())){
                return;
            }
        }
        equipmentDirectory.addEquipment(e);
        
    }
    
    
    public int deleteVaccine(Vaccine e){
        for(Vaccine m : vaccineDirectory.getVaccines()){
            if(m.getId()==e.getId()&&m.getType().equals(e.getType())){
                if(m.getQuantity()-e.getQuantity()<0) return -1;
                m.setQuantity(m.getQuantity()-e.getQuantity());
                return 1;
            }
        }
        return 0;  //no in the hospital
    }
    
    public int deleteMedicine(Medicine e){
        for(Medicine m : medicineDirectory.getDrugs()){
            if(m.getId()==e.getId()&&m.getType().equals(e.getType())){
                 if(m.getQuantity()-e.getQuantity()<0) return -1;
                m.setQuantity(m.getQuantity()-e.getQuantity());
                return 1;
            }
        }
        return 0;  //no in the hospital
    }

    public MedicineDirectory getMedicineDirectory() {
        return medicineDirectory;
    }

    public void setMedicineDirectory(ArrayList<Medicine> medicines) {
        medicineDirectory.setDrugs(medicines);
    }
    

    public OperationDirectory getOperationDirectory() {
        return operationDirectory;
    }

    public void setOperationDirectory(OperationDirectory operationDirectory) {
        this.operationDirectory = operationDirectory;
    }

    public TransferDirectory getTransferDirectory() {
        return transferDirectory;
    }

    public void setTransferDirectory(TransferDirectory transferDirectory) {
        this.transferDirectory = transferDirectory;
    }
}
