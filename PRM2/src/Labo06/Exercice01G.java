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
public class Exercice01G {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        
        System.out.print("Please type a number : ");
        int length = scan.nextInt();
        int lengthBis = length;
        for(int line = 0; line < length; ++line){
            for(int column = 1; column < length;++column){
                
                    if(column+line >= length){
                        System.out.print("X");   
                    }else {
                        System.out.print(" "); 
                    }
                    System.out.print(" ");
            }
            System.out.println("X");
        }
    }
}
