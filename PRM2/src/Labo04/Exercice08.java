/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo04;

import java.util.Scanner;

/**
 *
 * @author herve
 */
public class Exercice08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please type a number for the base : ");
        int base = scan.nextInt();
        
        System.out.print("Please type a number for the exponent : ");
        int exponent = scan.nextInt();
        
        while(base == 0  && exponent == 0){
            System.out.println("The base and the exponent must not be equal to 0");
            
            System.out.print("Please type a number for the base : ");
            base = scan.nextInt();
        
            System.out.print("Please type a number for the exponent : ");
            exponent = scan.nextInt();
        }
        
        boolean isNegative = false;
        
        if(exponent < 0){
            exponent = -exponent;
            isNegative = true;
        }
        double exponential = 1;
 
        for(int i = 0; i < exponent; ++i){
            exponential *= base; 
        }    
        System.out.println("exponential : " + exponential);
        
        if(isNegative)
            exponential = (double) 1/exponential;

        System.out.println(base + "^" + exponent + " = " + exponential);
    }
}
