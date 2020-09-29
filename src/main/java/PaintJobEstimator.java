
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kylep
 */
public class PaintJobEstimator {
    public static void main(String[] args) {
        //Get the Number of Rooms from the User  
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the number of rooms: ");
        double Rooms = keyboard.nextDouble(); 
        
        //Get the square footage of the rooms from the user 
        double SquareFootage = 0; 
        for (int i = 1; i <= Rooms; i++) {
            System.out.println("Enter the Square footage of Room " + i);
            SquareFootage += keyboard.nextDouble();
        }
        
        //Get the price of the paint per gallon from the user 
        System.out.println("Enter the price of paint per gallon: ");
        double PaintPrice = keyboard.nextDouble(); 
        
        //Use NumberofGallons method to get the number of gallons needed and display it
        double GallonsRequired = NumberofGallons(SquareFootage); 
        System.out.printf("The number of gallons of paint required is: %.2f gallons", GallonsRequired);
       
        //Use the NumberOfHours method to get the number of labor hours required and display it
        double HoursRequired = NumberOfHours(SquareFootage);
        System.out.printf("\nThe number of labor hours required is: %.2f hours", HoursRequired);
        
        //Use the CostOfPaint method to get the total cost of the paint for the job and display it
        double PaintCost = CostOfPaint(PaintPrice, GallonsRequired);
        System.out.printf("\nThe cost of the paint is: $%.2f", PaintCost);
        
        //Use the CostOfLabor method to get the total cost of labor for the job and display it
        double LaborCost = CostOfLabor(HoursRequired);
        System.out.printf("\nThe cost of labor is: $%.2f", LaborCost);
        
        //Use the CostOfJob method to get the total cost of the job and display it
        double TotalCost = CostOfJob(PaintCost, LaborCost); 
        System.out.printf("\nThe total cost of the job is: $%.2f", TotalCost);
    }
    //Create a method to calculate the number of gallons required. 
    public static double NumberofGallons(double SquareFootage) {
        return (SquareFootage/115);
    }
    //Create a method to calculate the number of labor hours required
    public static double NumberOfHours(double SquareFootage) {
        return ((SquareFootage/115) * 8);
        }
    //Create a method to calculate the cost of the paint 
    public static double CostOfPaint(double PaintPrice, double GallonsRequired) {
        return (PaintPrice * GallonsRequired ); 
    }
    //Create a method to calculate the cost of labor
    public static double CostOfLabor(double HoursRequired) {
        final double LABOR_PRICE = 18; 
        return HoursRequired * LABOR_PRICE;
    }
    //Create a method to calculate the total cost of the job 
    public static double CostOfJob(double PaintCost, double LaborCost) {
        return (PaintCost + LaborCost);
    }
}

