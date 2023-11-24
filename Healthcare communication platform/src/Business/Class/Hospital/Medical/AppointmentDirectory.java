/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Medical;

import java.util.ArrayList;

/**
 *
 * @author dell
 */
public class AppointmentDirectory {
    ArrayList<Appointment> appointments;

    public AppointmentDirectory() {
        appointments = new ArrayList<>();
    }

    public void add(Appointment a){
        appointments.add(a);
    }
    
    
    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(ArrayList<Appointment> appointments) {
        this.appointments = appointments;
    }
    
    
    

}
