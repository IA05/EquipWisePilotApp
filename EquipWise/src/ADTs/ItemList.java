/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ADTs;

//IMPORTS
import equipwise.Item;
import equipwise.ItemOperations;

/**
 *
 * @author ImaanAhmed
 */
public class ItemList implements ItemOperations {
    
    //
    private ItemNode head;
    private int size;
    
    //
    public ItemList() {
        head = null;
        size = 0;
    }
    
    //METHOD TO INSERT (at end)
    @Override
    public void insert(Item item) {
        
        ItemNode newNode = new ItemNode(item);  //
        //
        if(head == null) {
            head = newNode;
        } else {
            ItemNode current = head;
            //
            while(current.getNext() != null) {
                current = current.getNext();
            } //end while loop
            current.setNext(newNode);
        } //end if/else statement
        
        size++;
        
    } //end insert()
    
    
    //METHOD TO DELETE (by ID instead of index... simplifying user interaction with GUI)
    @Override
    public void delete(int id) {
        
        if(head == null) return;    //
        //
        if(head.getData().getId() == id) {
            head = head.getNext();
            size--;
            return;
        } //end if statement
        
        //
        ItemNode current = head;    //
        ItemNode prev = null;   //
        
        //
        while(current != null && current.getData().getId() != id) {
            prev = current;
            current = current.getNext();
        } //end while loop
        
        //
        if(current != null) {
            prev.setNext(current.getNext());
            size--;
        } //end if statement
        
    } //end delete()
    
    
    //MEHTOD TO SEARCH (by name)
    @Override
    public Item search(String name) {
        
        ItemNode current = head;    //
        
        //
        while(current != null) {
            if(current.getData().getName().equalsIgnoreCase(name)) {
                return current.getData();   //
            } //end if statement
        } //end while loop
        
        return null;
        
    } //end search()
    
    
    //DISPLAY METHOD
    @Override
    public void display() {
        
        ItemNode current = head;    //
        
        //Looping through...
        while(current != null) {
            System.out.println(current.getData().displayInfo());
        } //end while loop
        
    } //end display()
    
    
    //METHOD TO CHECK LIST SIZE
    public int getSize() {
        return size;
    } //end getSize()
    
    
} //end class
