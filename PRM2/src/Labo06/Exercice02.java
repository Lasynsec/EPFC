/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo06;

import java.util.Scanner;

/**
 *
 * @author 2207hembilo
 */
public class Exercice02 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int old = 0;
        int recent = 1;
        int fiboCalc = 1;

        System.out.print("Type a number of fibo : ");
        int nthFibo = scan.nextInt();

        System.out.println(fiboCalc);
        for (int i = 1; i <= nthFibo; ++i) {
            fiboCalc = recent + old;
            old = recent;
            recent = fiboCalc;
            System.out.println(fiboCalc);   
        }
    }
}
