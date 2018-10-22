/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author 1794054
 */
public class JavaApplication3 {
    //private static Object randomObj;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner Keyboard =new Scanner(System.in); 
        int i = 0;
       int number;
        int k;
        System.out.println("How many number?");
        i=Keyboard.nextInt();
       
        Random randomobj= new Random();
       
         for (k=0;k<i;k++){  
            
           number = randomobj.nextInt(800);
            
            
        if (number%2==0){
            System.out.println(" Number is even " + number);
        }
        else{
            System.out.println(" Number is odd " + number);
        }
           
    }
        // TODO 
    }
    
}
