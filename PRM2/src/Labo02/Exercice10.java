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
public class Exercice10 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the firs number : ");
        int firstNumber = scan.nextInt();
        System.out.print("Type the second number : ");
        int secondNumber = scan.nextInt();
        System.out.print("Type the third number : ");
        int thirdNumber = scan.nextInt();
        
        System.out.println("Before reversing");
        System.out.print(firstNumber);
        System.out.print(" ");
        System.out.print(secondNumber);
        System.out.print(" ");
        System.out.println(thirdNumber);
        
        int tempVar = 0;
        
         if(firstNumber < secondNumber && secondNumber > thirdNumber){
             if(secondNumber > thirdNumber && firstNumber < thirdNumber){
                secondNumber = secondNumber + thirdNumber;
                thirdNumber = secondNumber - thirdNumber;
                secondNumber = secondNumber - thirdNumber;
            } else {
              tempVar = thirdNumber;
              thirdNumber = secondNumber;
              secondNumber = firstNumber;
              firstNumber = tempVar;
            }
         } else{
             if(firstNumber > secondNumber){
                if(secondNumber < thirdNumber){
                    tempVar = firstNumber;
                    firstNumber = secondNumber;
                    secondNumber = thirdNumber;
                    thirdNumber = tempVar;
                } else {
                    firstNumber = firstNumber + thirdNumber;
                    thirdNumber = firstNumber - thirdNumber;
                    firstNumber = firstNumber - thirdNumber;

                }
             }
         }
        System.out.println("after reversing");
        System.out.print(firstNumber);
        System.out.print(" ");
        System.out.print(secondNumber);
        System.out.print(" ");
        System.out.println(thirdNumber);
    }
}