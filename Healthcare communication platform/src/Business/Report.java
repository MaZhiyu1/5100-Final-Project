/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Business.Class.BioTech.BioTechCom;
import Business.Class.BioTech.Lab;
import Business.Class.Delivery.Delivery;
import Business.Class.Delivery.Order;
import Business.Class.Hospital.Hospital;
import Business.Class.Hospital.Medical.Doctor;
import Business.Class.Hospital.Medical.MedicalHistory;
import Business.Class.Hospital.Medical.Patient;
import Business.Class.Hospital.Request;
import Business.Class.MedicalSupplier.MedicalSupplier;
import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class Report {
    
 private ArrayList<BioTechCom> bioTechList;
    private ArrayList<Hospital> hospitals;
    private ArrayList<Patient> patients;
    private ArrayList<MedicalSupplier> medicalSuppliers;
    Business bz;
    Hospital h1;
    Hospital h2;
    Hospital h3;
    Delivery d1;
    Delivery d2;
    private BioTechCom b1;
    private BioTechCom b2;
    
    String str1;
    String str2;
    String str3;
    String str4;
    String str5;
    String str6;
    
    String str7;
    String str8;
    String str9;
    String str10;
    String str11;
    String str12;
    
    String str13;
    String str14;
    
    
    public Report(Business bz) {
        hospitals = bz.getHospitals();
        patients = bz.getPatients();
        medicalSuppliers = bz.getMedicalSupplier();
        this.bz=bz;
        System.out.println("Hospital Summary");
        HospitalSummary();
        System.out.println();
        System.out.println("Bio-Tech Company Summary");
        BioTechSummary();
        System.out.println();
        System.out.println("Delivery Company Summary");
        DeliverySummary();
    }

    public String getStr13() {
        return str13;
    }

    public void setStr13(String str13) {
        this.str13 = str13;
    }

    public String getStr14() {
        return str14;
    }

    public void setStr14(String str14) {
        this.str14 = str14;
    }

    
    
    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    public String getStr2() {
        return str2;
    }

    public void setStr2(String str2) {
        this.str2 = str2;
    }

    public String getStr3() {
        return str3;
    }

    public void setStr3(String str3) {
        this.str3 = str3;
    }

    public String getStr4() {
        return str4;
    }

    public void setStr4(String str4) {
        this.str4 = str4;
    }

    public String getStr5() {
        return str5;
    }

    public void setStr5(String str5) {
        this.str5 = str5;
    }

    public String getStr6() {
        return str6;
    }

    public void setStr6(String str6) {
        this.str6 = str6;
    }

    public String getStr7() {
        return str7;
    }

    public void setStr7(String str7) {
        this.str7 = str7;
    }

    public String getStr8() {
        return str8;
    }

    public void setStr8(String str8) {
        this.str8 = str8;
    }

    public String getStr9() {
        return str9;
    }

    public void setStr9(String str9) {
        this.str9 = str9;
    }

    public String getStr10() {
        return str10;
    }

    public void setStr10(String str10) {
        this.str10 = str10;
    }

    public String getStr11() {
        return str11;
    }

    public void setStr11(String str11) {
        this.str11 = str11;
    }

    public String getStr12() {
        return str12;
    }

    public void setStr12(String str12) {
        this.str12 = str12;
    }
    
    
    
    
    private void HospitalSummary(){
        for(Hospital h : hospitals){
            if(h.getName().equals("Boston Rehabilitation Center")){
                h1=h;
            }
            if(h.getName().equals("Future Medical Institute")){
                h2=h;
            }
            if(h.getName().equals("Verdant Health Hospital")){
                h3=h;
            }
        }
        
        int recoverDay=0;
        int num=0;
        if(h1.getPatients()!=null){
        for(Patient p : h1.getPatients()){
            for(MedicalHistory mh : p.getMedicalHistoryDirectory().getMh()){
                if(mh.getDoctor().getHospital().getName().equals("Boston Rehabilitation Center")){
                    if(mh.getRecoverDays()!=0){
                        num++;
                        recoverDay+=mh.getRecoverDays();
                    }
                }
            }
        }
        }

        
        int labNum=0;
        int completed=0;
        for(Doctor d : h1.getDoctorList()){
            if(d.getLabs()!=null){
            labNum+=d.getLabs().size();
            for(Lab lab : d.getLabs()){
                if(lab.getStatus().equals("Completed")){
                    completed++;
                }
            }
            }

        }
        
        System.out.println("Boston Rehabilitation Center");
        System.out.println("The patient number of hospital: "+ num);
        System.out.println("The Average Recovery day of hospital: "+ recoverDay/num);
        System.out.println("The Lab Completion of hospital: "+ completed);
        System.out.println("The Lab number of hospital: "+ labNum);
        System.out.println("The Lab Completion of hospital: "+ completed);
        str1 = "The patient number of hospital:"+ num+"\n"+"The Average Recovery day of hospital: "+ recoverDay/num+"\n"
                + "The Lab Completion of hospital:"+ completed+"\n"+"The Lab number of hospital: "+ labNum+"\n"
                +"The Lab Completion of hospital: "+ completed;
        
        int recoverDay1=0;
        int num1=0;
        if(h2.getPatients()!=null){
        for(Patient p : h2.getPatients()){
            for(MedicalHistory mh : p.getMedicalHistoryDirectory().getMh()){
                if(mh.getDoctor().getHospital().getName().equals("Future Medical Institute")){
                    if(mh.getRecoverDays()!=0){
                        num1++;
                        recoverDay1+=mh.getRecoverDays();
                    }
                }
            }
        }
        }

        
        int labNum1=0;
        int completed1=0;
        for(Doctor d : h2.getDoctorList()){
            if(d.getLabs()!=null){
            labNum1+=d.getLabs().size();
            for(Lab lab : d.getLabs()){
                if(lab.getStatus().equals("Completed")){
                    completed1++;
                }
            }
            }

        }
        
        System.out.println("Future Medical Institute");
        System.out.println("The patient number of hospital: "+ num1);
        System.out.println("The Average Recovery day of hospital: "+ recoverDay1/num1);
        System.out.println("The Lab Completion of hospital: "+ completed1);
        System.out.println("The Lab number of hospital: "+ labNum1);
        System.out.println("The Lab Completion of hospital: "+ completed1);
        
        str2= "The patient number of hospital:"+ num1+"\n"+"The Average Recovery day of hospital: "+ recoverDay1/num1+"\n"
                + "The Lab Completion of hospital: "+ completed1+"\n"+"The Lab number of hospital: "+ labNum1+"\n"
                +"The Lab Completion of hospital: "+ completed1;
        
        
        int recoverDay2=0;
        int num2=0;
        if(h3.getPatients()!=null){
        for(Patient p : h3.getPatients()){
            for(MedicalHistory mh : p.getMedicalHistoryDirectory().getMh()){
                if(mh.getDoctor().getHospital().getName().equals("Verdant Health Hospital")){
                    if(mh.getRecoverDays()!=0){
                        num2++;
                        recoverDay2+=mh.getRecoverDays();
                    }
                }
            }
        }
        }

        
        int labNum2=0;
        int completed2=0;
        
        for(Doctor d : h3.getDoctorList()){
            labNum2+=d.getLabs().size();
            for(Lab lab : d.getLabs()){
                if(lab.getStatus().equals("Completed")){
                    completed2++;
                }
            }
        }
        
        System.out.println("Verdant Health Hospital");
        System.out.println("The patient number of hospital: "+ num2);
        System.out.println("The Average Recovery day of hospital: "+ recoverDay2/num2);
        System.out.println("The Lab Completion of hospital: "+ completed2);
        System.out.println("The Lab number of hospital: "+ labNum2);
        System.out.println("The Lab Completion of hospital: "+ completed2);
             
        str3= "The patient number of hospital:"+ num2+"\n"+"The Average Recovery day of hospital: "+ recoverDay2/num2+"\n"
                + "The Lab Completion of hospital:"+ completed2+"\n"+"The Lab number of hospital: "+ labNum2+"\n"
                +"The Lab Completion of hospital: "+ completed2;
        
        int maxValue = num;
        if (num1 > maxValue) {
            maxValue = num1;
        }
        if (num2 > maxValue) {
            maxValue = num2;
        }
        
        if(maxValue==num){
            System.out.println("The most welcome hospital for patient: "+h1.getName());
            str4 = "The most welcome hospital for patient: "+h1.getName();
        }else if(maxValue==num1){
            System.out.println("The most welcome hospital for patient: "+h2.getName());
            str4 = "The most welcome hospital for patient: "+h1.getName();
        }else{
            System.out.println("The most welcome hospital for patient: "+h3.getName());
            str4 = "The most welcome hospital for patient: "+h1.getName();
        }
        
        maxValue = recoverDay/num;
        if (recoverDay1/num1 > maxValue) {
            maxValue = recoverDay1/num1;
        }
        if (recoverDay2/num2 > maxValue) {
            maxValue = recoverDay2/num2;
        }
        
        if(maxValue==recoverDay/num){
            System.out.println("As a patient, you should choose hospital: "+h1.getName());
            str5 = "As a patient, you should choose hospital: "+h1.getName();
        }else if(maxValue==recoverDay1/num1){
            System.out.println("As a patient, you should choose hospital: "+h2.getName());
            str5 = "As a patient, you should choose hospital: "+h1.getName();
        }else{
            System.out.println("As a patient, you should choose hospital: "+h3.getName());
            str5 = "As a patient, you should choose hospital: "+h1.getName();
        }
        
        maxValue = labNum;
        if (labNum1 > maxValue) {
            maxValue = labNum1;
        }
        if (labNum2 > maxValue) {
            maxValue = labNum2;
        }
        
        if(maxValue==labNum){
            System.out.println("As a doctor, you have more chance working in lab in: "+h1.getName());
            str6 = "As a doctor, you have more chance working in lab in: "+h1.getName();
        }else if(maxValue==labNum1){
            System.out.println("As a doctor, you have more chance working in lab in: "+h2.getName());
            str6 = "As a doctor, you have more chance working in lab in: "+h1.getName();
        }else{
            System.out.println("As a doctor, you have more chance working in lab in: "+h3.getName());
            str6 = "As a doctor, you have more chance working in lab in: "+h1.getName();
        }
        
    }
    
    
    private void BioTechSummary(){
        for(BioTechCom b : bz.getBioTech()){
            if(b.getName().equals("BioGenesis Therapeutics")){
                b1=b;
            }
            if(b.getName().equals("VitalEdge Biomedicals")){
                b2=b;
            }
            
            
        }
        
        
        int orderNum=b1.getOrders().size();
        int orderCompleted=0;
        int requestNum=b1.getRequest().size();
        int requestCompleted=0;
        int labNum=b1.getLabs().size();
        int labCom=0;
        if(b1.getLabs()!=null){
        for(Lab l : b1.getLabs()){
            if(l.getStatus().equals("Completed")){
                labCom++;
            }
        }
        }
        if(b1.getOrders()!=null){
        for(Order o : b1.getOrders()){
            if(o.getStatus().equals("Completed")){
                orderCompleted++;
            }
        }
        }
        if(b1.getRequest()!=null){
        for(Request r : b1.getRequest()){
            if(r.getStatus().equals("Completed")){
                requestCompleted++;
            }
        }
        }

        System.out.println("BioGenesis Therapeutics");
        System.out.println("Total order: "+orderNum);
        System.out.println("Order Compeletion:  "+ orderCompleted);
        System.out.println("Total request: "+ requestNum);
        System.out.println("Request Compeletion: "+ requestCompleted);
        System.out.println("Lab Number: "+ labNum);
        System.out.println("Lab Completion: "+ labCom);
        
        str7="Total order"+orderNum+"\n"+
                "Order Compeletion  "+ orderCompleted+"\n"+
                "Total request: "+ requestNum+"\n"+
                "Request Compeletion: "+ requestCompleted+"\n"+
                "Lab Number: "+ labNum+"\n"+
                "Lab Completion: "+ labCom;
        
        
        
        int orderNum1=b2.getOrders().size();
        int orderCompleted1=0;
        int requestNum1=b2.getRequest().size();
        int requestCompleted1=0;
        int labNum1=b2.getLabs().size();
        int labCom1=0;
        if(b2.getLabs()!=null){
            for(Lab l : b2.getLabs()){
            if(l.getStatus().equals("Completed")){
                labCom1++;
            }
        }
        }
        if(b2.getOrders()!=null){
        for(Order o : b2.getOrders()){
            if(o.getStatus().equals("Completed")){
                orderCompleted1++;
            }
        }
        }
        if(b2.getRequest()!=null){
        for(Request r : b2.getRequest()){
            if(r.getStatus().equals("Completed")){
                requestCompleted1++;
            }
        }
        }

        System.out.println("VitalEdge Biomedicals");
        System.out.println("Total order: "+orderNum1);
        System.out.println("Order Compeletion:  "+ orderCompleted1);
        System.out.println("Total request: "+ requestNum1);
        System.out.println("Request Compeletion: "+ requestCompleted1);
        System.out.println("Lab Number: "+ labNum1);
        System.out.println("Lab Completion: "+ labCom1);
        
        str8="Total order"+orderNum1+"\n"+
                "Order Compeletion:  "+ orderCompleted1+"\n"+
                "Total request: "+ requestNum1+"\n"+
                "Request Compeletion: "+ requestCompleted1+"\n"+
                "Lab Number: "+ labNum1+"\n"+
                "Lab Completion: "+ labCom1;

        
        if (labNum1 > labNum) {
            System.out.println("The most populate because it has most labs: "+b2.getName());
            str9="The most populate because it has most labs: "+b2.getName();
        }else{
            System.out.println("The most populate because it has most labs: "+b1.getName());
            str9="The most populate because it has most labs: "+b2.getName();
        }
        
        if(orderNum1>orderNum){
            System.out.println("The Bio-Tech Company is more welcome to Bio-Tech Company because it has the most orders: "+b2.getName());
            str10="The Bio-Tech Company is more welcome to Bio-Tech Company because it has the most orders: "+b2.getName();
        }else{
            System.out.println("The most populate because it has most labs: "+b1.getName());
            str10="The Bio-Tech Company is more welcome to Bio-Tech Company because it has the most orders: "+b2.getName();
        }

    }
    
    
    
    private void DeliverySummary(){
        for(Delivery d : bz.getDeliveries()){
            if(d.getCompany().equals("UPS")){
                d1=d;
            }
            if(d.getCompany().equals("USPS")){
                d2=d;
            }
        }
            
            int orderNum = 0;
            if(d1.getOrders()!=null) orderNum = d1.getOrders().size();
            
            int orderCompleted = 0;
            int orderCancelled = 0;
            if(d1.getOrders()!=null){
            for(Order o : d1.getOrders()){
                if(o.getStatus().equals("Cancelled")){
                    orderCancelled++;
                }
                if(o.getStatus().equals("Completed")){
                    orderCompleted++;
                }
            }
            }

            System.out.println("UPS");
            System.out.println("Order number: "+orderNum);
            System.out.println("Order Completetion number: "+orderCompleted);
            System.out.println("Order Cancelled number: "+orderCancelled);
            
            str11="Order number: "+orderNum+"\n"+
                   "Order Completetion number: "+orderCompleted+"\n"+
                    "Order Cancelled number: "+orderCancelled;
            
            
            int orderNum1 = 0;
            if(d2.getOrders()!=null) orderNum1 = d2.getOrders().size();
            int orderCompleted1 = 0;
            int orderCancelled1 = 0;
            if(d2.getOrders()!=null){
            for(Order o : d2.getOrders()){
                if(o.getStatus().equals("Cancelled")){
                    orderCancelled1++;
                }
                if(o.getStatus().equals("Completed")){
                    orderCompleted1++;
                }
            }
            }

            System.out.println("USPS");
            System.out.println("Order number: "+orderNum1);
            System.out.println("Order Completetion number: "+orderCompleted1);
            System.out.println("Order Cancelled number: "+orderCancelled1);
            
            str12="Order number: "+orderNum1+"\n"+
                   "Order Completetion number: "+orderCompleted1+"\n"+
                    "Order Cancelled number: "+orderCancelled1;
            
        
        if(orderCancelled1<orderCancelled){
            System.out.println("The Company is bad because it has the most cancelled order: "+ d2.getCompany());
            str13="The Company is bad because it has the most cancelled order: "+ d2.getCompany();
        }else{
            System.out.println("The Company is bad because it has the most cancelled order: "+ d1.getCompany());
            str13="The Company is bad because it has the most cancelled order: "+ d2.getCompany();
        }
            
        if(orderNum1<orderNum){
            System.out.println("The Company is popular because it has the most order: "+d1.getCompany());
            str14="The Company is popular because it has the most order: "+d1.getCompany();
        }else{
            System.out.println("The Company is popular because it has the most order: "+d2.getCompany());
            str14="The Company is popular because it has the most order: "+d2.getCompany();

        }
        

        }
        
        
        
    }
    
    
