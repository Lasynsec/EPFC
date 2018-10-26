/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo03;

import java.util.Scanner;

/**
 *
 * @author herve
 */
public class Exercice07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Please type a number greater than 0");
        int userNumber = scan.nextInt();
        
        while(userNumber <= 0){
            
            if(userNumber <= 0){
                System.out.println("Please type a number greater than 0");
            }
            System.out.println("Please type a number greater than 0");
            userNumber = scan.nextInt();
        }
        
        
    }
}
