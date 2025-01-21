/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment0603;
import java.util.Stack;

public class StackSearch {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        int target = 30;
        int position = searchElement(stack, target);
        
        if (position != -1) {
            System.out.println("Element " + target + " found at position: " + position);
        } else {
            System.out.println("Element " + target + " not found in the stack.");
        }
    }

    public static int searchElement(Stack<Integer> stack, int target) {
        Stack<Integer> tempStack = new Stack<>();
        int position = 0;

      
        while (!stack.isEmpty()) {
            int current = stack.pop();
            tempStack.push(current); 
            position++;

            if (current == target) {
               
                restoreStack(stack, tempStack);
                return position - 1; 
            }
        }

        restoreStack(stack, tempStack);
        return -1; 
    }

    private static void restoreStack(Stack<Integer> original, Stack<Integer> temp) {
        while (!temp.isEmpty()) {
            original.push(temp.pop());
        }
    }
}