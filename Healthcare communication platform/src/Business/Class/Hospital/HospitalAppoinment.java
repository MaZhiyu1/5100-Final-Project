/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital;

import Business.Class.Hospital.Medical.AppointmentDirectory;

/**
 *
 * @author 15469
 */
public class HospitalAppoinment {
    AppointmentDirectory ad;

    public HospitalAppoinment() {
        ad = new AppointmentDirectory();
    }

    public AppointmentDirectory getAd() {
        return ad;
    }

    public void setAd(AppointmentDirectory ad) {
        this.ad = ad;
    }

}
