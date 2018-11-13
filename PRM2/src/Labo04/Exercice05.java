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
public class Exercice05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the number of values : ");
        int userInput = scan.nextInt();
        int nbrOfValues = userInput;
        
        int positifs = 0;
        int negatifs = 0;
        int nulls = 0;
        
        for(int i = 1; i <= nbrOfValues; ++i){
            System.out.print("Type the value number " + i + " : ");
            userInput = scan.nextInt();
            
            if(userInput < 0){
                ++negatifs;
            }else if(userInput > 0){
                ++positifs;
            } else {
                ++nulls;
            }
        }
        System.out.println("negatifs : " + negatifs);
        System.out.println("positifs : " + positifs);
        System.out.println("nulls : " + nulls);
    }
}
