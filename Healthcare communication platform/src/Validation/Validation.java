/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import Business.Business;
import Business.Class.BioTech.BioResearcher;
import Business.Class.BioTech.BioSupplier;
import Business.Class.BioTech.BioTechCom;
import Business.Class.BioTech.Lab;
import Business.Class.Delivery.Delivery;
import Business.Class.Hospital.Hospital;
import Business.Class.Hospital.Medical.Doctor;
import Business.Class.Hospital.Medical.Patient;
import Business.Class.Hospital.RearServices.RearServices;
import Business.Class.MedicalSupplier.MedicalSupplier;

/**
 *
 * @author 15469
 */
public class Validation {
    Business bz;

    public Validation(Business bz) {
        this.bz = bz;
    }

    
    public Object IsValidationMedicalSupplier(String Company,String username,String pwd){
        for(MedicalSupplier ms : bz.getMedicalSupplier()){
            if(ms.getName().equals(Company)){
                for(BioSupplier bs : ms.getBs()){
                    if(bs.getName().equals(username)){
                        if(bs.getPwd().equals(pwd)){
                            return bs;
                        }
                    }
                }
            }
        }
        return null;
    }
    
    
    
    public Object IsValidationMedicalAnalysis(String Company,String username,String pwd,String type){
        
        return null;
    }
    
    public Object IsValidationDelievery(String Company,String username,String pwd){
        for(Delivery d : bz.getDeliveries()){
            if(d.getCompany().equals(Company)){
                if(d.getUsername().equals(username)){
                    if(d.getPwd().equals(pwd)){
                        return d;
                    }
                }
            }
        }
        return null;
    }
    
    
    public Object IsValidationBioTech(String BioTechName,String username,String pwd,String type){
        for(BioTechCom bt : bz.getBioTech()){
            //遍历比对公司的名字
            if(bt.getName().equals(BioTechName)){
                if(type.equals("Research")){
                    for(BioResearcher br :  bt.getBr()){
                        if(br.getMaster().getName().equals(username)){
                            if(br.getPwd().equals(pwd)){
                                if(br.getEnable()==0) return null;
                                return br;
                            }
                        }
                    }

//                    for(Lab lab1 : bt.getLabs()){
//                        if(lab1.getMaster().getName().equals(username)){
//                            return lab1;
////                            if(lab1.getPwd().equals(pwd)){
////                                return lab1;
////                            }
//                        }
//                    }
                
                }  //Supplier
                else if(type.equals("Supplier")){
                    for(BioSupplier bs : bt.getBioSupplier()){
                        if(bs.getName().equals(username)){
                            if(bs.getPwd().equals(pwd)){
                                if(bs.getEnable()==0) return null;
                                return bs;
                            }
                        }
                    }
                }
            }
        }
        System.out.print("It is null!");
        return null;
    }

    public Object IsValidationHospital(String hospitalName,String username,String pwd,String type){
        if(type.equals("Patient")){
            for(Patient p : bz.getPatients()){
                if(p.getName().equals(username) && p.getPwd().equals(pwd)){
                    return p;
                }
            }
        }
        for(Hospital hospital : bz.getHospitals()){
            System.out.println(hospital.getName());
            if(hospital.getName().equals(hospitalName)){

                if(type.equals("Doctor")){
                    for(Doctor p : hospital.getDoctorList()){
                        System.out.println(p.getName());
                        if(p.getName().equals(username)  && p.getPwd().equals(pwd)){
                            if(p.getEnabled()==0) return null;
                            return p;
                        }
                    }
                }
                else if(type.equals("Supplier")){
                    for(RearServices rs : hospital.getRearServices()){
                        if(rs.getName().equals(username) && rs.getPwd().equals(pwd)){
                            return rs;
                        }
                    }

                }
                else if(type.equals("Analysis")){
                        if(hospital.getHr().getName().equals(username) && hospital.getHr().getPwd().equals(pwd)){

                            return hospital.getHr();
                        }
                    }
                }            
            }
        
        System.out.print("It is null!");
        return null;
    }

}
