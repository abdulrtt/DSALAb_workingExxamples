/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment0703;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class MinQueue {
    private Queue<Integer> queue;
    private Stack<Integer> minStack;

    public MinQueue() {
        queue = new LinkedList<>();
        minStack = new Stack<>();
    }

    public void enqueue(int value) {
        queue.add(value);

      
        if (minStack.isEmpty() || value <= minStack.peek()) {
            minStack.push(value);
        }
    }

    public int dequeue() {
        if (queue.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int value = queue.poll();

        // Update the minimum stack if the dequeued value is the minimum
        if (value == minStack.peek()) {
            minStack.pop();
        }

        return value;
    }

    public int getMinimum() {
        if (minStack.isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return minStack.peek();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public int size() {
        return queue.size();
    }

    public void printQueue() {
        System.out.println(queue);
    }

    public static void main(String[] args) {
        MinQueue minQueue = new MinQueue();
        
        minQueue.enqueue(5);
        minQueue.enqueue(3);
        minQueue.enqueue(7);
        minQueue.enqueue(2);
        minQueue.enqueue(4);

        System.out.println("Queue: ");
        minQueue.printQueue();
        
        System.out.println("Minimum: " + minQueue.getMinimum());

        minQueue.dequeue();
        System.out.println("After dequeuing an element:");
        minQueue.printQueue();
        
        System.out.println("Minimum: " + minQueue.getMinimum());
        
        minQueue.dequeue();
        System.out.println("After dequeuing another element:");
        minQueue.printQueue();
        
        System.out.println("Minimum: " + minQueue.getMinimum());
    }
}