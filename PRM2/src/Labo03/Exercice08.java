/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo03;

import java.util.Scanner;
/**
 *
 * @author 2207hembilo
 */
public class Exercice08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please type a number :");
        int userInput = scan.nextInt();
        
        int firstNumber = 0;
        int lastNumber = 0;
        
        while(userInput != -1){
           System.out.println("Please type a number :");
           userInput = scan.nextInt();
           
           if(userInput != -1){
               System.out.println("Test");
           }
        }
    }
}
