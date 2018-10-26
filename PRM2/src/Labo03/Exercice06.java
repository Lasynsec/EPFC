/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo03;

import java.util.Scanner;
/**
 *
 * @author 2207hembilo
 */
public class Exercice06 {
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the limit number : ");
        int limitNumber = scan.nextInt();
        
        while(limitNumber <= 0){
     
            if(limitNumber <= 0){
                System.out.println("Please type a number greater than 0 !");
            }
            System.out.print("Type the limit number : ");
            limitNumber = scan.nextInt();
        }
        
        int k = 1;
        
        if(limitNumber != 1){
            while( (k*k) < limitNumber){
                System.out.print(k+" ");
                ++k;
            }
        } else {
            System.out.print("1");
        }
         System.out.println("");
    }
}
