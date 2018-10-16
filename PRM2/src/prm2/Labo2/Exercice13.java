/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRM2.Labo2;

import  java.util.Scanner;

/**
 *
 * @author 2207hembilo
 */
public class Exercice13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the hour : ");
        int getHour = scan.nextInt();
        System.out.print("Type the minutes : ");
        int getMin = scan.nextInt();
        
        int totalMin = (getHour*60) + getMin;
        
        System.out.println("The total minutes is " + totalMin);
        
        System.out.println("");
    }
}
