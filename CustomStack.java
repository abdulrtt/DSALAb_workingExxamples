/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment0603;

import java.util.Stack;

class CustomStack {
    private Stack<Integer> stack;

    public CustomStack() {
        stack = new Stack<>();
    }

    
    public void push(int value) {
        stack.push(value);
    }

   
    public Integer pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null; 
    }

    public Integer peek() {
        if (!stack.isEmpty()) {
            return stack.peek(); 
        }
        return null; 
    }

  
    public boolean isEmpty() {
        return stack.isEmpty();
    }

 
    public int size() {
        return stack.size();
    }

    public static void main(String[] args) {
        CustomStack customStack = new CustomStack();
        customStack.push(10);
        customStack.push(20);
        customStack.push(30);

        System.out.println("Top element (peek): " + customStack.peek()); 
        System.out.println("Popped element: " + customStack.pop()); 
        System.out.println("Top element after pop (peek): " + customStack.peek());
    }
}