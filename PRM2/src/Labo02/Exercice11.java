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
public class Exercice11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type your first number : ");
        int firstNumber = scan.nextInt();
        
        System.out.print("Type your second number : ");
        int secondNumber = scan.nextInt();
        
        System.out.print("Type your third number : ");
        int thirdNumber = scan.nextInt();
        int firsMax = 0;
        int secondMax = 0;
        
        if(firstNumber > secondNumber){
            firsMax = firstNumber;
            if(firstNumber < thirdNumber){
                secondMax = thirdNumber;
            } else {
                secondMax = secondNumber;
            }
        } else{
            firsMax = secondNumber;   
            if(firstNumber > thirdNumber){
                secondMax = firstNumber;
            } else {
                secondMax = thirdNumber;
            }
        }
        System.err.println(firsMax + " and " + secondMax + " are the two greastest numbers");
    }
}
