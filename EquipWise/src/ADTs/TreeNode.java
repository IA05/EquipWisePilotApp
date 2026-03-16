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
public class TreeNode {
    
    //
    private Item data;
    private TreeNode left;
    private TreeNode right;
    
    
    //CONSTRUCTORS
    public TreeNode(Item data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    
    
    //SETTER & GETTERS
    public Item getData() {     //Getter for data
        return data;
    }
    public void setData(Item data) {    //Setter for data
        this.data = data;
    }

    public TreeNode getLeft() {     //Getter for left
        return left;
    }
    public void setLeft(TreeNode left) {    //Setter for left
        this.left = left;
    }

    public TreeNode getRight() {    //Getter for right
        return right;
    }
    public void setRight(TreeNode right) {      //Setter for right
        this.right = right;
    }
    
} //end class
