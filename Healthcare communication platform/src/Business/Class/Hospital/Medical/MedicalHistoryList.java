/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Medical;

import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class MedicalHistoryList {
    ArrayList<MedicalHistory> mh;
    int id;
    String username;

    public MedicalHistoryList(int id, String username) {
        this.id = id;
        this.username = username;
        mh = new ArrayList<>();
    }
    
    public void addHistory(MedicalHistory m){
        mh.add(m);
    }

    public ArrayList<MedicalHistory> getMh() {
        return mh;
    }

    public void setMh(ArrayList<MedicalHistory> mh) {
        this.mh = mh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    
    
    
    
    
}
