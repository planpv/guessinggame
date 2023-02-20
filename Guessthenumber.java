/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guessthenumber;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author pplan
 */
public class Guessthenumber {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random randomNum = new Random();
        
        int random;
        int guesses;
        int attempts; 
        
        random = randomNum.nextInt(100) + 1;
        attempts = 1;
        
        System.out.println("Guess a number between 1 and 1000.");
        
        guesses = scanner.nextInt();
        while (guesses != random) {
            if (guesses > random) {
                System.out.print("Lower");
                attempts += 1;
            }
            else {
                System.out.print("Higher");
                attempts += 1;
            }
        }
       System.out.print(random + "Is the magic number! " + attempts +
               "attempts were made to fullfill the magic numbers needs!");
    }
}
