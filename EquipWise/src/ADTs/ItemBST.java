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
public class ItemBST implements ItemOperations{
    
    private TreeNode root;    //

    //COMSTRUCTOR
    public ItemBST() {
        root = null;
    }
    
    
    //RETURNING INSERT METHOD
    @Override
    public void insert(Item item) {
        root = insertRec(root, item);
    }
    
    
    //METHOD TO INSERT
    private TreeNode insertRec(TreeNode current, Item item) {
        //
        if(current == null) {
            return new TreeNode(item);
        }
        
        //Comparing by ID
        if(item.getId() < current.getData().getId()) {
            current.setLeft(insertRec(current.getLeft(), item));
        } else {
            current.setRight(insertRec(current.getRight(), item));
        } //end if/else statement
        
        return current;     //
    } //end insertRec
    
    
    //RETURNING SEARCH METHOD
    @Override
    public Item search(String name) {
        return searchRec(root, name);
    } //end search()
    
    
    //METHOD TO SEARCH (by name)
    private Item searchRec(TreeNode current, String name) {
        
        if(current == null) return null;    //
        //
        if(current.getData().getName().equalsIgnoreCase(name)) {
            return current.getData();
        }
        //Sesarching on both sides since BST is ordered by ID, not name
        Item found = searchRec(current.getLeft(), name);
        if(found != null) return found;
        
        return searchRec(current.getRight(), name);
        
    } //end searchRec
    
    
} //end class
