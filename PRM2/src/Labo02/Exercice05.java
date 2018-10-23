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
public class Exercice05 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the firs number : ");
        int firstNumber = scan.nextInt();
        System.out.print("Type the first number : ");
        int secondNumber = scan.nextInt();
        
        if(firstNumber > secondNumber){
            System.out.println("The first number is the greatest");
        } else if(firstNumber == secondNumber){
            System.out.println("The two numbers are equal");
        } else {
            System.out.println("The second number is the greatest");
        }
    }
}
