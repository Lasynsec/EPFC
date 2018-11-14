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
public class Exercice03 {
    public static void main(String[] args) {
         Scanner scan =  new Scanner(System.in);
  
        int userInput = 0;
        int sentinel = -1;
        int lastInput = 0;
        int i = 0;
        
         do{
            System.out.print("Type the value number " + (i+1) + " : ");
            userInput = scan.nextInt();
            if(userInput == -1){
              System.out.println("No -1 asshole !!");
            }else {
              ++i;
            }
          }while(userInput == -1);
        
        do{
            
            System.out.print("Type the value number " + (i+1) + " : ");
            userInput = scan.nextInt();
            
            if(userInput != sentinel){
                lastInput = userInput;
                ++i;
            }
        }while(userInput != sentinel);
        
        System.out.println("The last input is " + lastInput);
    }
}
