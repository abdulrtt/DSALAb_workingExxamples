/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment0603;

import java.util.Stack;

public class ReverseNumberUsingStack {
    public static void main(String[] args) {
        int number = 12345; 
        int reversedNumber = reverseNumber(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }

    public static int reverseNumber(int number) {
        Stack<Character> stack = new Stack<>();

     
        String numStr = String.valueOf(number);

       
        for (char digit : numStr.toCharArray()) {
            stack.push(digit);
        }

       
        StringBuilder reversedStr = new StringBuilder();
        while (!stack.isEmpty()) {
            reversedStr.append(stack.pop());
        }

      
        return Integer.parseInt(reversedStr.toString());
    }
}