/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validation;

import Business.Business;
import Business.Class.Hospital.Hospital;
import Business.Class.Hospital.Medical.Doctor;
import Business.Class.Hospital.Medical.Patient;

/**
 *
 * @author 15469
 */
public class Validation {
    Business bz;

    public Validation(Business bz) {
        this.bz = bz;
    }

    public Object IsValidationHospital(String hospitalName,String username,String pwd,String type){

        if(type.equals("Patient")){
            for(Patient p : bz.getPatients()){
                if(p.getName().equals(username)){
                    if(p.getPwd().equals(pwd)){
                            return p;
                        }
                    }
                }
            }
        for(Hospital hospital : bz.getHospital()){
            System.out.println(hospital.getName());
            if(hospital.getName().equals(hospitalName)){

                if(type.equals("Doctor")){
                    for(Doctor p : hospital.getDoctorList()){
                        System.out.println(p.getName());
                        if(p.getName().equals(username)){
                            if(p.getPwd().equals(pwd)){
                                return p;
                            }
                        }
                    }
                }
            }
        }
        System.out.print("It is null!");
        return null;
    }
    
    
}
