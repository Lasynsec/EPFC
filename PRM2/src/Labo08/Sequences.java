/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Labo08;

import seqint.*;

/**
 *
 * @author 2207hembilo
 */
public class Sequences {
    public static void affiche(SeqInt s){
        SeqIntIterator it = s.iterator();
        System.out.println("[");
        
        if(it.hasNext()){
            System.out.println(it.next());
            while (it.hasNext()) {
                System.out.print(", "+ it.next());
            }
            System.out.println("]");
        }
    }
    
    public static void main(String[] args) {
        
    }
   
}
