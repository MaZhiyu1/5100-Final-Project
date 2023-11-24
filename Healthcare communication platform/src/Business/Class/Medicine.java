/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class;

import java.util.Date;

/**
 *
 * @author 15469
 */
public class Medicine {
    String name;
    String id;
    String description;
    String type;
    String status;
    int process;
    int quantity;
    private Date productionDate;
    private Date expireDate;
    public Medicine(String name, String id, String description, String type) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.type = type;
        status = "Processing";
        process=0;
        quantity=0;
    }

    public int getQuality() {
        return quantity;
    }

    public void setQuality(int quantity) {
        this.quantity = quantity;
    }

    
    public int getProcess() {
        return process;
    }

    public void setProcess(int process) {
        this.process = process;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = "completed";
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(Date productionDate) {
        this.productionDate = productionDate;
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }
    
    
    
    
}
