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
public class OrderQueue {
    
    //DECLARING VARIABLES
    private Item[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;
    
    
    //CONSTRUCTOR
    public OrderQueue(Item[] queue, int front, int rear, int size, int capacity) {
        queue = new Item[capacity];
        front = 0;
        rear = -1;
        size = 0;
        this.capacity = capacity;
    }
    
    
    //ENQUEUE (add order)
    public void enQ(Item item) {
        //
        if(isFull()) {
            System.out.println("Queue is full. Cannot add another order :(");
            return;
        }
        
        rear = (rear +1) % capacity;    //circular queue
        queue[rear] = item;
        size++;
        
        System.out.println("Order added: " + item.getName());
        
    }
    
    
    //DEQUEUE (process order)
    public Item dequeue() {
        //
        if(isEmpty()) {
            System.out.println("Queue is empty. No orders processing...");
            return null;
        }
        
        Item item = queue[front];
        front = (front +1) % capacity;
        size--;
        
        return item;
        
    }
    
    //CHECKING IF FULL
    public boolean isFull() {
        return size == capacity;
    }
    
    
    //CHECKING IF EMPTY
    public boolean isEmpty() {
        return size == 0;
    }
    
    
    //PEEK METHOD (viewing next order)
    public Item peek() {
        if(isEmpty()) {
            return null;
        }
        
        return queue[front];
    } //end peek()
    
    
    //DISPLAY QUEUE METHOD
    public void displayQueue() {
        //
        if(isEmpty()) {
            System.out.println("Queue is empty. No Orders!");
            return;
        }
        
        int i = front;  //
        //
        for(int count = 0; count < size; count++) {
            System.out.println(queue[i].displayInfo());
            i = (i +1) % capacity;
        } //end for loop
        
    } //end displayQueue()
    
    
    //CHECKING THE Q SIZE
    public int getSize() {
        return size;
    }
    
    
} //end class
