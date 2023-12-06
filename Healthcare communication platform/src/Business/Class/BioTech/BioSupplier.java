/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.BioTech;

import Business.Class.Delivery.Order;
import Business.Class.Hospital.Request;
import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class BioSupplier {
    String name;
    String pwd;
    String id;
    ArrayList<Request> request;
    ArrayList<Order> orders;
    int enable=1;
    public BioSupplier(String name, String pwd, String id) {
        this.name = name;
        this.pwd = pwd;
        this.id = id;
        request = new ArrayList<>();
        orders= new ArrayList<>();
    }

    public int getEnable() {
        return enable;
    }

    public void setEnable(int enable) {
        this.enable = enable;
    }

    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void addRequest(Request e){
        request.add(e);
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
