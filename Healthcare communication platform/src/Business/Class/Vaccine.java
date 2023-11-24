/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class;

import Business.Class.Hospital.HSupplier.HSupplier;

/**
 *
 * @author 15469
 */
public class Vaccine {
    String name;
    String id;
    String description;
    String type;
    String status;
    int process;
    int quantity;
    private String factory;
    private HSupplier supplier;
    
    public Vaccine(String name, String id, String description, String type) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.type = type;
        status = "Processing";
        process=0;
        quantity=0;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = "completed";
    }

    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }
    
    
    
    
}
