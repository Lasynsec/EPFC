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
public class Exercice06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the first number : ");
        int nbrOne = scan.nextInt();
        
        System.out.print("Type the second number : ");
        int nbrTwo = scan.nextInt();
        
        int minus = 1;
        if(nbrOne < 0){
            nbrOne  = -nbrOne;
            minus = -1;
        }
        
        int result = 0;
        for(int count = 0; count < nbrOne; ++count){
            result += nbrTwo;
        }
        System.out.println("The multiplication of " + nbrOne + " and " + nbrTwo + " is " + (minus*result));
    }
}
