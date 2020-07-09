/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExceptionHandling {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        boolean tryAgain=true;
        do {
        try 
        {
        System.out.println("Enter a numerator");
        int n = s.nextInt();
        System.out.println("Enter a denominator");
        int d = s.nextInt();
        int r = n / d;
        System.out.println("The answer is: " + r);
        tryAgain=false;
        }
        
        catch(Exception e)
        {
            System.out.println("Error Type " + e);
            System.out.println("Divide by zero is not allowed, Try again.");
            s.nextLine();
        }
        } while (tryAgain);
        }
    }
    
