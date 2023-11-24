/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital;

import Business.Class.Medicine;
import Business.Class.MedicineDirectory;
import Business.Class.Hospital.Medical.Doctor;
import java.util.List;

/**
 *
 * @author 15469
 */
public class Lab {
    private String id;
    private String name;
    private String address;
    private String type;
    private Doctor master;//主任
    private List<Doctor> member;
    private String project;
    private String status;
    private String group;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    
}
