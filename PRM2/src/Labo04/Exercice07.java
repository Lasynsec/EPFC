/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo04;

import java.util.Scanner;

/**
 *
 * @author herve
 */
public class Exercice07 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please type a number : ");
        int userInput = scan.nextInt();
        
        while(userInput < 0 || userInput >= 13){
            
            if(userInput >= 13){
                System.out.print("Please type a number lower than 170 : ");
                userInput = scan.nextInt();
            } else {
                System.out.print("Please type a number greater than 0 : ");
                userInput = scan.nextInt();
            }
            
        }
        
        //System.out.println("Max value of Int is : " + Integer.MAX_VALUE);
        
        int factorial = 1;
        for(int i = 1; i <= userInput; ++i){
            factorial *= i;
        }
        System.out.println("The factorial of " + userInput + " is " + factorial);
    }
}
