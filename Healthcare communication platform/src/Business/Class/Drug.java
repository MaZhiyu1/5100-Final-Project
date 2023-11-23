/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class;

/**
 *
 * @author 15469
 */
public class Drug {
    String name;
    String id;
    String description;
    String type;
    String status;
    int process;
    public Drug(String name, String id, String description, String type) {
        this.name = name;
        this.id = id;
        this.description = description;
        this.type = type;
        status = "Processing";
        process=0;
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
    
    
}
