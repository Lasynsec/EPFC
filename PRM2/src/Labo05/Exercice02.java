/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo05;

import java.util.Scanner;
/**
 *
 * @author 2207hembilo
 */
public class Exercice02 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
  
        int userInput = 0;
        int sentinel = -1;
        int sumOfInput = 0;
        int i = 0;
        
        do{
            
            System.out.print("Type the value number " + (i+1) + " : ");
            userInput = scan.nextInt();
            
            if(userInput != sentinel){
                sumOfInput += userInput;
                ++i;
            }
        }while(userInput != sentinel);
        
        System.out.println("The average is ("+sumOfInput+"/"+i+") = " + (double) (sumOfInput/i));
    }
}
