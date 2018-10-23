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
public class Exercice07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int k = 0;
        int lastValue = 0;
        boolean stopIt = false;
         System.out.print("Type the value number " + (k+1) + " : ");
         int userInput = scan.nextInt();
        
        while(!stopIt) {
            System.out.print("Type the value number " + (k+1) + " : ");
            userInput = scan.nextInt();
            
            if(userInput == -1){
                stopIt = true;
            } else {
                 lastValue = userInput;
            }
            ++k;
        }
        System.out.println("The last value is " + lastValue);
    }
}
