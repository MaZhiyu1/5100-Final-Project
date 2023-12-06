/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital;

import Business.Class.Delivery.Order;
import Business.Class.Hospital.Development.HospitalResearch;
import Business.Class.Hospital.Medical.AppointmentDirectory;
import Business.Class.Hospital.Medical.Doctor;
import Business.Class.Hospital.Medical.Patient;
import Business.Class.Hospital.RearServices.RearServices;
import Business.Class.Medicine;
import Business.Class.Vaccine;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author 15469
 */
public class Hospital {
    private String name;
    private String address;
    private ArrayList<Doctor> doctorList;
    private ArrayList<Patient> patients;

    private RearServices rearServices;

    private HospitalResearch hr;
    int k=1;
    
    private HospitalInventory hi;

    private AppointmentDirectory ha;
    ArrayList<Request> requestList;
    ArrayList<Order> orders;

    public Hospital(String name, String address) {
        this.name = name;
        this.address = address;
        doctorList = new ArrayList<>();
        patients = new ArrayList<>();
        hi = new HospitalInventory();
        ha = new AppointmentDirectory();
        requestList = new ArrayList<>();
        orders = new ArrayList<>();
        hr = new HospitalResearch("Researcher","Aa12345678", name, k);
        
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
    
    public HospitalResearch getHr() {
        return hr;
    }

    public void setHr(HospitalResearch hr) {
        this.hr = hr;
    }


    public void addRequest(Request e){
        requestList.add(e);
    }
    public ArrayList<Request> getRequestList() {
        return requestList;
    }

    public void setRequestList(ArrayList<Request> requestList) {
        this.requestList = requestList;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public RearServices getRearServices() {
        return rearServices;
    }

    public void setRearServices(RearServices rearServices) {
        this.rearServices = rearServices;
    }

    public HospitalInventory getHi() {
        return hi;
    }

    public void addRearService(RearServices rearServices){
        this.rearServices = rearServices;
        rearServices.setHospital(this);
    }
    
    public void addOrders(Order e){
        orders.add(e);
    }
    
    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
    
    
    public void addDoctor(Doctor e){
        doctorList.add(e);
    }
    
    public void addPatient(Patient e){
        patients.add(e);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Doctor> getDoctorList() {
        return doctorList;
    }

    public void setDoctorList(ArrayList<Doctor> doctorList) {
        this.doctorList = doctorList;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public HospitalInventory getHospitalInventory() {
        return hi;
    }

    public void setHi(HospitalInventory hi) {
        this.hi = hi;
    }

    public AppointmentDirectory getHa() {
        return ha;
    }

    public void setHa(AppointmentDirectory ha) {
        this.ha = ha;
    }

}
