/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Delivery;

import java.util.ArrayList;

/**
 *
 * @author 15469
 */
public class Delivery {
    String company;
    String username;
    String pwd;
    ArrayList<Order>orders;

    public Delivery(String company, String username, String pwd) {
        this.company = company;
        this.username = username;
        this.pwd = pwd;
        orders=new ArrayList<>();
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }
    
    
    
}
