/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo02;

import java.util.Scanner;
/**
 *
 * @author 2207hembilo
 */
public class Exercice16 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        boolean IsLeap = true;
        
        System.out.print("Type a year : ");
        int year = scan.nextInt();
        
        if((year % 4 != 0 || year % 400 != 0)  && year % 100 == 0 ){
            System.out.println("the year is not a Leap year");
        } else {
            System.out.println("the year is a Leap year");
        }
    }
}
