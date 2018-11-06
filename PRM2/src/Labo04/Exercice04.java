/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo04;

import java.util.Scanner;
/**
 *
 * @author 2207hembilo
 */
public class Exercice04 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       
        System.out.print("Type the number of values : ");
        int userInput = scan.nextInt();
        int nbrOfValues = userInput;
        int smallestValue = userInput;
        
        for(int i = 1; i <= nbrOfValues; ++i){
            System.out.print("Type the value number " + i + " : ");
            userInput = scan.nextInt();
            
            if(userInput < smallestValue){
                smallestValue = userInput;
            }
        }
        System.out.println("------------------------------------------");
        System.out.println("The smallest number is : " + smallestValue);
    }
}
