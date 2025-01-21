/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment0703;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueueReversal {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

     
        for (int i = 1; i <= 5; i++) {
            queue.add(i);
        }

        System.out.println("Original Queue: " + queue);

        int k = 3;
        reverseFirstKElements(queue, k);

        System.out.println("Queue after reversing the first " + k + " elements: " + queue);
    }

    public static void reverseFirstKElements(Queue<Integer> queue, int k) {
        if (k <= 0 || queue.isEmpty()) {
            return;
        }

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < k && !queue.isEmpty(); i++) {
            stack.push(queue.poll());
        }
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
        int size = queue.size();
        for (int i = 0; i < size - k; i++) {
            queue.add(queue.poll());
        }
    }
}
