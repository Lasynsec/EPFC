/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo01;

import java.util.Scanner;

/**
 *
 * @author herve
 */
public class Exercice02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type a number : ");
        int a = scan.nextInt();
        
        if (a > 0){
            if(a > 1){
                System.out.println("To many");
            }else {
                System.out.println("One");
            }
        }else {
            System.out.println("not many");
        }
        
    }
}
