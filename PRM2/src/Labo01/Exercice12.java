/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo01;

import java.util.Scanner;

/**
 *
 * @author herve
 */
public class Exercice12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the hour of the starting time : ");
        int startingHour = scan.nextInt();
        System.out.print("Type the minutes of the starting time : ");
        int startingMinutes = scan.nextInt();
        System.out.print("Type the hour of the finishing time : ");
        int finishingHour = scan.nextInt();
        System.out.print("Type the minutes of the finishing time : ");
        int finishingMinutes = scan.nextInt();
        
        int totalStartingMinutes = (startingHour * 60) + startingMinutes;
        int totalFinishingMinutes = (finishingHour * 60) + finishingMinutes;
        
        int durationMinutesTime = totalFinishingMinutes - totalStartingMinutes;
        int durationHour = durationMinutesTime / 60;
        int durationMinutes = durationMinutesTime % 60;
        
        System.out.println("The duration is " + durationHour + " hour(s): " + durationMinutes + " minute(s)");
        
        
    }
}
