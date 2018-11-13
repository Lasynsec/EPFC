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
public class Exercice01B {
    public static void main(String[] args) {
        System.out.print("Type the length of the square : ");
        Scanner scan = new Scanner(System.in);
        
        int length = scan.nextInt();
        
        for(int i = 0; i < length; ++i){
            for(int y = 0; y < length; ++y){
              if(y == 0 || y == length || i == 0 || i == length-1){
                    System.out.print("X");
              }else{
                   System.out.print(" ");
              }
            }
            System.out.println("X");
        }
    }
}
