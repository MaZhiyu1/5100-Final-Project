/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class.Hospital.Medical;

/**
 *
 * @author 15469
 */
public class MedicalHistory {
    String description;
    String instruction;
    String status;

    public MedicalHistory(String description, String instruction) {
        this.description = description;
        this.instruction = instruction;
        status="processing";
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = "completed";
    }

    
    

}
