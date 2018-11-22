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
public class Exercice01E {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please type the length :");
        int length = scan.nextInt();
        
        boolean isIncluded = true;
        for(int line = 0; line < length; ++line){
            for(int column = 1; column < length; ++column){
                if((line == column - 1) || isIncluded){
                    System.out.print(column);
                    if(line == column - 1){
                        isIncluded = false;
                    }
                }else {
                    System.out.print(" ");
                }
            }
            isIncluded = true;
            if(line == length -1){
                System.out.println(line);   
            }else{
                System.out.println(" ");
            }
        }
              
        
    }
}
