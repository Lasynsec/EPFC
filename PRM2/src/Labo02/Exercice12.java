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
public class Exercice12 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type your first number : ");
        int firstNumber = scan.nextInt();
        
        System.out.print("Type your second number : ");
        int secondNumber = scan.nextInt();
        
        System.out.print("Type your third number : ");
        int thirdNumber = scan.nextInt();
        
        if(firstNumber == secondNumber){
            System.out.println(firstNumber);
        } else if(secondNumber == thirdNumber) {
            System.out.println(secondNumber);
        }else if(firstNumber == thirdNumber) {
            System.out.println(thirdNumber);
        }
    }
}
