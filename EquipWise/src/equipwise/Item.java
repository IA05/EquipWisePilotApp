/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipwise;

/**
 *
 * @author ImaanAhmed
 */
public class Item {
    
    //ATTRIBUTES
    int id;     //Decalering Variables for Item id
    String name;    //Decalering Variables for Item name
    double price;   //Decalering Variables for Item price
    String condition;   //Decalering Variables for Item condition
    String seller;      //Decalering Variables for Item seller
    
    
    //CONSTRUCTORS
    public Item() {}    //Empty cinstrctor for default values

    //Constructor to initialize Item object:
    public Item(int id, String name, double price, String condition, String seller) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.condition = condition;
        this.seller = seller;
    }

    
    //SETTERS & GETTERS
    public int getId() {    //Getter for id
        return id;
    }
    public void setId(int id) {     //Setter for id
        this.id = id;
    }

    public String getName() {   //Getter for name
        return name;
    }
    public void setName(String name) {      //Setter for name
        this.name = name;
    }

    public double getPrice() {  //Getter for price
        return price;
    }
    public void setPrice(double price) {    //Setter for price
        this.price = price;
    }

    public String getCondition() {  //Getter for condition
        return condition;
    }
    public void setCondition(String condition) {    //Setter for condition
        this.condition = condition;
    }

    public String getSeller() {     //Getter for seller
        return seller;
    }
    public void setSeller(String seller) {      //Setter for seller
        this.seller = seller;
    }
    
    
    //DISPLAY METHODS
    
    public String displayInfo() {   //Default display method for Item sub-classes
        //
        return null;
        //
    }
    
    //toString Method:
    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", name=" + name + ", price=" + price + ", condition=" + condition + ", seller=" + seller + '}';
    }

    
}   //End class
