/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.BioTech;

import Business.Class.Delivery.Order;
import Business.Class.Hospital.HospitalInventory;
import Business.Class.Hospital.Request;
import Business.Class.Medicine;
import Business.Class.Vaccine;
import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class BioTechCom {
    private ArrayList<Lab>labs;
    private ArrayList<BioSupplier> bioSupplier;
    private String name;
    ArrayList<Request> request;
    ArrayList<Order> orders;
    ArrayList<BioResearcher> br;
    private HospitalInventory hi;
    
    public BioTechCom(String name) {
        this.name = name;
        labs = new ArrayList<>();
        br = new ArrayList<>();
        request = new ArrayList<>();
        orders= new ArrayList<>();
        bioSupplier = new ArrayList<>();
        hi = new HospitalInventory();
    }

    public HospitalInventory getHi() {
        return hi;
    }

    
    public void DeliveryAddMedicine(ArrayList<Medicine> v) {
        ArrayList<Medicine> medicinesToAdd = new ArrayList<>();

        for (Medicine v1 : v) {
            int k=0;
            for (Medicine vs : hi.getMedicineDirectory().getMedicines()) {
                if (vs.getName().equals(v1.getName())&&vs.getId().equals(v1.getId())) {
                    vs.setQuantity(v1.getQuantity() + vs.getQuantity());
                    k=1;
                }

            }
            if(k==0){
                medicinesToAdd.add(v1);
            }
        }
        // Add new medicines after the iteration is complete
        for(Medicine m : medicinesToAdd){
             hi.getMedicineDirectory().addMedicine(m );
        }
    }

    
    
    public void DeliveryAddVaccine(ArrayList<Vaccine> v){
    ArrayList<Vaccine> vaccineToAdd = new ArrayList<>();
    
    for (Vaccine v1 : v) {
        int k=0;
        for (Vaccine vs : hi.getVaccineDirectory().getVaccines()) {
            if (vs.getName().equals(v1.getName())) {
                vs.setQuantity(v1.getQuantity() + vs.getQuantity());
                k=1;
            }
        }
        if(k==0){
            vaccineToAdd.add(v1);
        }
    }
    
    // Add new medicines after the iteration is complete
    for(Vaccine m : vaccineToAdd){
         hi.getVaccineDirectory().addVaccine(m );
    }
}
    
    
    public void addBioResaecher(BioResearcher e){
        br.add(e);
    }
    
    
    public ArrayList<BioResearcher> getBr() {
        return br;
    }

    public void setBr(ArrayList<BioResearcher> br) {
        this.br = br;
    }

    
    
    
    public void setHi(HospitalInventory hi) {
        this.hi = hi;
    }

    
    public void addSupplier(BioSupplier bs){
        bioSupplier.add(bs);
    }
    
    public ArrayList<BioSupplier> getBioSupplier() {
        return bioSupplier;
    }

    public void setBioSupplier(ArrayList<BioSupplier> bioSupplier) {
        this.bioSupplier = bioSupplier;
    }

    public void addLab(Lab e){
        labs.add(e);
        e.setCompany(this);
    }
    
    public ArrayList<Lab> getLabs() {
        return labs;
    }

    public void setLabs(ArrayList<Lab> labs) {
        this.labs = labs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Request> getRequest() {
        return request;
    }

    public void setRequest(ArrayList<Request> request) {
        this.request = request;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

}
