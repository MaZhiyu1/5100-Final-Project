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
public class Medicine extends Drug{


    public Medicine(String name, int quantity) {
        super(name, quantity);
        setType("Medicine");
    }

    public Medicine(String name, String id, String description, String category) {
        super(id, name, description, category);
    }
}
