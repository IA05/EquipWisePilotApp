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
    private int id;     //Declaring Variables for Item id
    private String name;    //Declaring Variables for Item name
    private double price;   //Declaring Variables for Item price
    private String condition;   //Declaring Variables for Item condition
    private String seller;      //Declaring Variables for Item seller
    private String imageURL;    //Declaring variable for Items image
    
    //CONSTRUCTORS
    public Item() {}    //Empty constrctor for default values

    //Constructor to initialize Item object:
    public Item(int id, String name, double price, String condition, String seller, String imageURL) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.condition = condition;
        this.seller = seller;
        this.imageURL = imageURL;
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

    public String getImageURL() {
        return imageURL;
    }
    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }
    
    
    //DISPLAY METHODS
    public String displayInfo() {   //Default display method for Item sub-classes
        //
        return "\nID: " + id +
                "\nName: " + name +
                "\nPrice: " + price +
                "\nCondition: " + condition +
                "\nSeller: " + seller;
        //
    }
    
    //toString Method:
    @Override
    public String toString() {
        return "-----------------------------------------" +
                "               ITEMS" +
                "-----------------------------------------" +
                "\n ID:         " + "|  "+ id +
                "\n Name:       " + "|  "+ name +
                "\n Price:      " + "|  "+ price +
                "\n Condition:  " + "|  "+ condition +
                "\n Seller:     " + "|  "+ seller;
    }

    
}   //End class
