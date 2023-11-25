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
public class BioTechCom {
    private ArrayList<Lab>labs;
    private String name;
    ArrayList<Request> request;
    ArrayList<Order> orders;
    public BioTechCom(String name) {
        this.name = name;
        labs = new ArrayList<>();
        request = new ArrayList<>();
        orders= new ArrayList<>();
    }

    public ArrayList<Lab> getLabs() {
        return labs;
    }

    public void setLabs(ArrayList<Lab> labs) {
        this.labs = labs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
