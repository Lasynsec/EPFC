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
public class Exercice01 {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        
        int nbrOfValues = 0;
        do{
            System.out.print("Type a number of values : ");
            nbrOfValues = scan.nextInt();
            
            if(nbrOfValues < 0)
                System.out.println("Please type a number greater than 0");
        }while(nbrOfValues < 0);
        
        int i = 0;
        int userInput = 0;
        double sumOfValues = 0;
        do{
            ++i;
            System.out.print("Type the value number " + i + " : " );
            userInput = scan.nextInt();
            
            sumOfValues += userInput;
        }while(i < nbrOfValues);
        
        System.out.println("The average is " + (sumOfValues/nbrOfValues));
    }
}
