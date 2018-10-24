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
public class Exercice09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the firs number : ");
        int firstNumber = scan.nextInt();
        System.out.print("Type the second number : ");
        int secondNumber = scan.nextInt();
        System.out.print("Type the third number : ");
        int thirdNumber = scan.nextInt();
        int max = 0;
        if(firstNumber > secondNumber){
            if(firstNumber > thirdNumber){
                max = firstNumber;
            } else {
                max = thirdNumber;
            }
        }else {
            if(secondNumber > thirdNumber){
                max = secondNumber;
            }else {
                max = thirdNumber;
            }
        }
        System.out.println("The number " + max + " is the greastest");
    }
}
