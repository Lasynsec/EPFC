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
public class Exercice13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type first number : ");
        int sum = scan.nextInt();
        System.out.print("Type the second : ");
        sum += scan.nextInt();
        System.out.print("Type the third : ");
        sum += scan.nextInt();
        System.out.print("Type the fourth : ");
        sum += scan.nextInt();
        
        
        System.out.println("The sum is " + sum);
    }
}
