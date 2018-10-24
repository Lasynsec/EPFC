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
public class Exercice03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean isNotCorrect = true;
        int nbrOfValues = 0;
        
        while(isNotCorrect){
            System.out.print("Type the number of value to calculate : ");
            nbrOfValues = scan.nextInt();
            
            if(nbrOfValues > 0){
                isNotCorrect = false;
            } else {
                System.out.println("The number of values must be greater than 0");
            }
        }
        int k = 0;
        double valuesToCalulate = 0;
        
        while(k < nbrOfValues) {
            System.out.print("Type the value number " + (k+1) + " : ");
            valuesToCalulate += scan.nextInt();
            ++k;
        }
        double average = valuesToCalulate/nbrOfValues;
        System.out.println("The average is " + average);
    }
}
