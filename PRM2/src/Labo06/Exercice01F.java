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
public class Exercice01F {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please type the length :");
        int length = scan.nextInt();
        int lineLength = length;
        for (int line = 0; line <= lineLength; ++line) {
            for (int column = 1; column < length; ++column) {
                    System.out.print(column);
            }
            if (line > 0) {
                --length;
            }
                   // System.out.println("Length is " + length);
            if(line == 0) {
                System.out.println(line);
            } else {
                System.out.println(" ");
            }
        }

    }
}
