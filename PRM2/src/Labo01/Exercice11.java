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
public class Exercice11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the first number : ");
        int a = scan.nextInt();
        System.out.print("Type the second number : ");
        int b = scan.nextInt();
        System.out.print("Type the third number : ");
        int c = scan.nextInt();
        System.out.print("Type the fourth number : ");
        int d = scan.nextInt();
        
        System.out.println("Before the cyclic permutation : ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.print(c);
        System.out.print(" ");
        System.out.println(d);
        
        int temp = d;
        d = c;
        c = b;
        b = a;
        a = temp; 
        
        System.out.println("After the cyclic permutation : ");
        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.print(c);
        System.out.print(" ");
        System.out.println(d);
    }
}
