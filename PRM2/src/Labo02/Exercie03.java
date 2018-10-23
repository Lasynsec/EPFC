/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo02;

import java.util.Scanner;
/**
 *
 * @author herve
 */
public class Exercie03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type a number : ");
        int userInput = scan.nextInt();
        
        
        if(userInput < 0){
            userInput += (-userInput * 2);
        }
        
        System.out.println("The absolute value is " + userInput);
    }
}
