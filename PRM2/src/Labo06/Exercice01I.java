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
public class Exercice01I {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("PLease type a length for the figure : ");
        int length = scan.nextInt();
        int lineLength = 0;
        
        for(int line = 0; line < length; ++line){
            for(int column = 1; column < (1+2*(length-1));++column){
                if(((column + line) >= length) && (column <= (line+length))){
                    System.out.print(column);    
                } else {
                    System.out.print(" ");
                }
            }
            
            if(line == length -1 ){
                System.out.println(line);
            }else {
                System.out.println(" ");
            }
        }
    }
}