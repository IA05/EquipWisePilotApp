/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package equipwise;

//IMPORTS
import equipwise.Item;

/**
 *
 * @author ImaanAhmed
 */
public interface ItemOperations {
    
    public void insert();
    public void delete(int id);
    public Item search(String name);
    public void display();
    
}   //End class
