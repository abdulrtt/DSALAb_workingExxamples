package dsa1;

/**
 * @author HP
 */

class Node {
    int data;
    Node address;

    public Node(int data) {
        this.data = data;
        this.address = null;
    }
}

public class LinkedList {
    Node head, tail;
    int size;

    public LinkedList() {
        head = tail = null;
        size = 0;
    }

    public void add(int d) {
        Node n = new Node(d);
        if (head == null) {
            head = tail = n;
        } else {
            tail.address = n;
            tail = n;
        }
        size++;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.address;
        }
        System.out.println(); 
    }

  
    public void printSize() {
        System.out.println("Size of the linked list: " + size);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

       
        list.printList();
        
       
        list.printSize();
    }
}
