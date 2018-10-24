/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo02;

import java.util.Scanner;

/**
 *
 * @author herve
 */
public class Exercice06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type a number between 1 and 10 : ");
        int userNumber = scan.nextInt();
        
        if(userNumber >= 0 && userNumber <= 10 ){
            System.out.println(userNumber +" is in the range");
        } else {
           System.out.println(userNumber + " is not in the range");
                   
        }
    }
}
