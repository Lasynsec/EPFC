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
public class Exercice02 {
    
    public static double average(double one, double two)
    {
            double avg = (one + two) / 2;
            
            return avg;
    }
    
    public static void main(String[] args) {
        System.out.println(average(10.0,5.0));
    }
}
