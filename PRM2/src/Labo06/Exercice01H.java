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
public class Exercice01H{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please type a length for the figure : ");
        int length = scan.nextInt();
        
        for(int line = 0; line < length; ++line){
            for(int column = 1; column < length; ++column){
                if((column - line) > 0){
                    System.out.print(column);
                } else {
                     System.out.print(" ");
                }
            }
            System.out.println(line);
        }
    }
    
}
