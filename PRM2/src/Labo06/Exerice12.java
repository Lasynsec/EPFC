/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo06;

import java.util.Scanner;

/**
 *
 * @author herve
 */
public class Exerice12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int userInput;
        boolean areIncreasing = true;
        int count = 1;
        int previousInput = -1;
        
        do{
            System.out.print("Type the value number (" + count + ") : ");
            userInput = scan.nextInt();
            
            if (userInput != -1) {
                if (userInput < previousInput) {
                    areIncreasing = false;
                } else {
                    previousInput = userInput;
                }
                ++count;
            }
         
        }while(userInput != -1 && areIncreasing);
        
        if(areIncreasing){
             System.out.println("The numbers are increasing");
        }else{
             System.out.println("The numbers are not increasing");
        }
    }
}
