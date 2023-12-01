/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.RearServices;

import Business.Class.Delivery.Order;
import Business.Class.Hospital.Hospital;
import Business.Class.Hospital.Request;

import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class RearServices {
    String name;
    String id;
    String pwd;
    Hospital hospital;
    ArrayList<Request> request;
    ArrayList<Order> orders;
    int enabled;

    public RearServices(String name, String id, String pwd, Hospital hospital) {
        this.name = name;
        this.id = id;
        this.pwd = pwd;
        this.hospital = hospital;
        this.enabled = 0;
        request = new ArrayList<>();
        orders = new ArrayList<>();
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

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }

    public int getEnabled() {
        return enabled;
    }

    public void setEnabled(int enabled) {
        this.enabled = enabled;
    }

    public ArrayList<Request> getRequest() {
        return request;
    }

    public void setRequest(ArrayList<Request> request) {
        this.request = request;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
}
