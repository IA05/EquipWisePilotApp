/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipwise;

/**
 *
 * @author ImaanAhmed
 */
public class Arrow extends Item {
    
    //ATTRIBUTES
    int spine;   //Decalering Variables for Bow poundage
    String material;    //Decalering Variables for Bow material

    public Arrow() {}     //Empty cinstrctor for default values

    //Constructor to initialize Bow object (using Item superclass)
    public Arrow(int spine, String material, int id, String name, double price, String condition, String seller) {
        super(id, name, price, condition, seller);
        this.spine = spine;
        this.material = material;
    }        

    
    //SETTERS & GETTERS
    public int getSpine() {      //Getter for poundage
        return spine;
    }
    public void setSpine(int spine) {     //Setter for poundage
        this.spine = spine;
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
