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
public class Exercice01A {
    public static void main(String[] args) {
        
        System.out.print("Type the length of that square : ");
        Scanner scan = new Scanner(System.in);
        
        int length = scan.nextInt();
        //int weight = scan.nextInt();
        
        for(int i = 0; i < length; ++i){
            for(int y = 1; y < length; ++y){
                System.out.print("X");
            }
            System.out.println("X");
        }
    }
}
