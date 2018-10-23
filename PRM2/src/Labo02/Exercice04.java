/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo02;

import com.sun.glass.ui.SystemClipboard;
import java.util.Scanner;
/**
 *
 * @author herve
 */
public class Exercice04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Type the firs number : ");
        int firstNumber = scan.nextInt();
        System.out.print("Type the first number : ");
        int secondNumber = scan.nextInt();
        
        int result = 0;
        if(firstNumber > secondNumber){
            result = firstNumber -secondNumber;
        }else {
            result = secondNumber - firstNumber;
        }
        
        System.out.println("The result is " + result);
    }
}
