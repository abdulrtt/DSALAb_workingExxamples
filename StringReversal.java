/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment0603;

import java.util.Stack;

public class StringReversal {
    public static void main(String[] args) {
        String original = "Hello, World!";
        String reversed = reverseString(original);
        
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);
    }

    public static String reverseString(String str) {
        Stack<Character> stack = new Stack<>();
        for (char c : str.toCharArray()) {
            stack.push(c);
        }

        StringBuilder reversed = new StringBuilder();

        while (!stack.isEmpty()) {
            reversed.append(stack.pop());
        }

        return reversed.toString();
    }
}