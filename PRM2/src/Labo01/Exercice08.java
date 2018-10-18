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
public class Exercice08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the firs number : ");
        int a = scan.nextInt();
        System.out.print("Type the first number : ");
        int b = scan.nextInt();
        System.out.print("Type the first number : ");
        int c = scan.nextInt();
        
        System.out.println("Before reversing : ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.println(c);
        
        a = a + c;
        c = a - c;
        a = a - c;
        
        System.out.println("After reversing : ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.println(c);
    }
}
