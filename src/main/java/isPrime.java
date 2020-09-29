
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mdpra
 */
public class isPrime {
    public static void main(String[] args) {
    //Ask the user for an integer
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter an integer: ");
    int number = keyboard.nextInt(); 
    
    //Use the isPrime method to test if the number is prime and display the results
    if (isPrime(number)) {
        System.out.println("The number is prime");
    }
    else 
        System.out.println("The number is not prime");
        
    }
    //Write a method to test if a number is prime
    public static boolean isPrime(int number) {
        //find out how many numbers evenly go into the test number
        int NumberOfFactors = 0;
        for (int i = 1; i <= number; i++) {
            if((number % i == 0)) {
            NumberOfFactors++;
            }
           }
        //If the number has more than 2 factors, it is not prime
        if (NumberOfFactors > 2) {
            return false;  
            }
        else { 
            return true;
            }
        }
  
}
