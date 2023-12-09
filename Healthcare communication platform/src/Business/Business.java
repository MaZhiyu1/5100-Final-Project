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
import Business.Class.Delivery.Order;
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

/**
 *
 * @author 15469
 */
public class Business {
    
    private Hospital h1;
    private Hospital h2;
    private Hospital h3;

    private BioTechCom b1;
    private BioTechCom VitalEdge_Biomedicals;
    
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
        Delivery1();
        Delivery2();
        Hospital1();
        Hospital2();
        Hospital3();
        BioTechCom_BioGenesis_Therapeutics();
        BioTechCom_VitalEdge_Biomedicals();
        MedicalSupplier1();
        
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
        Delivery d = new Delivery("USPS", "Hibanna", "Aa12345678");
        Delivery d1 = new Delivery("UPS", "Hibanna", "Aa12345678");
        deliveries.add(d);
        deliveries.add(d1);
    }
    
    public void Delivery2(){
    // 找到UPS和USPS的Delivery对象
        Delivery ups = null;
        Delivery usps = null;
        for (Delivery delivery : deliveries) {
            if (delivery.getCompany().equals("UPS")) {
                ups = delivery;
            } else if (delivery.getCompany().equals("USPS")) {
                usps = delivery;
            }
        }

        // 创建并添加订单到UPS
        if (ups != null) {
            ups.addOrder(new Order("3", "Delivery for Medicine C1", "Location C", "Address C", "Completed"));
            ups.addOrder(new Order("4", "Delivery for Equipment E1", "Location D", "Address D", "Processing"));
            // 可以继续添加更多订单...
        }

        // 创建并添加订单到USPS
        if (usps != null) {
            usps.addOrder(new Order("5", "Delivery for Vaccine V1", "Location E", "Address E", "Cancelled"));
            usps.addOrder(new Order("6", "Delivery for Medicine A2", "Location F", "Address F", "Completed"));
            // 可以继续添加更多订单...
        }
    }


    
    
    public void MedicalSupplier1(){
        ms = new  MedicalSupplier("MedTech Innovators");
        Equipment e1 = new Equipment("Anti-Heart Disease", "For Use", "Internal Medicine");
        
        Equipment equipment = new Equipment("E-A1",  "Pediatrics", "For Child");
 
        Equipment equipment1 = new Equipment("E-B1",  "Internal Medicine","For Internal" );

        Equipment equipment2 = new Equipment("E-C1", "Surgery", "Surgery");


        BioSupplier bs = new BioSupplier( "Finka","Aa12345678", "MedTech Supplier");
        ms.addBioSupplier(bs);
        ms.addEquipment(e1);
        ms.addEquipment(equipment);
        ms.addEquipment(equipment1);
        ms.addEquipment(equipment2);
        
        medicalSuppliers.add(ms);
    }
    
    public void MedicalSupplier2(){

        ms = new  MedicalSupplier("HealGear Manufacturing");

        Equipment e1 = new Equipment("Anti-Heart Disease", "For Use", "Internal Medicine");
        
        Equipment equipment = new Equipment("EB-A1",  "Pediatrics", "For Child");
 
        Equipment equipment1 = new Equipment("EB-B1",  "Internal Medicine","For Internal" );

        Equipment equipment2 = new Equipment("EB-C1", "Surgery", "Surgery");

        BioSupplier bs = new BioSupplier( "Lucy","Aa12345678", "MedTech Supplier");
        ms.addBioSupplier(bs);
        ms.addEquipment(e1);
        ms.addEquipment(equipment);
        ms.addEquipment(equipment1);
        ms.addEquipment(equipment2);
        
        medicalSuppliers.add(ms);
    }
    

    public void BioTechCom_BioGenesis_Therapeutics(){
        Medicine new_m = new Medicine("New Medicine", "Heart Disease", "Internal Medicine");

        Vaccine vxx = new Vaccine("Vxx A1", "For Child", "Pediatrics");

        b1 = new BioTechCom("BioGenesis Therapeutics");

        Person jack = new Person(1006, "Jack","male",53);
        
        BioResearcher br = new BioResearcher(jack, "Aa12345678", "1", b1);
        b1.addBioResaecher(br);
        Lab lab1 = new Lab(jack, "Internal Medicine", "VICC Project", new_m, vxx);
        lab1.setType("Internal Medicine");
        lab1.setInstruction("it is for VICC Project");
        lab1.setProgress(69);

        //解释:找出名字叫Jim的医生
        Optional<Doctor> Jim = h1.getDoctorList().stream().filter(doctor -> "Jim".equals(doctor.getName())).toList().stream().findFirst();
        //解释:找出名字叫Alex的医生
        Optional<Doctor> Alex = h1.getDoctorList().stream().filter(doctor -> "Alex".equals(doctor.getName())).toList().stream().findFirst();

        Optional<Doctor> Frank = h1.getDoctorList().stream().filter(doctor -> "Frank".equals(doctor.getName())).toList().stream().findFirst();

        Optional<Doctor> Sophia = h1.getDoctorList().stream().filter(doctor -> "Sophia".equals(doctor.getName())).toList().stream().findFirst();

        Optional<Doctor> Matthew = h1.getDoctorList().stream().filter(doctor -> "Matthew".equals(doctor.getName())).toList().stream().findFirst();

        Optional<Doctor> James = h1.getDoctorList().stream().filter(doctor -> "James".equals(doctor.getName())).toList().stream().findFirst();

        Lab lab2 = new Lab(Jim.get(), "Group 2", "VICC Project","Internal Medicine","it is for Internal Medicine");
        Lab lab3 = new Lab(Alex.get(), "Group 3", "VICC Project","Internal Medicine","it is for Internal Medicine");
        Lab lab4 = new Lab(Frank.get(), "Group 4", "VICC Project","Internal Medicine","it is for Internal Medicine");
        Lab lab5 = new Lab(Sophia.get(), "Group 5", "VICC Project","Internal Medicine","it is for Internal Medicine");
        Lab lab6 = new Lab(Matthew.get(), "Group 6", "VICC Project","Internal Medicine","it is for Internal Medicine");
        Lab lab7 = new Lab(James.get(), "Group 7", "VICC Project","Internal Medicine","it is for Internal Medicine");
        //lab add 4 5 6
        lab3.setProgress(23);
        lab4.setProgress(88);
        lab5.setProgress(47);
        lab6.setProgress(100);
        lab7.setProgress(84);


        br.addLab(lab2);
        br.addLab(lab4);
        br.addLab(lab5);
        br.addLab(lab6);

//        for(Hospital h : hospitals){
//            if(h.getName().equals("Boston Rehabilitation Center")){
//                for(Doctor d : h.getDoctorList()){
//                    if(d.getName().equals("Jim")){
//                        lab1.setDoctor(d);
//                        d.getLabs().add(lab1);
//                        break;
//                    }
//                }
//            }
//        }
        
//        for(Hospital h : hospitals){
//            if(h.getName().equals("Boston Rehabilitation Center")){
//                for(Doctor d : h.getDoctorList()){
//                    if(d.getName().equals("Alex")){
//                        lab3.setDoctor(d);
//                        d.getLabs().add(lab3);
//                        break;
//                    }
//                }
//            }
//        }
        b1.addLab(lab1);
        b1.addLab(lab3);
        b1.addLab(lab7);
        
        Lab lab8 = new Lab(Jim.get(), "Group 8", "Heart Disease Research","Cardiology","Focused on heart disease research");
        lab8.setProgress(100);
        lab8.setStatus("Completed");

        Lab lab9 = new Lab(Alex.get(), "Group 9", "Neurological Studies","Neurology","Research on brain functions");
        lab9.setProgress(60);
        lab9.setStatus("Processing");

        Lab lab10 = new Lab(Sophia.get(), "Group 10", "Cancer Research","Oncology","Cancer treatment and research");
        lab10.setProgress(80);
        lab10.setStatus("Processing");

        // 添加实验室到BioTech公司
        b1.addLab(lab8);
        b1.addLab(lab9);
        b1.addLab(lab10);


        Medicine medicine = new Medicine("A1",  "For Child", "Pediatrics");
        medicine.setQuantity(10);
        Medicine medicine1 = new Medicine("B1","For Internal", "Internal Medicine");
        medicine1.setQuantity(10);
        Medicine medicine2 = new Medicine("C1",  "Surgery", "Surgery");
        medicine2.setQuantity(10);
        ArrayList<Medicine> medicineDirectory = new ArrayList<>();

        medicineDirectory.add(medicine);
        medicineDirectory.add(medicine1);
        medicineDirectory.add(medicine2);
        
        Vaccine v = new Vaccine("V A1","For Child", "Pediatrics");
        v.setQuantity(10);
        Vaccine v1 = new Vaccine("V B1",  "For Internal", "Internal Medicine");
        v1.setQuantity(10);
        Vaccine v2 = new Vaccine("V C1", "Surgery", "Surgery");
        v2.setQuantity(10);
        ArrayList<Vaccine> V = new ArrayList<>();
        
        V.add(v);
        V.add(v1);
        V.add(v2);

        Request request1 = new Request("medicine 1","medicine","For heart disease");
        Medicine medicine_A1 = new Medicine("A1",  "For Child", "Pediatrics");
        request1.setMedicine(medicine_A1);

        Request request2 = new Request("medicine 2","medicine","For heart disease");
        Medicine medicine_A2 = new Medicine("A2",  "For Child", "Pediatrics");
        request2.setMedicine(medicine_A2);

        Request request3 = new Request("medicine 3","medicine","For heart disease");
        Medicine medicine_A3 = new Medicine("A3",  "For Child", "Pediatrics");
        request3.setMedicine(medicine_A3);

        Request request4 = new Request("medicine 4","medicine","For heart disease");
        Medicine medicine_A4 = new Medicine("A4",  "For Child", "Pediatrics");
        request3.setMedicine(medicine_A4);

        Request request5 = new Request("medicine 5","medicine","For heart disease");
        Medicine medicine_A5 = new Medicine("A5",  "For Child", "Pediatrics");
        request3.setMedicine(medicine_A5);

        Request request6 = new Request("medicine 6","medicine","For heart disease");
        Medicine medicine_A6 = new Medicine("A6",  "For Child", "Pediatrics");
        request3.setMedicine(medicine_A6);

        
        //➕+++
        // 添加额外的实验室数据
        Lab lab12 = new Lab(Jim.get(), "Cardiovascular Research", "Heart Disease Research", new_m, vxx);
        lab12.setProgress(100);
        lab12.setStatus("Completed");

        Lab lab13 = new Lab(Alex.get(), "Neurological Research", "Brain Function Study", new_m, vxx);
        lab13.setProgress(80);
        lab13.setStatus("Processing");

        // 添加实验室到 BioGenesis Therapeutics
        b1.addLab(lab12);
        b1.addLab(lab13);

        // 添加额外的订单和请求
        Order order1 = new Order("1", "Delivery for Medicine A1", "Location A", "Address A", "Completed");
        Order order2 = new Order("2", "Delivery for Medicine B1", "Location B", "Address B", "Processing");

        b1.addOrder(order1);
        b1.addOrder(order2);

        Request request7 = new Request("Request for Medicine C1", "medicine", "For diabetes treatment");
        Request request8 = new Request("Request for Medicine D1", "medicine", "For allergy treatment");
        b1.addRequest(request7);
        b1.addRequest(request8);


        BioSupplier bs1_ = new BioSupplier("Mike", "Aa12345678", "BioSupplier 1");
        bs1_.addRequest(request1);
        b1.addRequest(request1);

        bs1_.addRequest(request2);
        b1.addRequest(request2);

        h1.addRequest(request1);
        h1.addRequest(request2);
        h1.addRequest(request3);

        //request 1、2、3..

        BioSupplier bs2_ = new BioSupplier("Jackson", "Aa12345678", "BioSupplier 2");
        bs2_.addRequest(request3);
        b1.addRequest(request3);

        bs2_.addRequest(request4);
        b1.addRequest(request4);

        bs2_.addRequest(request5);
        b1.addRequest(request5);

        bs2_.addRequest(request6);
        b1.addRequest(request6);

        //set inventory
        b1.getHi().setMedicineDirectory(medicineDirectory);
        b1.getHi().setVaccineDirectory(V);
        
        //set supplier
        b1.addSupplier(bs1_);
        b1.addSupplier(bs2_);
        bioTechList.add(b1);
    }


    public void BioTechCom_VitalEdge_Biomedicals(){

        VitalEdge_Biomedicals = new BioTechCom("VitalEdge Biomedicals");

        Medicine medicine_loratadine = new Medicine("Loratadine", "Loratadine is an antihistamine medication used to relieve allergy symptoms", "non-sedating antihistamines");

        Vaccine vaccine_polio = new Vaccine("Polio vaccine", "The Polio vaccine is a vaccine used to prevent poliomyelitis, commonly known as polio", "Oral Polio Vaccine");

        Person Emily = new Person(10021, "Emily","female",45);

        BioResearcher br = new BioResearcher(Emily, "Aa12345678","1", VitalEdge_Biomedicals);

        VitalEdge_Biomedicals.addBioResaecher(br);

        Optional<Doctor> Alexy = h2.getDoctorList().stream().filter(doctor -> "Alexy".equals(doctor.getName())).toList().stream().findFirst();

        Lab lab12 = new Lab(Alexy.get(), "Cardiovascular Research", "Heart Disease Research", medicine_loratadine, vaccine_polio);
        lab12.setProgress(100);
        lab12.setStatus("Completed");
        br.addLab(lab12);
        Alexy.get().addLab(lab12);
        Lab lab1 = new Lab(Emily, "External Medicine", "Antihistamine Project", medicine_loratadine, vaccine_polio);
        VitalEdge_Biomedicals.addLab(lab12);

        Optional<Doctor> Jimy = h2.getDoctorList().stream().filter(doctor -> "Jimy".equals(doctor.getName())).toList().stream().findFirst();
        Lab lab15 = new Lab(Jimy.get(), "Cardiovascular Research", "Heart Disease Research", medicine_loratadine, vaccine_polio);
        lab15.setProgress(60);
        lab15.setStatus("Processing");
        br.addLab(lab15);
        Jimy.get().addLab(lab15);
        VitalEdge_Biomedicals.addLab(lab15);

        

        Optional<Doctor> Fran = h3.getDoctorList().stream().filter(doctor -> "Fran".equals(doctor.getName())).toList().stream().findFirst();

        Lab lab13 = new Lab(Fran.get(), "Cardiovascular Research", "Heart Disease Research", medicine_loratadine, vaccine_polio);
        lab13.setProgress(20);
        lab13.setStatus("Processing");
        br.addLab(lab13);
        Fran.get().addLab(lab13);
        VitalEdge_Biomedicals.addLab(lab13);

        
        Optional<Doctor> Ale = h3.getDoctorList().stream().filter(doctor -> "Ale".equals(doctor.getName())).toList().stream().findFirst();
        Lab lab16 = new Lab(Ale.get(), "Cardiovascular Research", "Heart Disease Research", medicine_loratadine, vaccine_polio);
        lab16.setProgress(100);
        lab16.setStatus("Completed");
        br.addLab(lab16);
        Ale.get().addLab(lab16);
        VitalEdge_Biomedicals.addLab(lab16);

        
        lab1.setType("External Medicine");
        lab1.setInstruction("on-sedating antihistamines");
        lab1.setProgress(22);

        Optional<Doctor> first = h1.getDoctorList().stream().filter(doctor -> "Alex".equals(doctor.getName())).toList().stream().findFirst();

        Lab lab2 = new Lab(first.get(), "Group 1", "VICC Project","Internal Medicine","it is for Internal Medicine");
        
        br.addLab(lab2);
//        for(Hospital h : hospitals){
//            if(h.getName().equals("Boston Rehabilitation Center")){
//                for(Doctor d : h.getDoctorList()){
//                    if(d.getName().equals("Alex")){
//                        lab1.setDoctor(d);
//                        d.getLabs().add(lab1);
//                        break;
//                    }
//                }
//            }
//        }
        VitalEdge_Biomedicals.addLab(lab1);
        
        
        //add lab
        Lab lab11 = new Lab(Emily, "Immunology Research", "Immunotherapy", medicine_loratadine, vaccine_polio);
        lab11.setType("Immunology");
        lab11.setInstruction("Research on immune system enhancements");
        lab11.setProgress(50);
        lab11.setStatus("Processing");

        VitalEdge_Biomedicals.addLab(lab11);
        
        // 添加额外的实验室数据
        Lab lab14 = new Lab(Emily, "Immunotherapy Research", "New Vaccine Development", medicine_loratadine, vaccine_polio);
        lab14.setProgress(70);
        lab14.setStatus("Completed");

        // 添加实验室到 VitalEdge Biomedicals
        VitalEdge_Biomedicals.addLab(lab14);

        // 添加额外的订单和请求
        Order order3 = new Order("1", "Delivery for Medicine A1", "Location A", "Address A", "Completed");
        Order order4 = new Order("2", "Delivery for Medicine B1", "Location B", "Address B", "Processing");
        VitalEdge_Biomedicals.addOrder(order3);
        VitalEdge_Biomedicals.addOrder(order4);
//看看完成的Request咋写
        Request request9 = new Request("Request for Equipment E1", "equipment", "For lab research");
        Request request10 = new Request("Request for Equipment E2", "equipment", "For field studies");
        request9.setStatus("Compelted");
        request10.setStatus("Compelted");
        VitalEdge_Biomedicals.addRequest(request9);
        VitalEdge_Biomedicals.addRequest(request10);
        
        Medicine medicine = new Medicine("AAAA1",  "For Child", "Pediatrics");
        medicine.setQuantity(177345);
        Medicine medicine1 = new Medicine("BBBB1","For Internal", "Internal Medicine");
        medicine1.setQuantity(14565);
        Medicine medicine2 = new Medicine("CCCC1",  "Surgery", "Surgery");
        medicine2.setQuantity(63456);
        ArrayList<Medicine> medicineDirectory = new ArrayList<>();

        medicineDirectory.add(medicine);
        medicineDirectory.add(medicine1);
        medicineDirectory.add(medicine2);

        Vaccine v = new Vaccine("VVV A1","For Child", "Pediatrics");
        v.setQuantity(10);
        Vaccine v1 = new Vaccine("VVV B1",  "For Internal", "Internal Medicine");
        v1.setQuantity(10);
        Vaccine v2 = new Vaccine("VVV C1", "Surgery", "Surgery");
        v2.setQuantity(10);
        ArrayList<Vaccine> vaccineArrayList = new ArrayList<>();

        vaccineArrayList.add(v);
        vaccineArrayList.add(v1);
        vaccineArrayList.add(v2);

        Request request = new Request("medicine 1","medicine","For heart disease");
        request.setMedicine(medicine);

        BioSupplier bs1_ = new BioSupplier("Lily", "Aa12345678", "BioSupplier 1");
        bs1_.addRequest(request);

        BioSupplier bs2_ = new BioSupplier("David ", "Aa12345678", "BioSupplier 2");

        //set inventory
        VitalEdge_Biomedicals.getHi().setMedicineDirectory(medicineDirectory);
        VitalEdge_Biomedicals.getHi().setVaccineDirectory(vaccineArrayList);

        //set supplier
        VitalEdge_Biomedicals.addSupplier(bs1_);
        VitalEdge_Biomedicals.addSupplier(bs2_);
        bioTechList.add(VitalEdge_Biomedicals);
    }
    
    
    
    public void Hospital1() {
        h1 = new Hospital("Boston Rehabilitation Center","");
        
        RearServices rs = new RearServices("Jin", "BioGen 1", "Aa12345678", h1 );
        //后勤
        RearServices rs2 = new RearServices("Ava", "BioGen 2", "Aa12345678", h1 );
        
        //医生
        Doctor doctor_Jim = new Doctor(1,"Jim","Aa12345678", "male", h1);
        doctor_Jim.setEnabled(1);
        doctor_Jim.setSpecialty("Surgery");
        doctor_Jim.setType("Surgery");
        doctor_Jim.setAvail(5);
        doctor_Jim.setAge(30);
        doctor_Jim.setEductionBackground("doctor");
        doctor_Jim.setContact("6666666");
        doctor_Jim.setDepartment("Surgery");
        
        Doctor doctor_Alex = new Doctor(2,"Alex","Aa12345678", "female", h1);
        doctor_Alex.setEnabled(1);
        doctor_Alex.setSpecialty("Pediatrics");
        doctor_Alex.setType("Pediatrics");
        doctor_Alex.setAvail(12);
        doctor_Alex.setAge(33);
        doctor_Alex.setEductionBackground("master");
        doctor_Alex.setContact("7777777");
        doctor_Alex.setDepartment("Pediatrics");
        
        Doctor doctor_Frank= new Doctor(3,"Frank","Aa12345678", "male",h1);
        doctor_Frank.setEnabled(1);
        doctor_Frank.setSpecialty("Internal Medicine");
        doctor_Frank.setType("Internal Medicine");
        doctor_Frank.setAvail(10);
        doctor_Frank.setAge(50);
        doctor_Frank.setEductionBackground("tutor");
        doctor_Frank.setContact("8888888");
        doctor_Frank.setDepartment("Internal Medicine");

        Doctor doctor_Sophia = new Doctor(4,"Sophia","Aa12345678", "female",h1);
        doctor_Sophia.setEnabled(1);
        doctor_Sophia.setSpecialty("Internal Otolaryngology");
        doctor_Sophia.setType("Otolaryngology");
        doctor_Sophia.setAvail(10);
        doctor_Sophia.setAge(50);
        doctor_Sophia.setEductionBackground("tutor");
        doctor_Sophia.setContact("8888888");
        doctor_Sophia.setDepartment("Otolaryngology Department");


        Doctor doctor_Matthew = new Doctor(5,"Matthew","Aa12345678", "male",h1);
        doctor_Matthew.setEnabled(1);
        doctor_Matthew.setSpecialty("Internal Neurology");
        doctor_Matthew.setType("Neurology");
        doctor_Matthew.setAvail(10);
        doctor_Matthew.setAge(50);
        doctor_Matthew.setEductionBackground("tutor");
        doctor_Matthew.setContact("8888888");
        doctor_Matthew.setDepartment("Neurology Department");

        Doctor doctor_James = new Doctor(6,"James","Aa12345678", "male",h1);
        doctor_James.setEnabled(1);
        doctor_James.setSpecialty("Hepatology ");
        doctor_James.setType("Hepatology");
        doctor_James.setAvail(10);
        doctor_James.setAge(50);
        doctor_James.setEductionBackground("tutor");
        doctor_James.setContact("8888888");
        doctor_James.setDepartment("Hepatology Department");
        
        //病历
        MedicalHistory mh1 = new MedicalHistory("Oliver‘s Medical History","Had server fever","keep warm. Don't eat spicy food");
        MedicalHistory mh2 = new MedicalHistory("Oliver‘s Medical History","Had server headache","keep warm. Don't eat spicy food");
        mh1.setRecoverDays(5);
        mh1.setFeedbackRate(8);
        mh1.setDoctor(doctor_Jim);
        mh2.setRecoverDays(3);
        mh2.setFeedbackRate(9);
        mh2.setDoctor(doctor_Alex);

        MedicalHistoryDirectory mhl1 = new MedicalHistoryDirectory(1,"Oliver");
        mhl1.addHistory(mh1);
        mhl1.addHistory(mh2);
        
        MedicalHistory mh3 = new MedicalHistory("Jam‘s Medical History","Had server fever","keep warm. Don't eat spicy food");
        MedicalHistory mh4 = new MedicalHistory("Jam‘s Medical History","Had server headache","keep warm. Don't eat spicy food");
        mh3.setRecoverDays(30);
        mh3.setFeedbackRate(4);
        mh4.setRecoverDays(3);
        mh4.setFeedbackRate(8);


        MedicalHistoryDirectory mhl2 = new MedicalHistoryDirectory(2,"Jam");
        mhl2.addHistory(mh4);
        mhl2.addHistory(mh3);
        mh3.setDoctor(doctor_Frank);
        mh4.setDoctor(doctor_Alex);
        
        MedicalHistory mh5 = new MedicalHistory("Noah‘s Medical History","Had server fever","keep warm. Don't eat spicy food");
        MedicalHistory mh6 = new MedicalHistory("Noah‘s Medical History","Had server headache","keep warm. Don't eat spicy food");
        mh5.setRecoverDays(30);
        mh5.setFeedbackRate(4);
        mh6.setRecoverDays(3);
        mh6.setFeedbackRate(8);


        MedicalHistoryDirectory mhl3 = new MedicalHistoryDirectory(3,"Noah");
        mhl3.addHistory(mh5);
        mhl3.addHistory(mh6);
        mh5.setDoctor(doctor_Frank);
        mh6.setDoctor(doctor_Alex);
        
        // 在Hospital1方法内添加以下代码

// Oliver的新病历
        MedicalHistory mh13 = new MedicalHistory("Oliver‘s Medical History", "Bronchitis", "Rest, hydrate and use prescribed inhalers");
        mh13.setRecoverDays(14);
        mh13.setFeedbackRate(7);
        mh13.setDoctor(doctor_Jim);
        mhl1.addHistory(mh13); // 添加到Oliver的病历目录

        // Jam的新病历
        MedicalHistory mh14 = new MedicalHistory("Jam‘s Medical History", "Tonsillitis", "Antibiotics and rest");
        mh14.setRecoverDays(10);
        mh14.setFeedbackRate(8);
        mh14.setDoctor(doctor_Alex);
        mhl2.addHistory(mh14); // 添加到Jam的病历目录

        // Lex的新病历
        MedicalHistory mh15 = new MedicalHistory("Lex‘s Medical History", "Hypertension", "Medication and lifestyle changes");
        mh15.setRecoverDays(30);
        mh15.setFeedbackRate(7);
        mh15.setDoctor(doctor_Frank);
        MedicalHistoryDirectory mhl10 = new MedicalHistoryDirectory(10, "Lex");
        mhl10.addHistory(mh15);
        // 设置Lex的病历目录

        // Noah的新病历
        MedicalHistory mh16 = new MedicalHistory("Noah‘s Medical History", "Diabetes management", "Insulin therapy and dietary adjustments");
        mh16.setRecoverDays(30);
        mh16.setFeedbackRate(9);
        mh16.setDoctor(doctor_Matthew);
        mhl3.addHistory(mh16); // 添加到Noah的病历目录

        // Nancy的新病历
        MedicalHistory mh17 = new MedicalHistory("Nancy‘s Medical History", "Arthritis", "Pain management and physical therapy");
        mh17.setRecoverDays(20);
        mh17.setFeedbackRate(8);
        mh17.setDoctor(doctor_Sophia);
        MedicalHistoryDirectory mhl11 = new MedicalHistoryDirectory(11, "Nancy");
        mhl11.addHistory(mh17);


        // Peter的新病历
        MedicalHistory mh18 = new MedicalHistory("Peter‘s Medical History", "Gastritis", "Medication and dietary modifications");
        mh18.setRecoverDays(15);
        mh18.setFeedbackRate(7);
        mh18.setDoctor(doctor_James);
        MedicalHistoryDirectory mhl12 = new MedicalHistoryDirectory(12, "Peter");
        mhl12.addHistory(mh18);



        //患者
        Patient patient1 = new Patient(1, "Oliver", "Aa12345678");
        patient1.setMedicalHistoryDirectory(mhl1);
        patient1.setEnabled(1);
        patient1.setAge(12);
        patient1.setAllergy("No");
        patient1.setInsurance("Blue Cross");

        Patient patient2 = new Patient(2, "Jam", "Aa12345678");
        patient2.setMedicalHistoryDirectory(mhl2);
        patient2.setEnabled(1);
        patient2.setAge(22);
        
        Patient patient3 = new Patient(3, "Lex", "Aa12345678");
        patient3.setEnabled(1);
        patient3.setAge(42);
        patient3.setMedicalHistoryDirectory(mhl10); 
        
        Patient patient4 = new Patient(4, "Noah", "Aa12345678");
        patient4.setEnabled(1);
        patient4.setAge(42);
        patient4.setMedicalHistoryDirectory(mhl3);
        
        Patient patient5 = new Patient(5, "Nancy", "Aa12345678");
        patient5.setEnabled(1);
        patient5.setAge(42);
        patient5.setMedicalHistoryDirectory(mhl11); // 设置Nancy的病历目录
        
        Patient patient6 = new Patient(6, "Peter", "Aa12345678");
        patient6.setEnabled(1);
        patient6.setAge(42);
        patient6.setMedicalHistoryDirectory(mhl12); // 设置Peter的病历目录
        
        
        Appointment a = new Appointment(patient1,doctor_Jim);
        Appointment a1 = new Appointment(patient2,doctor_Alex);
        Appointment a2 = new Appointment(patient3,doctor_Frank);
        Appointment a3 = new Appointment(patient4,doctor_Alex);
        ArrayList<Appointment> APPO = new ArrayList<>();
        APPO.add(a);
        APPO.add(a1);
        APPO.add(a2);
        APPO.add(a3);

        Medicine medicine = new Medicine("M-A1", "For Child", "Pediatrics");
        medicine.setQuantity(10);
        medicine.setInstruction("Take 2 pills per day");
        Medicine medicine1 = new Medicine("M-B1",  "For Internal", "Internal Medicine");
        medicine1.setQuantity(10);
        medicine1.setInstruction("Take 3 pills per day");
        Medicine medicine2 = new Medicine("M-C1",  "Surgery", "Surgery");
        medicine2.setQuantity(10);
        medicine2.setInstruction("Take 1 pill per day");
        ArrayList<Medicine> medicineDirectory = new ArrayList<>();

        medicineDirectory.add(medicine);
        medicineDirectory.add(medicine1);
        medicineDirectory.add(medicine2);
        
        Vaccine vaccine = new Vaccine("V-A1",  "For Child", "Pediatrics");
        vaccine.setQuantity(10);
        vaccine.setInstruction("only for child");
        Vaccine vaccine1 = new Vaccine("V-B1",  "For Internal", "Internal Medicine");
        vaccine1.setQuantity(10);
        vaccine1.setInstruction("For Internal");
        Vaccine vaccine2 = new Vaccine("V-C1", "Surgery", "Surgery");
        vaccine2.setQuantity(10);
        vaccine2.setInstruction("For Surgery");
        ArrayList<Vaccine> vaccineDirectory = new ArrayList<>();

        vaccineDirectory.add(vaccine);
        vaccineDirectory.add(vaccine1);
        vaccineDirectory.add(vaccine2);
        
        Equipment equipment = new Equipment("E-A1",  "Pediatrics", "For Child");
        equipment.setQuantity(1);
        Equipment equipment1 = new Equipment("E-B1",  "Internal Medicine","For Internal" );
        equipment1.setQuantity(10);
        Equipment equipment2 = new Equipment("E-C1", "Surgery", "Surgery");
        equipment2.setQuantity(10);
        ArrayList<Equipment> equipmentDirectory = new ArrayList<>();

        equipmentDirectory.add(equipment);
        equipmentDirectory.add(equipment1);
        equipmentDirectory.add(equipment2);

        Prescription prescription = new Prescription("prescription for server fever",Arrays.asList(medicine, vaccine, equipment));
        mh1.setPrescription(prescription);

        Prescription prescription1 = new Prescription("prescription for server headache",Arrays.asList(medicine1, vaccine1, equipment1));
        mh2.setPrescription(prescription1);
        
        Prescription prescription2 = new Prescription("prescription for server fever",Arrays.asList(medicine, vaccine, equipment));
        mh3.setPrescription(prescription2);

        Prescription prescription3 = new Prescription("prescription for server headache",Arrays.asList(medicine1, vaccine1, equipment1));
        mh4.setPrescription(prescription3);
        
        //lab
        

        h1.addRearService(rs);
        h1.addRearService(rs2);

        h1.addDoctor(doctor_Jim);
        h1.addDoctor(doctor_Alex);
        h1.addDoctor(doctor_Frank);
        h1.addDoctor(doctor_Sophia);
        h1.addDoctor(doctor_Matthew);
        h1.addDoctor(doctor_James);

        h1.addPatient(patient1);
        h1.addPatient(patient2);
        h1.addPatient(patient3);
        h1.addPatient(patient4);
        h1.addPatient(patient5);
        h1.addPatient(patient6);
        
        h1.getHa().setAppointments(APPO);
        h1.getHospitalInventory().setMedicineDirectory(medicineDirectory);
        h1.getHospitalInventory().setVaccineDirectory(vaccineDirectory);
        h1.getHospitalInventory().setEd(equipmentDirectory);
        
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        patients.add(patient4);
        patients.add(patient5);
        patients.add(patient6);
        hospitals.add(h1);
    }
    



    public void Hospital2() {
        h2 = new Hospital("Future Medical Institute","");
        
        RearServices rs = new RearServices("Jing", "BioGen 1", "Aa12345678", h2 );
        //后勤
        
        Doctor doctor_Jim = new Doctor(1,"Jimy","Aa12345678", "male", h2);
        doctor_Jim.setEnabled(1);
        doctor_Jim.setSpecialty("Surgery");
        doctor_Jim.setType("Surgery");
        doctor_Jim.setAvail(5);
        doctor_Jim.setAge(30);
        doctor_Jim.setEductionBackground("doctor");
        doctor_Jim.setContact("6666666");
        doctor_Jim.setDepartment("Surgery");
        
        Doctor doctor_Alex = new Doctor(2,"Alexy","Aa12345678", "female", h2);
        doctor_Alex.setEnabled(1);
        doctor_Alex.setSpecialty("Pediatrics");
        doctor_Alex.setType("Pediatrics");
        doctor_Alex.setAvail(12);
        doctor_Alex.setAge(33);
        doctor_Alex.setEductionBackground("master");
        doctor_Alex.setContact("7777777");
        doctor_Alex.setDepartment("Pediatrics");
        
        Doctor doctor_Frank = new Doctor(3,"Franky","Aa12345678", "male",h2);
        doctor_Frank.setEnabled(1);
        doctor_Frank.setSpecialty("Internal Medicine");
        doctor_Frank.setType("Internal Medicine");
        doctor_Frank.setAvail(10);
        doctor_Frank.setAge(50);
        doctor_Frank.setEductionBackground("tutor");
        doctor_Frank.setContact("8888888");
        doctor_Frank.setDepartment("Internal Medicine");
        
        MedicalHistory mh1 = new MedicalHistory("Python‘s Medical History","Had server fever","keep warm. Don't eat spicy food");
        MedicalHistory mh2 = new MedicalHistory("Python‘s Medical History","Had server headache","keep warm. Don't eat spicy food");
        mh1.setRecoverDays(5);
        mh2.setRecoverDays(3);


        MedicalHistoryDirectory mhl1 = new MedicalHistoryDirectory(1,"Python");
        mhl1.addHistory(mh2);
        mhl1.addHistory(mh1);
        mh1.setDoctor(doctor_Jim);
        mh2.setDoctor(doctor_Alex);
        
        // 为Python增加三条病历
        MedicalHistory mh3 = new MedicalHistory("Python‘s Medical History", "Laceration", "Clean and bandage the wound, tetanus shot if needed");
        mh3.setRecoverDays(7);
        mh3.setFeedbackRate(7);
        mh3.setDoctor(doctor_Jim);
        mhl1.addHistory(mh3);

        MedicalHistory mh4 = new MedicalHistory("Python‘s Medical History", "Insomnia", "Improve sleep hygiene, consider short-term sleep aids");
        mh4.setRecoverDays(14);
        mh4.setFeedbackRate(6);
        mh4.setDoctor(doctor_Alex);
        mhl1.addHistory(mh4);

        MedicalHistory mh5 = new MedicalHistory("Python‘s Medical History", "Anxiety", "Counseling, and possibly medication");
        mh5.setRecoverDays(30);
        mh5.setFeedbackRate(7);
        mh5.setDoctor(doctor_Frank);
        mhl1.addHistory(mh5);

        // 为James增加三条病历
        MedicalHistory mh6 = new MedicalHistory("James‘s Medical History", "Fractured wrist", "Cast for 6 weeks, pain management");
        mh6.setRecoverDays(42);
        mh6.setFeedbackRate(8);
        mh6.setDoctor(doctor_Jim);
        MedicalHistoryDirectory mhl2 = new MedicalHistoryDirectory(2, "James");
        mhl2.addHistory(mh6);

        MedicalHistory mh7 = new MedicalHistory("James‘s Medical History", "Allergic rhinitis", "Antihistamines and avoid allergens");
        mh7.setRecoverDays(14);
        mh7.setFeedbackRate(7);
        mh7.setDoctor(doctor_Alex);
        mhl2.addHistory(mh7);

        MedicalHistory mh8 = new MedicalHistory("James‘s Medical History", "Acne", "Topical treatments, oral antibiotics if severe");
        mh8.setRecoverDays(30);
        mh8.setFeedbackRate(7);
        mh8.setDoctor(doctor_Frank);
        mhl2.addHistory(mh8);


        // 为Lexy增加三条病历
        MedicalHistory mh9 = new MedicalHistory("Lexy‘s Medical History", "Migraine", "Pain relief medication, avoid triggers");
        mh9.setRecoverDays(3);
        mh9.setFeedbackRate(8);
        mh9.setDoctor(doctor_Jim);
        MedicalHistoryDirectory mhl3 = new MedicalHistoryDirectory(3, "Lexy");
        mhl3.addHistory(mh9);

        MedicalHistory mh10 = new MedicalHistory("Lexy‘s Medical History", "Sprained ankle", "Rest, ice, compression, and elevation");
        mh10.setRecoverDays(21);
        mh10.setFeedbackRate(8);
        mh10.setDoctor(doctor_Alex);
        mhl3.addHistory(mh10);

        MedicalHistory mh11 = new MedicalHistory("Lexy‘s Medical History", "Gastroenteritis", "Stay hydrated, rest, bland diet");
        mh11.setRecoverDays(7);
        mh11.setFeedbackRate(7);
        mh11.setDoctor(doctor_Frank);
        mhl3.addHistory(mh11);
        
        Patient patient1 = new Patient(7, "Python", "Aa12345678");
        patient1.setMedicalHistoryDirectory(mhl1);
        patient1.setEnabled(1);
        patient1.setAge(52);
        patient1.setAllergy("No");
        patient1.setInsurance("Blue Cross");
        patient1.setMedicalHistoryDirectory(mhl1);

        Patient patient2 = new Patient(8, "James", "Aa12345678");
        patient2.setEnabled(1);
        patient2.setAge(23);
        patient2.setMedicalHistoryDirectory(mhl2);
        
        Patient patient3 = new Patient(9, "Lexy", "Aa12345678");
        patient3.setEnabled(1);
        patient3.setAge(42);
        patient3.setMedicalHistoryDirectory(mhl3);
        
        
        Appointment a = new Appointment(patient1,doctor_Jim);
        Appointment a1 = new Appointment(patient2,doctor_Alex);
        Appointment a2 = new Appointment(patient3,doctor_Frank);
        ArrayList<Appointment> APPO = new ArrayList<>();
        APPO.add(a);
        APPO.add(a1);
        APPO.add(a2);

        Medicine medicine = new Medicine("M-A1", "For Child", "Pediatrics");
        medicine.setQuantity(10);
        medicine.setInstruction("Take 2 pills per day");
        Medicine medicine1 = new Medicine("M-B1",  "For Internal", "Internal Medicine");
        medicine1.setQuantity(10);
        medicine1.setInstruction("Take 3 pills per day");
        Medicine medicine2 = new Medicine("M-C1",  "Surgery", "Surgery");
        medicine2.setQuantity(10);
        medicine2.setInstruction("Take 1 pill per day");
        ArrayList<Medicine> medicineDirectory = new ArrayList<>();

        medicineDirectory.add(medicine);
        medicineDirectory.add(medicine1);
        medicineDirectory.add(medicine2);
        
        Vaccine vaccine = new Vaccine("V-A1",  "For Child", "Pediatrics");
        vaccine.setQuantity(10);
        vaccine.setInstruction("only for child");
        Vaccine vaccine1 = new Vaccine("V-B1",  "For Internal", "Internal Medicine");
        vaccine1.setQuantity(10);
        vaccine1.setInstruction("For Internal");
        Vaccine vaccine2 = new Vaccine("V-C1", "Surgery", "Surgery");
        vaccine2.setQuantity(10);
        vaccine2.setInstruction("For Surgery");
        ArrayList<Vaccine> vaccineDirectory = new ArrayList<>();

        vaccineDirectory.add(vaccine);
        vaccineDirectory.add(vaccine1);
        vaccineDirectory.add(vaccine2);
        
        Equipment equipment = new Equipment("E-A1",  "Pediatrics", "For Child");
        equipment.setQuantity(10);
        Equipment equipment1 = new Equipment("E-B1",  "Internal Medicine","For Internal" );
        equipment1.setQuantity(10);
        Equipment equipment2 = new Equipment("E-C1", "Surgery", "Surgery");
        equipment2.setQuantity(10);
        ArrayList<Equipment> equipmentDirectory = new ArrayList<>();

        equipmentDirectory.add(equipment);
        equipmentDirectory.add(equipment1);
        equipmentDirectory.add(equipment2);

        Prescription prescription = new Prescription("prescription for server fever",Arrays.asList(medicine, vaccine, equipment));
        mh1.setPrescription(prescription);

        Prescription prescription1 = new Prescription("prescription for server headache",Arrays.asList(medicine1, vaccine1, equipment1));
        mh2.setPrescription(prescription1);

        h2.addRearService(rs);
        
        h2.addDoctor(doctor_Jim);
        h2.addDoctor(doctor_Alex);
        h2.addDoctor(doctor_Frank);
        
        h2.addPatient(patient1);
        h2.addPatient(patient2);
        h2.addPatient(patient3);
        
        h2.getHa().setAppointments(APPO);
        h2.getHospitalInventory().setMedicineDirectory(medicineDirectory);
        h2.getHospitalInventory().setVaccineDirectory(vaccineDirectory);
        h2.getHospitalInventory().setEd(equipmentDirectory);
        
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        hospitals.add(h2);
    }
    
    public void Hospital3() {
        h3 = new Hospital("Verdant Health Hospital","");
        
        RearServices rs = new RearServices("Ji", "BioGen 1", "Aa12345678", h3 );
        //后勤
        
        Doctor doctor_Jim = new Doctor(1,"Ji","Aa12345678", "male", h3);
        doctor_Jim.setEnabled(1);
        doctor_Jim.setSpecialty("Surgery");
        doctor_Jim.setType("Surgery");
        doctor_Jim.setAvail(5);
        doctor_Jim.setAge(30);
        doctor_Jim.setEductionBackground("doctor");
        doctor_Jim.setContact("6666666");
        doctor_Jim.setDepartment("Surgery");
        
        Doctor doctor_Alex = new Doctor(2,"Ale","Aa12345678", "female", h3);
        doctor_Alex.setEnabled(1);
        doctor_Alex.setSpecialty("Pediatrics");
        doctor_Alex.setType("Pediatrics");
        doctor_Alex.setAvail(12);
        doctor_Alex.setAge(33);
        doctor_Alex.setEductionBackground("master");
        doctor_Alex.setContact("7777777");
        doctor_Alex.setDepartment("Pediatrics");
        
        Doctor doctor_Frank = new Doctor(3,"Fran","Aa12345678", "male",h3);
        doctor_Frank.setEnabled(1);
        doctor_Frank.setSpecialty("Internal Medicine");
        doctor_Frank.setType("Internal Medicine");
        doctor_Frank.setAvail(10);
        doctor_Frank.setAge(50);
        doctor_Frank.setEductionBackground("tutor");
        doctor_Frank.setContact("8888888");
        doctor_Frank.setDepartment("Internal Medicine");
        
        MedicalHistory mh1 = new MedicalHistory("Magic‘s Medical History","Had server fever","keep warm. Don't eat spicy food");
        MedicalHistory mh2 = new MedicalHistory("Magic‘s Medical History","Had server headache","keep warm. Don't eat spicy food");
        mh1.setRecoverDays(5);
        mh2.setRecoverDays(3);


        MedicalHistoryDirectory mhl1 = new MedicalHistoryDirectory(1,"Magic");
        mhl1.addHistory(mh2);
        mhl1.addHistory(mh1);
        mh1.setDoctor(doctor_Jim);
        mh2.setDoctor(doctor_Alex);
        
        MedicalHistory mh3 = new MedicalHistory("Magic‘s Medical History", "Asthma", "Use inhaler, avoid triggers");
        mh3.setRecoverDays(10);
        mh3.setFeedbackRate(8);
        mh3.setDoctor(doctor_Jim);
        mhl1.addHistory(mh3);

        MedicalHistory mh4 = new MedicalHistory("Magic‘s Medical History", "Sprained ankle", "Rest, ice, compression, elevation");
        mh4.setRecoverDays(14);
        mh4.setFeedbackRate(7);
        mh4.setDoctor(doctor_Alex);
        mhl1.addHistory(mh4);

        MedicalHistory mh5 = new MedicalHistory("Magic‘s Medical History", "Chickenpox", "Stay at home, oatmeal baths, antihistamines");
        mh5.setRecoverDays(21);
        mh5.setFeedbackRate(7);
        mh5.setDoctor(doctor_Frank);
        mhl1.addHistory(mh5);

        // 为Johnson增加三条病历
        MedicalHistory mh6 = new MedicalHistory("Johnson‘s Medical History", "Flu", "Rest, fluids, antiviral medication if early");
        mh6.setRecoverDays(7);
        mh6.setFeedbackRate(7);
        mh6.setDoctor(doctor_Jim);
        MedicalHistoryDirectory mhl2 = new MedicalHistoryDirectory(2, "Johnson");
        mhl2.addHistory(mh6);

        MedicalHistory mh7 = new MedicalHistory("Johnson‘s Medical History", "Migraine", "Pain relief medication, avoid triggers");
        mh7.setRecoverDays(3);
        mh7.setFeedbackRate(8);
        mh7.setDoctor(doctor_Alex);
        mhl2.addHistory(mh7);

        MedicalHistory mh8 = new MedicalHistory("Johnson‘s Medical History", "Dehydration", "Increase fluid intake, oral rehydration solutions");
        mh8.setRecoverDays(2);
        mh8.setFeedbackRate(7);
        mh8.setDoctor(doctor_Frank);
        mhl2.addHistory(mh8);


        // 为JP增加三条病历
        MedicalHistory mh9 = new MedicalHistory("JP‘s Medical History", "Back pain", "Pain medication, physical therapy");
        mh9.setRecoverDays(30);
        mh9.setFeedbackRate(7);
        mh9.setDoctor(doctor_Jim);
        MedicalHistoryDirectory mhl3 = new MedicalHistoryDirectory(3, "JP");
        mhl3.addHistory(mh9);

        MedicalHistory mh10 = new MedicalHistory("JP‘s Medical History", "Eczema", "Moisturizers, corticosteroid creams");
        mh10.setRecoverDays(14);
        mh10.setFeedbackRate(7);
        mh10.setDoctor(doctor_Alex);
        mhl3.addHistory(mh10);

        MedicalHistory mh11 = new MedicalHistory("JP‘s Medical History", "Sinusitis", "Steam inhalation, nasal sprays, antibiotics if bacterial");
        mh11.setRecoverDays(14);
        mh11.setFeedbackRate(8);
        mh11.setDoctor(doctor_Frank);
        mhl3.addHistory(mh11);

        
        Patient patient1 = new Patient(10, "Magic", "Aa12345678");
        patient1.setMedicalHistoryDirectory(mhl1);
        patient1.setEnabled(1);
        patient1.setAge(12);
        patient1.setAllergy("No");
        patient1.setInsurance("Blue Cross");

        Patient patient2 = new Patient(11, "Johnson", "Aa12345678");
        patient2.setEnabled(1);
        patient2.setAge(22);
        patient2.setMedicalHistoryDirectory(mhl2);
        
        Patient patient3 = new Patient(12, "JP", "Aa12345678");
        patient3.setEnabled(1);
        patient3.setAge(42);
        patient3.setMedicalHistoryDirectory(mhl3);
        
        Appointment a = new Appointment(patient1,doctor_Jim);
        Appointment a1 = new Appointment(patient2,doctor_Alex);
        Appointment a2 = new Appointment(patient3,doctor_Frank);
        ArrayList<Appointment> APPO = new ArrayList<>();
        APPO.add(a);
        APPO.add(a1);
        APPO.add(a2);

        Medicine medicine = new Medicine("M-A1", "For Child", "Pediatrics");
        medicine.setQuantity(10);
        medicine.setInstruction("Take 2 pills per day");
        Medicine medicine1 = new Medicine("M-B1",  "For Internal", "Internal Medicine");
        medicine1.setQuantity(10);
        medicine1.setInstruction("Take 3 pills per day");
        Medicine medicine2 = new Medicine("M-C1",  "Surgery", "Surgery");
        medicine2.setQuantity(10);
        medicine2.setInstruction("Take 1 pill per day");
        ArrayList<Medicine> medicineDirectory = new ArrayList<>();

        medicineDirectory.add(medicine);
        medicineDirectory.add(medicine1);
        medicineDirectory.add(medicine2);
        
        Vaccine vaccine = new Vaccine("V-A1",  "For Child", "Pediatrics");
        vaccine.setQuantity(10);
        vaccine.setInstruction("only for child");
        Vaccine vaccine1 = new Vaccine("V-B1",  "For Internal", "Internal Medicine");
        vaccine1.setQuantity(10);
        vaccine1.setInstruction("For Internal");
        Vaccine vaccine2 = new Vaccine("V-C1", "Surgery", "Surgery");
        vaccine2.setQuantity(10);
        vaccine2.setInstruction("For Surgery");
        ArrayList<Vaccine> vaccineDirectory = new ArrayList<>();

        vaccineDirectory.add(vaccine);
        vaccineDirectory.add(vaccine1);
        vaccineDirectory.add(vaccine2);
        
        Equipment equipment = new Equipment("E-A1",  "Pediatrics", "For Child");
        equipment.setQuantity(10);
        Equipment equipment1 = new Equipment("E-B1",  "Internal Medicine","For Internal" );
        equipment1.setQuantity(10);
        Equipment equipment2 = new Equipment("E-C1", "Surgery", "Surgery");
        equipment2.setQuantity(10);
        ArrayList<Equipment> equipmentDirectory = new ArrayList<>();

        equipmentDirectory.add(equipment);
        equipmentDirectory.add(equipment1);
        equipmentDirectory.add(equipment2);

        Prescription prescription = new Prescription("prescription for server fever",Arrays.asList(medicine, vaccine, equipment));
        mh1.setPrescription(prescription);

        Prescription prescription1 = new Prescription("prescription for server headache",Arrays.asList(medicine1, vaccine1, equipment1));
        mh2.setPrescription(prescription1);

        h3.addRearService(rs);
        
        h3.addDoctor(doctor_Jim);
        h3.addDoctor(doctor_Alex);
        h3.addDoctor(doctor_Frank);

        h3.addPatient(patient1);
        h3.addPatient(patient2);
        h3.addPatient(patient3);
        
        h3.getHa().setAppointments(APPO);
        h3.getHospitalInventory().setMedicineDirectory(medicineDirectory);
        h3.getHospitalInventory().setVaccineDirectory(vaccineDirectory);
        h3.getHospitalInventory().setEd(equipmentDirectory);
        
        patients.add(patient1);
        patients.add(patient2);
        patients.add(patient3);
        hospitals.add(h3);
    }
}
