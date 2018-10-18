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
public class Exercice04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the first number : ");
        int a = scan.nextInt();
        System.out.print("Type the second number : ");
        int b = scan.nextInt();
        
        System.out.println("Before reversing : ");
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);
        
        int temp = a;
        a = b;
        b = temp;
        
        System.out.println("After reversing : ");
        System.out.print(a);
        System.out.print(" ");
        System.out.println(b);
    }
}
