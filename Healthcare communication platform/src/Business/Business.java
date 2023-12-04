/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Class.BioTech.BioResearcher;
import Business.Class.BioTech.BioSupplier;
import Business.Class.BioTech.BioTechCom;
import Business.Class.BioTech.Lab;
import Business.Class.Delivery.Delivery;
import Business.Class.Equipment;
import Business.Class.Hospital.Hospital;
import Business.Class.Hospital.Medical.*;
import Business.Class.Hospital.RearServices.RearServices;
import Business.Class.Hospital.Request;
import Business.Class.MedicalSupplier.MedicalSupplier;
import Business.Class.Medicine;
import Business.Class.Vaccine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 *
 * @author 15469
 */
public class Business {
    
    private Hospital h1;
    private Hospital h2;
    private Hospital h3;

    private BioTechCom b1;
    private BioTechCom b2;
    
    private BioSupplier bs1;
    private BioSupplier bs2;
    
    private MedicalSupplier ms;
    private MedicalSupplier ms1;
    
    private ArrayList<BioSupplier> bioSuppliers;
    private ArrayList<BioTechCom> bioTechList;
    private ArrayList<Hospital> hospitals;
    private ArrayList<Patient> patients;
    private ArrayList<MedicalSupplier> medicalSuppliers;
//    private List<Medicine> medicineList;
//    private List<Vaccine> vaccineList;

    private ArrayList<Delivery> deliveries;
    
    public Business() {
        hospitals = new ArrayList<>();
        patients = new ArrayList<>();
        bioTechList = new ArrayList<>();
        bioSuppliers = new ArrayList<>();
        deliveries = new ArrayList<>();
        medicalSuppliers = new ArrayList<>();
//        medicineList = new ArrayList<>();
//        medicalSuppliers = new ArrayList<>();
        Hospital1();
        BioTechCom1();
        MedicalSupplier1();
        Delivery1();
        
    }

    public ArrayList<MedicalSupplier> getMedicalSupplier() {
        return medicalSuppliers;
    }

    public void setMedicalSupplier(ArrayList<MedicalSupplier> medicalSupplier) {
        this.medicalSuppliers = medicalSupplier;
    }

    public ArrayList<Delivery> getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(ArrayList<Delivery> deliveries) {
        this.deliveries = deliveries;
    }

    
    
    public ArrayList<Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospital(ArrayList<Hospital> hospitals) {
        this.hospitals = hospitals;
    }

    public ArrayList<BioSupplier> getBioSupplier() {
        return bioSuppliers;
    }

    public void setBioSupplier(ArrayList<BioSupplier> bioSupplier) {
        this.bioSuppliers = bioSupplier;
    }

    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public void setPatients(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public ArrayList<BioTechCom> getBioTech() {
        return bioTechList;
    }

    public void setBioTech(ArrayList<BioTechCom> bioTech) {
        this.bioTechList = bioTech;
    }
    
    public void Delivery1(){
        Delivery d = new Delivery("USPS", "Hibanna", "");
        Delivery d1 = new Delivery("UPS", "Hibanna", "");
        deliveries.add(d);
        deliveries.add(d1);
    }
    
    
    public void MedicalSupplier1(){
        ms = new  MedicalSupplier("MedTech Innovators");
        Equipment e1 = new Equipment("Anti-Heart Disease", "MedTech 1", "For Use", "Internal Medicine");
        BioSupplier bs = new BioSupplier( "Finka","", "MedTech Supplier");
        ms.addBioSupplier(bs);
        ms.addEquipment(e1);
        
        medicalSuppliers.add(ms);
    }
    

    public void BioTechCom1(){
        Medicine new_m = new Medicine("New Medicine", "Bio", "Heart Disease", "Internal Medicine");
        
        b1 = new BioTechCom("BioGenesis Therapeutics");

        Person jack = new Person(1006, "Jack","male",53);
        
        BioResearcher br = new BioResearcher(jack, "", "1", "BioGenesis Therapeutics");
        b1.addBioResaecher(br);
        Lab lab1 = new Lab(jack, "Internal Medicine", "VICC Project", new_m, null);


        Optional<Doctor> first = h1.getDoctorList().stream().filter(doctor -> "Jim".equals(doctor.getName())).toList().stream().findFirst();

        Lab lab2 = new Lab(first.get(), "Group 1", "VICC Project","Internal Medicine","");

        br.addLab(lab2);
        for(Hospital h : hospitals){
            if(h.getName().equals("Boston Rehabilitation Center")){
                for(Doctor d : h.getDoctorList()){
                    if(d.getName().equals("Jim")){
                        lab1.setDoctor(d);
                        d.getLabs().add(lab1);
                        break;
                    }
                }
            }
        }
        b1.addLab(lab1);

        Medicine medicine = new Medicine("A1", "1", "For Child", "Pediatrics");
        medicine.setQuantity(10);
        Medicine medicine1 = new Medicine("B1", "2", "For Internal", "Internal Medicine");
        medicine1.setQuantity(10);
        Medicine medicine2 = new Medicine("C1", "3", "Surgery", "Surgery");
        medicine2.setQuantity(10);
        ArrayList<Medicine> medicineDirectory = new ArrayList<>();

        medicineDirectory.add(medicine);
        medicineDirectory.add(medicine1);
        medicineDirectory.add(medicine2);
        
        Vaccine v = new Vaccine("V A1", "1", "For Child", "Pediatrics");
        v.setQuantity(10);
        Vaccine v1 = new Vaccine("V B1", "2", "For Internal", "Internal Medicine");
        v1.setQuantity(10);
        Vaccine v2 = new Vaccine("V C1", "3", "Surgery", "Surgery");
        v2.setQuantity(10);
        ArrayList<Vaccine> V = new ArrayList<>();
        
        V.add(v);
        V.add(v1);
        V.add(v2);
        
        Request request = new Request("medicine 1","medicine","For heart disease");
        request.setMedicines(medicine);
        
        BioSupplier bs1_ = new BioSupplier("Mike", "", "BioSupplier 1");
        bs1_.addRequest(request);

        BioSupplier bs2_ = new BioSupplier("Jackson", "", "BioSupplier 2");
        
        //set inventory
        b1.getHi().setMedicineDirectory(medicineDirectory);
        b1.getHi().setVaccineDirectory(V);
        
        //set supplier
        b1.addSupplier(bs1_);
        b1.addSupplier(bs2_);
        bioTechList.add(b1);
    }
    
    
    
    public void Hospital1() {
        h1 = new Hospital("Boston Rehabilitation Center","");
        
        RearServices rs = new RearServices("Jin", "BioGen 1", "Aa12345678", h1 );
        //后勤
        
        Doctor doctor1 = new Doctor(1,"Jim","Aa12345678", "male", h1);
        doctor1.setEnabled(1);
        doctor1.setSpecialty("Surgery");
        doctor1.setType("Surgery");
        doctor1.setAvail(5);
        doctor1.setAge(30);
        doctor1.setEductionBackground("doctor");
        doctor1.setContact("6666666");
        doctor1.setDepartment("Surgery");
        
        Doctor doctor2 = new Doctor(2,"Alex","Aa12345678", "female", h1);
        doctor2.setEnabled(1);
        doctor2.setSpecialty("Pediatrics");
        doctor2.setType("Pediatrics");
        doctor2.setAvail(12);
        doctor2.setAge(33);
        doctor2.setEductionBackground("master");
        doctor2.setContact("7777777");
        doctor2.setDepartment("Pediatrics");
        
        Doctor doctor3 = new Doctor(3,"Frank","Aa12345678", "male",h1);
        doctor3.setEnabled(1);
        doctor3.setSpecialty("Internal Medicine");
        doctor3.setType("Internal Medicine");
        doctor3.setAvail(10);
        doctor3.setAge(50);
        doctor3.setEductionBackground("tutor");
        doctor3.setContact("8888888");
        doctor3.setDepartment("Internal Medicine");
        
        MedicalHistory mh1 = new MedicalHistory("Oliver‘s Medical History","Had server fever","keep warm. Don't eat spicy food");
        MedicalHistory mh2 = new MedicalHistory("Oliver‘s Medical History","Had server headache","keep warm. Don't eat spicy food");
        mh1.setRecoverDays(5);
        mh2.setRecoverDays(3);


        MedicalHistoryDirectory mhl1 = new MedicalHistoryDirectory(1,"Oliver");
        mhl1.addHistory(mh2);
        mhl1.addHistory(mh1);
        mh1.setDoctor(doctor1);
        mh2.setDoctor(doctor2);
        
        Patient patient1 = new Patient(1, "Oliver", "Aa12345678");
        patient1.setMedicalHistoryDirectory(mhl1);
        patient1.setEnabled(1);
        patient1.setAge(12);

        Patient patient2 = new Patient(2, "Jam", "Aa12345678");
        patient2.setEnabled(1);
        patient2.setAge(22);
        
        Patient patient3 = new Patient(3, "Lex", "Aa12345678");
        patient3.setEnabled(1);
        patient3.setAge(42);
        
        
        Appointment a = new Appointment(patient1,doctor1);
        Appointment a1 = new Appointment(patient2,doctor2);
        Appointment a2 = new Appointment(patient3,doctor3);
        ArrayList<Appointment> APPO = new ArrayList<>();
        APPO.add(a);
        APPO.add(a1);
        APPO.add(a2);

        Medicine medicine = new Medicine("M-A1", "1", "For Child", "Pediatrics");
        medicine.setQuantity(10);
        medicine.setInstruction("Take 2 pills per day");
        Medicine medicine1 = new Medicine("M-B1", "2", "For Internal", "Internal Medicine");
        medicine1.setQuantity(10);
        medicine1.setInstruction("Take 3 pills per day");
        Medicine medicine2 = new Medicine("M-C1", "3", "Surgery", "Surgery");
        medicine2.setQuantity(10);
        medicine2.setInstruction("Take 1 pill per day");
        ArrayList<Medicine> medicineDirectory = new ArrayList<>();

        medicineDirectory.add(medicine);
        medicineDirectory.add(medicine1);
        medicineDirectory.add(medicine2);
        
        Vaccine vaccine = new Vaccine("V-A1", "1", "For Child", "Pediatrics");
        vaccine.setQuantity(10);
        vaccine.setInstruction("only for child");
        Vaccine vaccine1 = new Vaccine("V-B1", "2", "For Internal", "Internal Medicine");
        vaccine1.setQuantity(10);
        vaccine1.setInstruction("For Internal");
        Vaccine vaccine2 = new Vaccine("V-C1", "3", "Surgery", "Surgery");
        vaccine2.setQuantity(10);
        vaccine2.setInstruction("For Surgery");
        ArrayList<Vaccine> vaccineDirectory = new ArrayList<>();

        vaccineDirectory.add(vaccine);
        vaccineDirectory.add(vaccine1);
        vaccineDirectory.add(vaccine2);
        
        Equipment equipment = new Equipment("E-A1", "1", "Pediatrics", "For Child");
        equipment.setQuantity(10);
        Equipment equipment1 = new Equipment("E-B1", "2", "Internal Medicine","For Internal" );
        equipment1.setQuantity(10);
        Equipment equipment2 = new Equipment("E-C1", "3", "Surgery", "Surgery");
        equipment2.setQuantity(10);
        ArrayList<Equipment> equipmentDirectory = new ArrayList<>();

        equipmentDirectory.add(equipment);
        equipmentDirectory.add(equipment1);
        equipmentDirectory.add(equipment2);

        Prescription prescription = new Prescription("prescription for server fever",Arrays.asList(medicine, vaccine, equipment));
        mh1.setPrescription(prescription);

        Prescription prescription1 = new Prescription("prescription for server headache",Arrays.asList(medicine1, vaccine1, equipment1));
        mh2.setPrescription(prescription1);

        h1.addRearService(rs);
        
        h1.addDoctor(doctor1);
        h1.addDoctor(doctor2);
        h1.addDoctor(doctor3);
        
        h1.addPatient(patient1);
        h1.addPatient(patient2);
        h1.addPatient(patient3);
        
        h1.getHa().setAppointments(APPO);
        h1.getHospitalInventory().setMedicineDirectory(medicineDirectory);
        h1.getHospitalInventory().setVaccineDirectory(vaccineDirectory);
        h1.getHospitalInventory().setEd(equipmentDirectory);
        
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        hospitals.add(h1);
    }
    
    
    
}
