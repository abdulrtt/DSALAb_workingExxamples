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
public class MatrixSUM {
     public static void main(String[] args) {
        
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        
        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };
        
        
        int[][] sumMatrix = new int[3][3];

        // Compute sum of the two matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

      
        System.out.println("Sum of the two matrices is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
            System.out.println();  
        }
    }
    
}
