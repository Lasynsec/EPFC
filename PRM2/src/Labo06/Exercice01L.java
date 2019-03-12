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
public class Exercice01L {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please type a length for your figurei : ");
        int length = scan.nextInt();
        int column = 1;
        for (int line = 0; line < length; ++line) {
            while(column < length) {
                if(column > 0){
                    System.out.print(column);
                } else {
                    System.out.print(" ");
                }                
                    ++column;              
            }

            System.out.println(line);
            column = -line;
        }
    }
}
