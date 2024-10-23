/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsa1;

/**
 *
 * @author HP
 */
public class ReverseArray {
    public static void main(String[] args) {
        // Predefined array
        int[] array = {1, 2, 3, 4, 5};

        // Print the original array
        System.out.println("Original array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();  // New line

        // Reverse the array using swapping
        int n = array.length;
        for (int i = 0; i < n / 2; i++) {
            // Swap elements at index i and (n-i-1)
            int temp = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = temp;
        }

        // Print the reversed array
        System.out.println("Reversed array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
