/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo06;

import java.util.Scanner;
import javax.sound.midi.SysexMessage;

/**
 *
 * @author herve
 */
public class Exercice01K {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Please type a length for the figure : ");
        int length = scan.nextInt();

        for (int line = 0; line < length; ++line) {
            for (int column = 1; column < length; ++column) {

                if (line < (length / 2)) {
                    if (column > line &&(column + line) < length+1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("X");
                    }
                } else if (column == ((length / 2) + 1) && line == (length / 2)) {
                    System.out.print(" ");
                } else if (line > (length / 2)) {
                    if (column + line >= length && column <= line+1) {
                        System.out.print(" ");
                    } else {
                        System.out.print("X");
                    }
                } else {
                     System.out.print("X");
                }
            }
            if (line == 0 || line == length - 1) {
                System.out.println(" ");
            } else {
                System.out.println("X");
            }
        }
    }
}
