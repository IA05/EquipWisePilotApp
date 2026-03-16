/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipwise;

/**
 *
 * @author ImaanAhmed
 */
public class Bow extends Item {
    
    //ATTRIBUTES
    int poundage;   //Decalering Variables for Bow poundage
    String material;    //Decalering Variables for Bow material

    public Bow() {}     //Empty cinstrctor for default values

    //Constructor to initialize Bow object (using Item superclass)
    public Bow(int poundage, String material, int id, String name, double price, String condition, String seller) {
        super(id, name, price, condition, seller);
        this.poundage = poundage;
        this.material = material;
    }        

    
    //SETTERS & GETTERS
    public int getPoundage() {      //Getter for poundage
        return poundage;
    }
    public void setPoundage(int poundage) {     //Setter for poundage
        this.poundage = poundage;
    }

    public String getMaterial() {   //Getter for material
        return material;
    }
    public void setMaterial(String material) {      //Setter for material
        this.material = material;
    }
    
    
    //DISPLAY METHOD
    public String displayInfo() {   //Default display method for Item sub-classes
        //
        return null;
        //
    }
    
    
}   //End class
