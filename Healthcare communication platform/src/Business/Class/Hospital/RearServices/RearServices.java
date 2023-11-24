/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.RearServices;

/**
 *
 * @author 15469
 */
public class RearServices {
    String name;
    String id;
    String pwd;
    String hospital;
    
    int enabled;

    public RearServices(String name, String id, String pwd, String hospital) {
        this.name = name;
        this.id = id;
        this.pwd = pwd;
        this.hospital = hospital;
        this.enabled = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }
    
    
    
    
    
}
