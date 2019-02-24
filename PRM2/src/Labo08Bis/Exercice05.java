/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo08Bis;

import seqint.SeqInt;
import seqint.SeqIntIterator;
import java.util.Scanner;

/**
 *
 * @author 2207hembilo
 */
public class Exercice05 {
    
    public static int LG(){
        Scanner scan = new Scanner(System.in);
        int userInput = 0;
        do{
            System.out.print("Please type a number greater than 0 : ");
            userInput = scan.nextInt();
            
            if(userInput < 0){
                System.out.println("Your number must be greater than 0");
            }
        }while(userInput <= 0);
        
        return userInput;
    }
    
    public static int getPlateGreaterOrEqualToLG(SeqInt s, int userValue){
        int nbOfPlateGreaterOrEqualToLG = 0;
        SeqIntIterator it = s.iterator();
        
        if(it.hasNext()){
            int sizeOfCurrentPlate = 1;
            int currentValue = it.next();
            while(it.hasNext()){
                int precedentValue = currentValue;
                currentValue = it.next();
                
                if(currentValue == precedentValue){
                    ++sizeOfCurrentPlate;
                }else{
                    sizeOfCurrentPlate = 1;
                }
                
                if(sizeOfCurrentPlate == userValue){
                    ++nbOfPlateGreaterOrEqualToLG;
                }
             }
        }
        
        return nbOfPlateGreaterOrEqualToLG; 
    }
    public static void main(String[] args) {
        
        SeqInt s = new SeqInt(5,6,6,8,9,5,9,3,3,6,7,8,8,8);
        int userValue = LG();
         int result = getPlateGreaterOrEqualToLG(s,userValue);
        System.out.println("There are " + result + " plates of size " + userValue + " or more.");
    }
}
