/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo07;

import java.util.Scanner;
/**
 *
 * @author 2207hembilo
 */
public class Exercice04 {
    public static boolean whichIsEven(int nbr) {
        boolean isEven;
        if (nbr % 2 == 0) {
            isEven = true;
        } else {
            isEven = false;
        }
        return isEven;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type your number : ");
        int userInput = scan.nextInt();

        if (whichIsEven(userInput)) {
            System.out.println("The number is an even number");
        } else {
            System.out.println("The number is an odd number");
        }
    }
}