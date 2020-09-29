
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylep
 */
public class EvenOddCounter {
    public static void main(String[] args) {
    // Create a new Random class and declare variables and counters
        Random myRandom = new Random();
        int number = 0;
        int EvenNumbers = 0; 
        int OddNumbers = 0;
    //Generate 100 Random numbers 
        for (int i = 1; i <= 100; i++) {
            number = myRandom.nextInt();
            System.out.println(number);
    //Use isEven method to test if number is odd or even and add it to the counter
            if (isEven(number)) {
                EvenNumbers++;
                }
            else {
                OddNumbers++;
                }
         }
    //Display the Results 
       System.out.println("There were " + EvenNumbers + " even numbers");
       System.out.println("There were " + OddNumbers + " odd numbers");
    }
    //Create an isEven method that tests if a number is odd or even (divisible by 2)
    public static boolean isEven(int number) {
        if ((number % 2)== 0) {
            return true;
            }
        else {
            return false;
            }
    }
 
}
