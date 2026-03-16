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

    //CONSTRUCTOR
    public ItemBST() {
        root = null;
    }
    
    
    //APPLYING INSERT METHOD
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
    
    
    //APPLYING DELETE METHOD
    @Override
    public void delete(int id) {
        root = deleteRec(root, id);
    }
    
    
    //METHOD TO DELETE (by ID)
    private TreeNode deleteRec(TreeNode current, int id) {
        
        if(current == null) return null;    //
        //
        if(id < current.getData().getId()) {
            current.setLeft(deleteRec(current.getLeft(), id));
        } else if(id > current.getData().getId()) {
            current.setRight(deleteRec(current.getRight(), id));
        } else {    //when node not found
            
            //Case 1: No child
            if(current.getLeft() == null && current.getRight() == null) {
                return null;
            }
            
            //Case 2: One child only
            if(current.getLeft() == null) {
                return current.getRight();
            } else if(current.getRight() == null) {
                return current.getLeft();
            }
            
            //Case 3: Two child nodes
            Item smallest = findMin(current.getRight());    //
            current.setData(smallest);      //
            current.setRight(deleteRec(current.getRight(), smallest.getId()));  //
            
        }
        
        return current;
    }
    
    //
    private Item findMin(TreeNode node) {
        
        //
        while(node.getLeft() != null) {
            node = node.getLeft();
        } //end while loop
        
        return node.getData();
                
    } //end findMin()
    
    
    //RETURNING METHOD TO DISPLAY IN-ORDER
    @Override
    public void display() {
        inorder(root);
    }
    
    //DISPLAY METHOD (in-order traversal)
    private void inorder(TreeNode node) {
        //
        if(node != null) {
            inorder(node.getLeft());
            System.out.println(node.getData().displayInfo());
            inorder(node.getRight());
        } //end if statement
        
    } //end inorder()
    
    
} //end class
