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
public class Exercice01D {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please type the length of the square : ");
        int length = scan.nextInt();
        
        int line = 0;
        for(int i = 0; i < length; ++i){
            for(int y = 1; y < length; ++y){
                
                if(i == (y-1)){
                    System.out.print(" ");
                    //System.out.print(y);
                }else if (i == -y+(length)){
                    System.out.print(" ");
                    //System.out.print(y);
                }else {
                    System.out.print("X");
                }
                line = y;
            }
            if(i == line || i == 0){
                System.out.println(" ");
                //System.out.println(i);
           }else {
                System.out.println("X");
            }
        }
    }
    
}
