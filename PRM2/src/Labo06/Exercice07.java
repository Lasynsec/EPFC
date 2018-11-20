/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo06;

import java.util.Scanner;
/**
 *
 * @author 2207hembilo
 */
public class Exercice07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cpt = 1;
        
        System.out.print("Type the value to search : ");
        int valueToFind =  scan.nextInt();
       
        
        System.out.print("Type the value number " + cpt+" : ");
        int userInput = scan.nextInt();
        
        int nbrOfMatch = 0;

        do{
            ++cpt;
            System.out.print("Type the value numbner " + cpt+ " : ");
            userInput = scan.nextInt();
            
            if(userInput == valueToFind && userInput != -1){
                ++nbrOfMatch;
            }
        }while(userInput != -1);
        if(nbrOfMatch > 0){
            System.out.println("The number  " + valueToFind + "have " + nbrOfMatch + " instance.");
        }else{
             System.out.println("The number  " + valueToFind + " have no instance");
        }
    }
}
