/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADTs;

//IMPORTS
import equipwise.Item;

/**
 *
 * @author ImaanAhmed
 */
public class ItemNode {
    
    //
    private Item data;
    private ItemNode next;

    
    //CONSTRCTOR
    public ItemNode(Item data) {
        this.data = data;
        this.next = null;
    }
    
    
    //SETTER & GETTERS
    public Item getData() {     //Getter for data
        return data;
    }
    public void setData(Item data) {    //Setter for data
        this.data = data;
    }

    public ItemNode getNext() {     //Getter for next
        return next;
    }
    public void setNext(ItemNode next) {    //Setter for next
        this.next = next;
    }
    
    
}
