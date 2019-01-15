/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarypractice;

import java.util.Scanner;

/**
 *
 * @author cheap
 */
public class BinaryPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in); 
        int n = scanner.nextInt();
        String decimalToBinary = Integer.toBinaryString(n);
        System.out.println(decimalToBinary);
        char[] arr = decimalToBinary.toCharArray();
        
        //https://github.com/LadySith/30DaysOfCode-Javascript/blob/master/Day%2010:%20Binary%20Numbers
        //https://www.geeksforgeeks.org/find-the-first-repeated-character-in-a-string/
//         while (n > 0){
//             int remainder = n%2;
//             n = n/2;
//             
         }
        
    }
    
}
