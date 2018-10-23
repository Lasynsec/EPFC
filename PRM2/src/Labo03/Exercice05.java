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
public class Exercice05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int k = 0;
        double valuesToCalulate = 0;
        boolean stopIt = false;
        int userInput = 0;
        
        while(!stopIt) {
            System.out.print("Type the value number " + (k+1) + " : ");
            userInput = scan.nextInt();
            
            if(userInput == -1){
                stopIt = true;
            } else {
                 valuesToCalulate += userInput;
            }
            ++k;
        }
        double average = valuesToCalulate/k;
        System.out.println("The average is " + average);
    }
}
