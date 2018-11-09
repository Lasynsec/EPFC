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
public class Exercice06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type thenumber of values : ");
        int userInput = scan.nextInt();
        int numberOfValues = userInput;
        double positivesValues = 0;
        
        int sumOfValues = 0;
        
        for(int i = 0; i < numberOfValues; ++i){
            System.out.print("Type the value number "+ (i+1) + " : ");
            userInput = scan.nextInt();
            
            if(userInput > 0){
                sumOfValues += userInput;
                ++positivesValues;
            }
        }
        
        System.out.println("the average is " + (double) (sumOfValues / positivesValues));
    }
}
