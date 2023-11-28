/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class;

import Business.Class.Hospital.RearServices.RearServices;

/**
 *
 * @author 15469
 */
public class Vaccine extends Drug{

    public Vaccine(String name, int quantity) {
        super(name, quantity);
        setType("Vaccine");
    }

    public Vaccine(String name, String id, String description, String category) {
        super(id, name, description, category);
    }
}
