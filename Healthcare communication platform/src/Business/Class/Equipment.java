/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Class;

/**
 *
 * @author 15469
 */
public class Equipment  extends Drug{

    public Equipment(String name, int quantity) {
        super(name, quantity);
        setType("Equipment");
    }

    public Equipment(String name, String description, String category) {
        super(name, description, category);
        setType("Equipment");
    }

    @Override
    public String toString() {
        return getId();
    }

}
