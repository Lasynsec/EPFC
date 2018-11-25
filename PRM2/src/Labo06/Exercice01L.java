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
public class Exercice01L {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Please type a length for your figurei : ");
        int length = scan.nextInt();

        for (int line = 0; line < length; ++line) {
            for (int column = 1; column < (2 * (length)); ++column) {
                /*if(column > line && (column +line <= length)){
                    System.out.print(column);
                }else{
                    System.out.print(" ");
                }*/
                System.out.print(column);
            }

            System.out.println(line);
        }
    }
}
